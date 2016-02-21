package net.maliavin.transfer.dao;

import org.springframework.stereotype.Repository;

import net.maliavin.transfer.domain.Region;

@Repository("regionDao")
public class RegionDAOImpl implements RegionDAO
{
    //private SessionFactory sessionFactory;

    public void add(Region region)
    {
        //sessionFactory.getCurrentSession().save(region);
    }

}
