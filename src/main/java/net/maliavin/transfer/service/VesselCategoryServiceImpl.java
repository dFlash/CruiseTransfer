package net.maliavin.transfer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.maliavin.transfer.dao.VesselCategoryDAO;
import net.maliavin.transfer.domain.VesselCategory;

@Service("vesselCategoryService")
public class VesselCategoryServiceImpl implements VesselCategoryService
{

    @Autowired
    private VesselCategoryDAO vesselCategoryDAO;
    
    @Transactional
    public void add(List<? extends VesselCategory> vesselCategories)
    {
        for (VesselCategory vesselCategory : vesselCategories)
        {
            vesselCategoryDAO.add(vesselCategory);
        }
    }

}
