package net.maliavin.transfer.dao;

import org.springframework.stereotype.Repository;

import net.maliavin.transfer.domain.CruiseCategory;

@Repository("cruiseCategoryDao")
public class CruiseCategoryDAOImpl implements CruiseCategoryDAO
{

    //private SessionFactory sessionFactory;

    public void add(CruiseCategory cruiseCategory)
    {
        //sessionFactory.getCurrentSession().save(cruiseCategory);
    }

}
