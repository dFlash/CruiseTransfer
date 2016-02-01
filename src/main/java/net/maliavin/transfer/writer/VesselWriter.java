package net.maliavin.transfer.writer;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import net.maliavin.transfer.domain.Vessel;
import net.maliavin.transfer.service.VesselService;

@Component("vesselWriter")
public class VesselWriter implements ItemWriter<Vessel>
{

    @Autowired
    @Qualifier("vesselService")
    private VesselService vesselService;
    
    public void write(List<? extends Vessel> vessels) throws Exception
    {
        vesselService.add(vessels);
    }

}
