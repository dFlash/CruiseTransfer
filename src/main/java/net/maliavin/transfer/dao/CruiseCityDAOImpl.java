package net.maliavin.transfer.dao;

import org.springframework.stereotype.Repository;

import net.maliavin.transfer.domain.CruiseCity;

@Repository("cruiseCityDao")
public class CruiseCityDAOImpl implements CruiseCityDAO
{
    //private SessionFactory sessionFactory;

    public void add(CruiseCity cruiseCity)
    {
        //sessionFactory.getCurrentSession().save(cruiseCity);
    }

}
