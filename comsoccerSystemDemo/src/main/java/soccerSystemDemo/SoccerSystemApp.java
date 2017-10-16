package soccerSystemDemo;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import soccerSystemDemo.Domain.Team;
import soccerSystemDemo.Factories.TeamFactory;
import soccerSystemDemo.Services.team.TeamService;

/**
 * Created by L.z Double E on 10/16/2017.
 */
@RestController
@RequestMapping(value = "/team")
public class SoccerSystemApp {
    @Autowired
    private TeamService teamService;

    //Read all Teams
    @RequestMapping(value ="/add/{name}/{players}/{manager}/{location}")
    public @ResponseBody
    String addTeam(@PathVariable String name, @PathVariable  int players, @PathVariable String manager, @PathVariable String location)
    {
        Team team = TeamFactory.buildTeam(name, players, manager, location);
        teamService.create(team);

        return new Gson().toJson(team);
    }
}
