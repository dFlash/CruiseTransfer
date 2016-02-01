package net.maliavin.transfer.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import net.maliavin.transfer.domain.City;

@Repository("cityDao")
public class CityDAOImpl implements CityDAO
{

    @Autowired
    @Qualifier("sessionFactoryUa")
    private SessionFactory sessionFactory;

    public void add(City city)
    {
        sessionFactory.getCurrentSession().save(city);
    }

}
