package hu.gergelyurban.bollerbweb.controller;

import hu.gergelyurban.bollerbweb.dto.TeamDto;
import hu.gergelyurban.bollerbweb.service.TeamService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teams")
@RequiredArgsConstructor
public class TeamController {
    
    private final TeamService teamService;
    
    @GetMapping
    public List<TeamDto> getTeams() {
        return teamService.getTeams();
    }
    
    @GetMapping("/{name}")
    public TeamDto getTeamByName(@PathVariable("name") String name) {
        return teamService.getTeamByName(name);
    }
    
    @PostMapping
    public TeamDto createTeam(@RequestBody TeamDto team) {
        return teamService.saveTeam(team);
    }
    
    @PutMapping
    public TeamDto editTeam(TeamDto team) {
        return teamService.editTeam(team);
    }
    
    @DeleteMapping("/{name}")
    public void deleteTeam(@PathVariable("name") String name) {
        teamService.deleteTeam(name);
    }
    
}