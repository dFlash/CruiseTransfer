package net.maliavin.transfer.dao;

import org.springframework.stereotype.Repository;

import net.maliavin.transfer.domain.Vessel;

@Repository("vesselDao")
public class VesselDAOImpl implements VesselDAO
{
    //private SessionFactory sessionFactory;

    public void add(Vessel vessel)
    {
        //sessionFactory.getCurrentSession().save(vessel);
    }

}
