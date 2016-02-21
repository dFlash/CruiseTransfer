package net.maliavin.transfer.dao;

import org.springframework.stereotype.Repository;

import net.maliavin.transfer.domain.CruiseLanguageService;

@Repository("cruiseLanguageServiceDao")
public class CruiseLanguageServiceDAOImpl implements CruiseLanguageServiceDAO
{
    //private SessionFactory sessionFactory;
    
    public void add(CruiseLanguageService cruiseLanguageService)
    {
        //sessionFactory.getCurrentSession().save(cruiseLanguageService);
    }

}
