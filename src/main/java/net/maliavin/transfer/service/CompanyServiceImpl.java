package net.maliavin.transfer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.maliavin.transfer.dao.CompanyDAO;
import net.maliavin.transfer.domain.Company;

@Service("companyService")
public class CompanyServiceImpl implements CompanyService
{

    @Autowired
    private CompanyDAO companyDAO;
    
    @Transactional
    public void add(List<? extends Company> companies)
    {
        for (Company company : companies)
        {
            companyDAO.add(company);
        }
    }

}
