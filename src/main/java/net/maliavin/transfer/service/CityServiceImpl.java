package net.maliavin.transfer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.maliavin.transfer.dao.CityDAO;
import net.maliavin.transfer.domain.City;

@Service("cityService")
public class CityServiceImpl implements CityService
{

    @Autowired
    private CityDAO cityDAO;

    @Transactional
    public void add(List<? extends City> cities)
    {
        for (City city : cities)
        {
            cityDAO.add(city);
        }
    }

}
