package net.maliavin.transfer.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import net.maliavin.transfer.domain.Continent;

@Repository("continentDao")
public class ContinentDAOImpl implements ContinentDAO
{

    @Autowired
    @Qualifier("sessionFactoryUa")
    private SessionFactory sessionFactory;
    
    public void add(Continent continent)
    {
        sessionFactory.getCurrentSession().save(continent);
    }

}
