package net.maliavin.transfer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.maliavin.transfer.dao.RegionDAO;
import net.maliavin.transfer.domain.Region;

@Service("regionService")
public class RegionServiceImpl implements RegionService
{

    @Autowired
    private RegionDAO regionDAO;
    
    @Transactional
    public void add(List<? extends Region> regions)
    {
        for (Region region : regions)
        {
            regionDAO.add(region);
        }
    }

}
