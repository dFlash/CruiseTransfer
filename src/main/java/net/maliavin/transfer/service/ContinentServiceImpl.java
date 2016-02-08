package net.maliavin.transfer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.maliavin.transfer.dao.ContinentDAO;
import net.maliavin.transfer.domain.Continent;

@Service("continentService")
public class ContinentServiceImpl implements ContinentService
{
    @Autowired
    private ContinentDAO continentDAO;

    @Transactional
    public void add(List<? extends Continent> continents)
    {
        for (Continent continent : continents)
        {
            continentDAO.add(continent);
        }
    }

}
