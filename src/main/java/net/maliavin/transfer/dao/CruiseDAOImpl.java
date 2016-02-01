package net.maliavin.transfer.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import net.maliavin.transfer.domain.Cruise;

@Repository("cruiseDao")
public class CruiseDAOImpl implements CruiseDAO
{

    @Autowired
    @Qualifier("sessionFactoryUa")
    private SessionFactory sessionFactory;

    public void add(Cruise cruise)
    {
        sessionFactory.getCurrentSession().save(cruise);
    }
}
