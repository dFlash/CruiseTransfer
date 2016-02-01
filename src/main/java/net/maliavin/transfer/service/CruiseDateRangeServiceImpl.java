package net.maliavin.transfer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.maliavin.transfer.dao.CruiseDateRangeDAO;
import net.maliavin.transfer.domain.CruiseDateRange;

@Service("cruiseDateRangeService")
public class CruiseDateRangeServiceImpl implements CruiseDateRangeService
{

    @Autowired
    private CruiseDateRangeDAO cruiseDateRangeDAO;
    
    @Transactional
    public void add(List<? extends CruiseDateRange> cruiseDateRanges)
    {
        for (CruiseDateRange cruiseDateRange : cruiseDateRanges)
        {
            cruiseDateRangeDAO.add(cruiseDateRange);
        }
        
    }

}
