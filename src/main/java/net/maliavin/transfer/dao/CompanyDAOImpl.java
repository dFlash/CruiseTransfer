package net.maliavin.transfer.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import net.maliavin.transfer.domain.Company;

@Repository("companyDao")
public class CompanyDAOImpl implements CompanyDAO
{

    private JdbcTemplate jdbcTemplate;
    
    public void add(Company company)
    {
        //sessionFactory.getCurrentSession().save(company);
    }
    
    @Autowired
    @Qualifier("dataSourceUa")
    public void setDataSource(DataSource dataSource)
    {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

}
