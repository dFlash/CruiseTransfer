package net.maliavin.transfer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.maliavin.transfer.dao.CompanyCategoryDAO;
import net.maliavin.transfer.domain.CompanyCategory;

@Service("companyCategoryService")
public class CompanyCategoryServiceImpl implements CompanyCategoryService
{

    @Autowired
    private CompanyCategoryDAO companyCategoryDAO;

    @Transactional
    public void add(List<? extends CompanyCategory> companyCategories)
    {
        for (CompanyCategory companyCategory : companyCategories)
        {
            boolean isMappingPresent = companyCategoryDAO
                    .isMappingPresent(companyCategory.getCompanyCategoryId());
            if (!isMappingPresent)
            {
                boolean isEntityPresent = companyCategoryDAO
                        .isEntityPresent(companyCategory);
                if (!isEntityPresent)
                {
                    companyCategoryDAO.add(companyCategory);
                }
                Long uaId = companyCategoryDAO.getEntityId(companyCategory);
                companyCategoryDAO.addMapping(uaId,
                        companyCategory.getCompanyCategoryId());
            }
        }
    }

}
