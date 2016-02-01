package net.maliavin.transfer.writer;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import net.maliavin.transfer.domain.CruiseCategory;
import net.maliavin.transfer.service.CruiseCategoryService;

@Component("cruiseCategoryWriter")
public class CruiseCategoryWriter implements ItemWriter<CruiseCategory>
{

    @Autowired
    private CruiseCategoryService cruiseCategoryService;

    public void write(List<? extends CruiseCategory> cruiseCategories)
            throws Exception
    {
        cruiseCategoryService.add(cruiseCategories);
    }

}
