package net.maliavin.transfer.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import net.maliavin.transfer.domain.CruiseDateRange;

@Repository("cruiseDateRangeDAO")
public class CruiseDateRangeDAOImpl implements CruiseDateRangeDAO
{

    @Autowired
    @Qualifier("sessionFactoryUa")
    private SessionFactory sessionFactory;

    public void add(CruiseDateRange cruiseDateRange)
    {
        sessionFactory.getCurrentSession().save(cruiseDateRange);
    }

}
