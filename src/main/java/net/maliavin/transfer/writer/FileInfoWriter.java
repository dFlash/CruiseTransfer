package net.maliavin.transfer.writer;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import net.maliavin.transfer.domain.FileInfo;
import net.maliavin.transfer.service.FileInfoService;

@Component("fileInfoWriter")
public class FileInfoWriter implements ItemWriter<FileInfo>
{

    @Autowired
    private FileInfoService fileInfoService;

    public void write(List<? extends FileInfo> fileInfos) throws Exception
    {
        fileInfoService.add(fileInfos);
    }

}
