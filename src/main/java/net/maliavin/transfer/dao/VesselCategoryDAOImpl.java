package net.maliavin.transfer.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import net.maliavin.transfer.domain.VesselCategory;

@Repository("vesselCategoryDao")
public class VesselCategoryDAOImpl implements VesselCategoryDAO
{
    @Autowired
    @Qualifier("sessionFactoryUa")
    private SessionFactory sessionFactory;

    public void add(VesselCategory vesselCategory)
    {
        sessionFactory.getCurrentSession().save(vesselCategory);
    }

}
