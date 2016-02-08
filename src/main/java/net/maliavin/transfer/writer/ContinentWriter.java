package net.maliavin.transfer.writer;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import net.maliavin.transfer.domain.Continent;
import net.maliavin.transfer.service.ContinentService;

@Component("continentWriter")
public class ContinentWriter implements ItemWriter<Continent>
{

    @Autowired
    private ContinentService continentService;

    public void write(List<? extends Continent> continents) throws Exception
    {
        continentService.add(continents);
    }

}
