package net.maliavin.transfer.dao;

import net.maliavin.transfer.domain.FileInfo;

public interface FileInfoDAO
{
    public void add(FileInfo fileInfo);

    public void clearCache();
}
