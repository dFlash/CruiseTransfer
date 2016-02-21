package net.maliavin.transfer.domain;

public class City
{

    private Long cityId;

    private String name;

    private String ufl;

    private String description;

    private Long galleryId;

    private Long countryId;

    private String latitude;

    private String longitude;

    private Boolean isEnabled;

    public Long getCityId()
    {
        return cityId;
    }

    public void setCityId(Long cityId)
    {
        this.cityId = cityId;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getUfl()
    {
        return ufl;
    }

    public void setUfl(String ufl)
    {
        this.ufl = ufl;
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

    public Long getCountry()
    {
        return countryId;
    }

    public void setCountry(Long countryId)
    {
        this.countryId = countryId;
    }

    public String getLatitude()
    {
        return latitude;
    }

    public void setLatitude(String latitude)
    {
        this.latitude = latitude;
    }

    public String getLongitude()
    {
        return longitude;
    }

    public void setLongitude(String longitude)
    {
        this.longitude = longitude;
    }

    public Boolean getIsEnabled()
    {
        return isEnabled;
    }

    public void setIsEnabled(Boolean isEnabled)
    {
        this.isEnabled = isEnabled;
    }

    @Override
    public String toString()
    {
        return "City [cityId=" + cityId + ", name=" + name + ", ufl=" + ufl
                + ", description=" + description + ", galleryId=" + galleryId
                + ", countryId=" + countryId + ", latitude=" + latitude
                + ", longitude=" + longitude + ", isEnabled=" + isEnabled + "]";
    }
}
