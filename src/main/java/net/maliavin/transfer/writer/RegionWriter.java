package net.maliavin.transfer.writer;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import net.maliavin.transfer.domain.Region;
import net.maliavin.transfer.service.RegionService;

@Component("regionWriter")
public class RegionWriter implements ItemWriter<Region>
{

    @Autowired
    private RegionService regionService;

    public void write(List<? extends Region> regions) throws Exception
    {
        regionService.add(regions);
    }

}
