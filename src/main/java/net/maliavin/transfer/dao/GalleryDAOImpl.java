package net.maliavin.transfer.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import net.maliavin.transfer.domain.Gallery;

@Repository("galleryDao")
public class GalleryDAOImpl implements GalleryDAO
{

    @Autowired
    @Qualifier("sessionFactoryUa")
    private SessionFactory sessionFactory;

    public void add(Gallery gallery)
    {
        sessionFactory.getCurrentSession().save(gallery);
    }

}
