package net.maliavin.transfer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.maliavin.transfer.dao.CountryDAO;
import net.maliavin.transfer.domain.Country;

@Service("countryService")
public class CountryServiceImpl implements CountryService
{

    @Autowired
    private CountryDAO countryDAO;

    @Transactional
    public void add(List<? extends Country> countries)
    {
        for (Country country : countries)
        {
            countryDAO.add(country);
        }
    }

}
