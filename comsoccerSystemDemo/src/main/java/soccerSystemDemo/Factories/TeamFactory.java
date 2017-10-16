package soccerSystemDemo.Factories;


import soccerSystemDemo.Domain.Team;
import soccerSystemDemo.utility.KeyGenerator;

/**
 * Created by L.z Double E on 8/14/2017.
 */
public class TeamFactory {

    public static Team buildTeam(String name, int players, String manager, String location)
    {
        Team team = new Team.Builder()
                .players(players)
                .id(KeyGenerator.getEntityId())
                .name(name)
                .manager(manager)
                .location(location)
                .build();
        return team;
    }
}
