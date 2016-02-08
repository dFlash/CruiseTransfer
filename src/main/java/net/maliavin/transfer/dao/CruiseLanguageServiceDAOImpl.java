package net.maliavin.transfer.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import net.maliavin.transfer.domain.CruiseLanguageService;

@Repository("cruiseLanguageServiceDao")
public class CruiseLanguageServiceDAOImpl implements CruiseLanguageServiceDAO
{

    @Autowired
    @Qualifier("sessionFactoryUa")
    private SessionFactory sessionFactory;
    
    public void add(CruiseLanguageService cruiseLanguageService)
    {
        sessionFactory.getCurrentSession().save(cruiseLanguageService);
    }

}
