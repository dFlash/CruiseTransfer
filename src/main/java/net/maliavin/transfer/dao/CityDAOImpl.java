package net.maliavin.transfer.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import net.maliavin.transfer.domain.City;

@Repository("cityDao")
public class CityDAOImpl implements CityDAO
{


    private JdbcTemplate jdbcTemplate;

    public void add(City city)
    {
        //sessionFactory.getCurrentSession().save(city);
    }

    @Autowired
    @Qualifier("dataSourceUa")
    public void setDataSource(DataSource dataSource)
    {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

}
