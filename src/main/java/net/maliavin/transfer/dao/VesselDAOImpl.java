package net.maliavin.transfer.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import net.maliavin.transfer.domain.Vessel;

@Repository("vesselDao")
public class VesselDAOImpl implements VesselDAO
{

    @Autowired
    @Qualifier("sessionFactoryUa")
    private SessionFactory sessionFactory;

    public void add(Vessel vessel)
    {
        sessionFactory.getCurrentSession().save(vessel);
    }

}
