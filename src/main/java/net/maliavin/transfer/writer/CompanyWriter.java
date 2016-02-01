package net.maliavin.transfer.writer;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import net.maliavin.transfer.domain.Company;
import net.maliavin.transfer.service.CompanyService;

@Component("companyWriter")
public class CompanyWriter implements ItemWriter<Company>
{
    @Autowired
    private CompanyService companyService;

    public void write(List<? extends Company> companies) throws Exception
    {
        companyService.add(companies);
    }

}
