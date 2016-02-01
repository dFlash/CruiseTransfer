package net.maliavin.transfer.service;

import java.util.List;

import net.maliavin.transfer.domain.Gallery;

public interface GalleryService
{
    public void add(List<? extends Gallery> galleries);
}
