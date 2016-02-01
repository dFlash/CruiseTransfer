package net.maliavin.transfer.writer;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import net.maliavin.transfer.domain.CruiseCity;
import net.maliavin.transfer.service.CruiseCityService;

@Component("cruiseCityWriter")
public class CruiseCityWriter implements ItemWriter<CruiseCity>
{

    @Autowired
    private CruiseCityService cruiseCityService;

    public void write(List<? extends CruiseCity> cruisesCities) throws Exception
    {
        cruiseCityService.add(cruisesCities);

    }

}
