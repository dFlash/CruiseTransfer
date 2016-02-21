package net.maliavin.transfer.domain;

public class Continent
{
    private Long continentId;

    private String name;

    private String description;

    private Long galleryId;

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
        return "Continent [continentId=" + continentId + ", name=" + name
                + ", description=" + description + ", galleryId=" + galleryId
                + "]";
    }
}
