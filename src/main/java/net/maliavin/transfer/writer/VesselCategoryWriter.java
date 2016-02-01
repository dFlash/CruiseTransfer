package net.maliavin.transfer.writer;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import net.maliavin.transfer.domain.VesselCategory;
import net.maliavin.transfer.service.VesselCategoryService;

@Component("vesselCategoryWriter")
public class VesselCategoryWriter implements ItemWriter<VesselCategory>
{

    @Autowired
    private VesselCategoryService vesselCategoryService;

    public void write(List<? extends VesselCategory> vesselCategories)
            throws Exception
    {
        vesselCategoryService.add(vesselCategories);
    }

}
