package net.maliavin.transfer.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import net.maliavin.transfer.domain.Company;

@Repository("companyDao")
public class CompanyDAOImpl implements CompanyDAO
{

    @Autowired
    @Qualifier("sessionFactoryUa")
    private SessionFactory sessionFactory;
    
    public void add(Company company)
    {
        sessionFactory.getCurrentSession().save(company);
    }

}
