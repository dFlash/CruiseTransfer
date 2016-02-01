package net.maliavin.transfer.processor;

import org.springframework.batch.item.ItemProcessor;

import net.maliavin.transfer.domain.CompanyCategory;

public class MyProcessor implements ItemProcessor<CompanyCategory, CompanyCategory>
{

    public CompanyCategory process(CompanyCategory arg0) throws Exception
    {
        System.out.println(arg0);
        return arg0;
    }

}
