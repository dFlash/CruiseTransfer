package net.maliavin.transfer.dao;

import org.springframework.stereotype.Repository;

import net.maliavin.transfer.domain.Continent;

@Repository("continentDao")
public class ContinentDAOImpl implements ContinentDAO
{

    //private SessionFactory sessionFactory;
    
    public void add(Continent continent)
    {
        //sessionFactory.getCurrentSession().save(continent);
    }

}
