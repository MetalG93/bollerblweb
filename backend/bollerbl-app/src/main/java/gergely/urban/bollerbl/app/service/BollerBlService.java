package gergely.urban.bollerbl.app.service;

import gergely.urban.bollerbl.domain.Artist;
import gergely.urban.bollerbl.domain.Box;
import gergely.urban.bollerbl.domain.Guest;
import gergely.urban.bollerbl.domain.Team;
import gergely.urban.bollerbl.domain.User;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import gergely.urban.bollerbl.repositories.ArtistRepository;
import gergely.urban.bollerbl.repositories.BoxRepository;
import gergely.urban.bollerbl.repositories.GuestRepository;
import gergely.urban.bollerbl.repositories.TeamRepository;
import gergely.urban.bollerbl.repositories.UserRepository;

import java.util.ArrayList;
import java.util.List;

public class BollerBlService {
    private static final Logger LOGGER = LoggerFactory.getLogger(BollerBlService.class);

    ArtistRepository artistRepository;
    BoxRepository boxRepository;
    GuestRepository guestRepository;
    TeamRepository teamRepository;
    UserRepository userRepository;

    @Autowired
    public void setArtistRepository(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

    @Autowired
    public void setBoxRepository(BoxRepository boxRepository) {
        this.boxRepository = boxRepository;
    }

    @Autowired
    public void setGuestRepository(GuestRepository guestRepository) {
        this.guestRepository = guestRepository;
    }

    @Autowired
    public void setTeamRepository(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    //ARTIST
    public List<Artist> findArtists() {
        Iterable<Artist> daoArtists = artistRepository.findAll();
        List<Artist> artists = new ArrayList<>();
        daoArtists.forEach(artist -> artists.add(artist));

        return artists;
    }

    public void saveArtist(Artist artist) {
        artistRepository.save(artist);
    }

    //GUEST

    public void saveGuest(Guest guest) {
        guestRepository.save(guest);
    }

    //TEAM
    public List<Team> findTeams() {
        Iterable<Team> daoTeams = teamRepository.findAll();
        List<Team> teams = new ArrayList<>();

        daoTeams.forEach(team -> teams.add(team));

        return teams;
    }

    public void saveTeam(Team team) {
        teamRepository.save(team);
    }

    //USER
    public List<User> findUsers() {
        Iterable<User> daoUsers = userRepository.findAll();
        List<User> users = new ArrayList<>();

        daoUsers.forEach(user -> users.add(user));

        return users;
    }

    public void saveUser(User user) {
        userRepository.save(user);
    }

    //BOX
    public void saveBox(Box box) {
        boxRepository.save(box);
    }
}
