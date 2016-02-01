package net.maliavin.transfer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.maliavin.transfer.dao.FileInfoDAO;
import net.maliavin.transfer.domain.FileInfo;

@Service("fileInfoService")
public class FileInfoServiceImpl implements FileInfoService
{

    @Autowired
    private FileInfoDAO fileInfoDAO;

    @Transactional
    public void add(List<? extends FileInfo> fileInfos)
    {
        for (FileInfo fileInfo : fileInfos)
        {
            fileInfoDAO.add(fileInfo);
        }
        //fileInfoDAO.clearCache();
    }

}
