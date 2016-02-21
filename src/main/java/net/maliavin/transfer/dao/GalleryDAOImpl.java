package net.maliavin.transfer.dao;

import org.springframework.stereotype.Repository;

import net.maliavin.transfer.domain.Gallery;

@Repository("galleryDao")
public class GalleryDAOImpl implements GalleryDAO
{

    //private SessionFactory sessionFactory;

    public void add(Gallery gallery)
    {
        //sessionFactory.getCurrentSession().save(gallery);
    }

}
