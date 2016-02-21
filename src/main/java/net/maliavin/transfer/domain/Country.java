package net.maliavin.transfer.domain;

public class Country
{

    private Long countryId;

    private String name;

    private String description;

    private Long galleryId;

    public Long getCountryId()
    {
        return countryId;
    }

    public void setCountryId(Long countryId)
    {
        this.countryId = countryId;
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
        return "Country [countryId=" + countryId + ", name=" + name
                + ", description=" + description + ", galleryId=" + galleryId
                + "]";
    }
    
    
}
