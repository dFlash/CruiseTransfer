package net.maliavin.transfer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.maliavin.transfer.dao.CruiseDAO;
import net.maliavin.transfer.domain.Cruise;

@Service("cruiseService")
public class CruiseServiceImpl implements CruiseService
{
    @Autowired
    private CruiseDAO cruiseDAO;
    
    @Transactional
    public void add(Cruise cruise)
    {
        cruiseDAO.add(cruise);
    }

}
