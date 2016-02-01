package net.maliavin.transfer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.maliavin.transfer.dao.GalleryDAO;
import net.maliavin.transfer.domain.Gallery;

@Service("galleryService")
public class GalleryServiceImpl implements GalleryService
{

    @Autowired
    private GalleryDAO galleryDAO;

    @Transactional
    public void add(List<? extends Gallery> galleries)
    {
        for (Gallery gallery : galleries)
        {
            galleryDAO.add(gallery);
        }
    }

}
