package net.maliavin.transfer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.maliavin.transfer.dao.CruiseCityDAO;
import net.maliavin.transfer.domain.CruiseCity;

@Service("cruiseCityService")
public class CruiseCityServiceImpl implements CruiseCityService
{

    @Autowired
    private CruiseCityDAO cruiseCityDAO;
    
    @Transactional
    public void add(List<? extends CruiseCity> cruisesCities)
    {
        for (CruiseCity cruiseCity : cruisesCities)
        {
            cruiseCityDAO.add(cruiseCity);
        }
    }

}
