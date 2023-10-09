package hu.gergelyurban.bollerbweb.service;

import hu.gergelyurban.bollerbweb.dto.TeamDto;

import java.util.List;

public interface TeamService {
    
    List<TeamDto> getTeams();
    
    TeamDto getTeamByName(String name);
    
    TeamDto saveTeam(TeamDto team);
    
    TeamDto editTeam(TeamDto team);
    
    void deleteTeam(String name);
    
}