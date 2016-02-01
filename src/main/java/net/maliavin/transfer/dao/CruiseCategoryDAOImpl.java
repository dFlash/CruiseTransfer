package net.maliavin.transfer.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import net.maliavin.transfer.domain.CruiseCategory;

@Repository("cruiseCategoryDao")
public class CruiseCategoryDAOImpl implements CruiseCategoryDAO
{

    @Autowired
    @Qualifier("sessionFactoryUa")
    private SessionFactory sessionFactory;

    public void add(CruiseCategory cruiseCategory)
    {
        sessionFactory.getCurrentSession().save(cruiseCategory);
    }

}
