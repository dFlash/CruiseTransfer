package net.maliavin.transfer.writer;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import net.maliavin.transfer.domain.CruiseLanguageService;
import net.maliavin.transfer.service.CruiseLanguageServiceService;

@Component("cruiseLanguageServiceWriter")
public class CruiseLanguageServiceWriter
        implements ItemWriter<CruiseLanguageService>
{
    @Autowired
    private CruiseLanguageServiceService cruiseLanguageServiceService;

    public void write(
            List<? extends CruiseLanguageService> cruiseLanguageServices)
                    throws Exception
    {
        cruiseLanguageServiceService.add(cruiseLanguageServices);
    }

}
