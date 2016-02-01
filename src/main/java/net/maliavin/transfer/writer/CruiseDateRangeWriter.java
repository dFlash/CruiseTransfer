package net.maliavin.transfer.writer;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import net.maliavin.transfer.domain.CruiseDateRange;
import net.maliavin.transfer.service.CruiseDateRangeService;

@Component("cruiseDateRangeWriter")
public class CruiseDateRangeWriter implements ItemWriter<CruiseDateRange>
{

    @Autowired
    @Qualifier("cruiseDateRangeService")
    private CruiseDateRangeService cruiseDateRangeService;
    
    public void write(List<? extends CruiseDateRange> cruiseDateRanges) throws Exception
    {
        cruiseDateRangeService.add(cruiseDateRanges);
    }

}
