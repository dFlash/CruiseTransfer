package net.maliavin.transfer.domain;

public class Gallery
{
    private Long galleryId;

    private String name;

    private Long defaultFileInfoId;

    public Long getGalleryId()
    {
        return galleryId;
    }

    public void setGalleryId(Long galleryId)
    {
        this.galleryId = galleryId;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Long getDefaultFileInfoId()
    {
        return defaultFileInfoId;
    }

    public void setDefaultFileInfoId(Long defaultFileInfoId)
    {
        this.defaultFileInfoId = defaultFileInfoId;
    }

    @Override
    public String toString()
    {
        return "Gallery [galleryId=" + galleryId + ", name=" + name
                + ", defaultFileInfoId=" + defaultFileInfoId + "]";
    }
    
    

}
