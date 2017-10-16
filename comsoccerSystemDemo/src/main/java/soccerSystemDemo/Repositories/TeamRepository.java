package soccerSystemDemo.Repositories;


import org.springframework.data.repository.CrudRepository;
import soccerSystemDemo.Domain.Team;

/**
 * Created by L.z Double E on 8/14/2017.
 */

public interface TeamRepository extends CrudRepository<Team, String>{

}
