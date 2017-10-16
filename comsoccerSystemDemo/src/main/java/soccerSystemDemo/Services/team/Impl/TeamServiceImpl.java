package soccerSystemDemo.Services.team.Impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import soccerSystemDemo.Domain.Team;
import soccerSystemDemo.Repositories.TeamRepository;
import soccerSystemDemo.Services.team.TeamService;

/**
 * Created by L.z Double E on 8/14/2017.
 */
@Component
public class TeamServiceImpl implements TeamService {

    @Autowired
    private TeamRepository repository;


    @Override
    public Team create(Team entity)
    {
        return repository.save(entity);
    }

    @Override
    public Team readById(String s)
    {
         return repository.findOne(s);
    }

    @Override
    public Team update(String s)
    {
        return null;
    }
}
