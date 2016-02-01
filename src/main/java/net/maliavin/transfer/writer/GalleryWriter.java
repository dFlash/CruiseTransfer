package net.maliavin.transfer.writer;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import net.maliavin.transfer.domain.Gallery;
import net.maliavin.transfer.service.GalleryService;

@Component("galleryWriter")
public class GalleryWriter implements ItemWriter<Gallery>
{

    @Autowired
    private GalleryService galleryService;

    public void write(List<? extends Gallery> galleries) throws Exception
    {
        galleryService.add(galleries);
    }

}
