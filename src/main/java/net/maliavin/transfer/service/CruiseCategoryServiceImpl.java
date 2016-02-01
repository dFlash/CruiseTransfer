package net.maliavin.transfer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.maliavin.transfer.dao.CruiseCategoryDAO;
import net.maliavin.transfer.domain.CruiseCategory;

@Service("cruiseCategoryService")
public class CruiseCategoryServiceImpl implements CruiseCategoryService
{

    @Autowired
    private CruiseCategoryDAO cruiseCategoryDAO;

    @Transactional
    public void add(List<? extends CruiseCategory> cruiseCategories)
    {
        for (CruiseCategory cruiseCategory : cruiseCategories)
        {
            cruiseCategoryDAO.add(cruiseCategory);
        }
    }

}
