package net.maliavin.transfer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.maliavin.transfer.dao.CruiseLanguageServiceDAO;
import net.maliavin.transfer.domain.CruiseLanguageService;

@Service("cruiseLanguageServiceService")
public class CruiseLanguageServiceServiceImpl implements CruiseLanguageServiceService
{

    @Autowired
    private CruiseLanguageServiceDAO cruiseLanguageServiceDAO;
    
    @Transactional
    public void add(
            List<? extends CruiseLanguageService> cruiseLanguageServices)
    {
        for (CruiseLanguageService cruiseLanguageService : cruiseLanguageServices)
        {
            cruiseLanguageServiceDAO.add(cruiseLanguageService);
        }
    }

}
