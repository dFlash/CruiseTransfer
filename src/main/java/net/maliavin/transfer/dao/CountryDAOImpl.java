package net.maliavin.transfer.dao;

import org.springframework.stereotype.Repository;

import net.maliavin.transfer.domain.Country;

@Repository("countryDao")
public class CountryDAOImpl implements CountryDAO
{

    //private SessionFactory sessionFactory;

    public void add(Country country)
    {
        //sessionFactory.getCurrentSession().save(country);
    }

}
