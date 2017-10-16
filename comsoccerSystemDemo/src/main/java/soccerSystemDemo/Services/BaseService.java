package soccerSystemDemo.Services;

/**
 * Created by joindomain on 8/17/2017.
 */
public interface BaseService<E, ID>{

        E create(E entity);

        E readById(ID id);

        E update(ID team);
}
