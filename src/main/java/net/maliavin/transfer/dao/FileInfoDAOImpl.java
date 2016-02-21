package net.maliavin.transfer.dao;

import org.springframework.stereotype.Repository;

import net.maliavin.transfer.domain.FileInfo;

@Repository("fileInfoDao")
public class FileInfoDAOImpl implements FileInfoDAO
{

    //private SessionFactory sessionFactory;

    public void add(FileInfo fileInfo)
    {
        //sessionFactory.getCurrentSession().save(fileInfo);
    }

    public void clearCache()
    {
        //sessionFactory.getCurrentSession().flush();
        //sessionFactory.getCurrentSession().clear();
    }

}
