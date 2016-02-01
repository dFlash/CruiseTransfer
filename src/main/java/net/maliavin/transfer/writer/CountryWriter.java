package net.maliavin.transfer.writer;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import net.maliavin.transfer.domain.Country;
import net.maliavin.transfer.service.CountryService;

@Component("countryWriter")
public class CountryWriter implements ItemWriter<Country>
{

    @Autowired
    private CountryService countryService;

    public void write(List<? extends Country> countries) throws Exception
    {
        countryService.add(countries);
    }

}
