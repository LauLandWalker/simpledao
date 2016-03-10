package com.hopcroft.examples.dao;

import com.hopcroft.examples.domain.Car;
import org.springframework.dao.DataAccessException;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by lauroalarcon on 3/10/16.
 */
public class CarDaoImpl implements CarDao {
    protected EntityManager entityManager;

    public EntityManager getEntityManager() {
        return entityManager;
    }
    @PersistenceContext
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Transactional
    public List<Car> getCars() throws DataAccessException {
        Query query = getEntityManager().createQuery("select c from Car c");
        List<Car> resultList = query.getResultList();
        return resultList;
    }
    @Transactional
    public Car getCar(Long carId) throws DataAccessException {
        return getEntityManager().find(Car.class, carId);
    }
}
