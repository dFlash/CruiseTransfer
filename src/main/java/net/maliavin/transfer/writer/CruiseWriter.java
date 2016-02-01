package net.maliavin.transfer.writer;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import net.maliavin.transfer.domain.Cruise;
import net.maliavin.transfer.service.CruiseService;

@Component("cruiseWriter")
public class CruiseWriter implements ItemWriter<Cruise>
{

    @Autowired
    @Qualifier("cruiseService")
    private CruiseService cruiseService;

    public void write(List<? extends Cruise> cruises) throws Exception
    {
        for (Cruise cruise : cruises)
        {
            cruiseService.add(cruise);
        }
        
    }

}
