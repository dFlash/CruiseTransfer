package net.maliavin.transfer.writer;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import net.maliavin.transfer.domain.City;
import net.maliavin.transfer.service.CityService;

@Component("cityWriter")
public class CityWriter implements ItemWriter<City>
{

    @Autowired
    @Qualifier("cityService")
    private CityService cityService;

    public void write(List<? extends City> cities) throws Exception
    {
        cityService.add(cities);
    }

}
