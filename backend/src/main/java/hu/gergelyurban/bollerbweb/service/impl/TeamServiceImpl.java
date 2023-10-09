package hu.gergelyurban.bollerbweb.service.impl;

import hu.gergelyurban.bollerbweb.dto.TeamDto;
import hu.gergelyurban.bollerbweb.entity.TeamEntity;
import hu.gergelyurban.bollerbweb.repository.TeamRepository;
import hu.gergelyurban.bollerbweb.service.TeamService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TeamServiceImpl implements TeamService {

    private final TeamRepository teamRepository;

    public List<TeamDto> getTeams() {
        return teamRepository.findAll().stream().map(TeamEntity::getDto).toList();
    }

    public TeamDto getTeamByName(String name) {
        return teamRepository.findByName(name).orElseThrow().getDto();
    }

    public TeamDto saveTeam(TeamDto team) {
        return teamRepository.save(mapDtoToEntity(team)).getDto();
    }

    public TeamDto editTeam(TeamDto team) {
        var entity = teamRepository.findByName(team.getName()).orElseThrow();
        return entity.getDto();
    }

    public void deleteTeam(String name) {
        teamRepository.deleteByName(name);
    }
    
    private TeamEntity mapDtoToEntity(TeamDto dto) {
        return TeamEntity.builder()
        .name(dto.getName())
        .registrationTime(LocalDateTime.now())
        .build();
    }
    
}