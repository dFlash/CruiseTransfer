package net.maliavin.transfer.dao;

import org.springframework.stereotype.Repository;

import net.maliavin.transfer.domain.CruiseDateRange;

@Repository("cruiseDateRangeDAO")
public class CruiseDateRangeDAOImpl implements CruiseDateRangeDAO
{

    //private SessionFactory sessionFactory;

    public void add(CruiseDateRange cruiseDateRange)
    {
        //sessionFactory.getCurrentSession().save(cruiseDateRange);
    }

}
