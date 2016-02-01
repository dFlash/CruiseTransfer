package net.maliavin.transfer.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import net.maliavin.transfer.domain.CompanyCategory;

@Repository("companyCategoryDao")
public class CompanyCategoryDAOImpl implements CompanyCategoryDAO
{

    @Autowired
    @Qualifier("sessionFactoryUa")
    private SessionFactory sessionFactory;
    
    public void add(CompanyCategory companyCategory)
    {
        sessionFactory.getCurrentSession().save(companyCategory);
    }

}
