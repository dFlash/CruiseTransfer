package net.maliavin.transfer.dao;

import org.springframework.stereotype.Repository;

import net.maliavin.transfer.domain.VesselCategory;

@Repository("vesselCategoryDao")
public class VesselCategoryDAOImpl implements VesselCategoryDAO
{

    //private SessionFactory sessionFactory;

    public void add(VesselCategory vesselCategory)
    {
        //sessionFactory.getCurrentSession().save(vesselCategory);
    }

}
