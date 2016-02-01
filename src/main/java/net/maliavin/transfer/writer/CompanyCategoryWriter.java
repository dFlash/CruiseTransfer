package net.maliavin.transfer.writer;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import net.maliavin.transfer.domain.CompanyCategory;
import net.maliavin.transfer.service.CompanyCategoryService;

@Component("companyCategoryWriter")
public class CompanyCategoryWriter implements ItemWriter<CompanyCategory>
{

    @Autowired
    private CompanyCategoryService companyCategoryService;

    public void write(List<? extends CompanyCategory> companyCategories)
            throws Exception
    {
        companyCategoryService.add(companyCategories);
    }

}
