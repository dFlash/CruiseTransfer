package net.maliavin.transfer.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import net.maliavin.transfer.domain.CruiseCity;

@Repository("cruiseCityDao")
public class CruiseCityDAOImpl implements CruiseCityDAO
{
    @Autowired
    @Qualifier("sessionFactoryUa")
    private SessionFactory sessionFactory;

    public void add(CruiseCity cruiseCity)
    {
        sessionFactory.getCurrentSession().save(cruiseCity);
    }

}
