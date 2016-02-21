package net.maliavin.transfer.domain;

public class Region
{
    private Long regionId;

    private Long continentId;

    private String name;

    private String description;

    private Long galleryId;

    public Long getRegionId()
    {
        return regionId;
    }

    public void setRegionId(Long regionId)
    {
        this.regionId = regionId;
    }

    public Long getContinentId()
    {
        return continentId;
    }

    public void setContinentId(Long continentId)
    {
        this.continentId = continentId;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public Long getGalleryId()
    {
        return galleryId;
    }

    public void setGalleryId(Long galleryId)
    {
        this.galleryId = galleryId;
    }

    @Override
    public String toString()
    {
        return "Region [regionId=" + regionId + ", continentId=" + continentId
                + ", name=" + name + ", description=" + description
                + ", galleryId=" + galleryId + "]";
    }

}
