package net.maliavin.transfer.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import net.maliavin.transfer.domain.Region;

@Repository("regionDao")
public class RegionDAOImpl implements RegionDAO
{
    @Autowired
    @Qualifier("sessionFactoryUa")
    private SessionFactory sessionFactory;

    public void add(Region region)
    {
        sessionFactory.getCurrentSession().save(region);
    }

}
