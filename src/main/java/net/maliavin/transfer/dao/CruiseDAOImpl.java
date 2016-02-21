package net.maliavin.transfer.dao;

import org.springframework.stereotype.Repository;

import net.maliavin.transfer.domain.Cruise;

@Repository("cruiseDao")
public class CruiseDAOImpl implements CruiseDAO
{

    //private SessionFactory sessionFactory;

    public void add(Cruise cruise)
    {
        //sessionFactory.getCurrentSession().save(cruise);
    }
}
