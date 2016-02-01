package net.maliavin.transfer.service;

import java.util.List;

import net.maliavin.transfer.domain.FileInfo;

public interface FileInfoService
{
    public void add(List<? extends FileInfo> fileInfos);
}
