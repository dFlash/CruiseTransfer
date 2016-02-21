package net.maliavin.transfer.domain;

public class Cruise
{
    private Long cruiseId;

    private String name;

    private String ufl;

    private Long cruiseCategoryId;

    private Long vesselId;

    private Long cruiseLanguageServiceId;

    private String description;

    private Long galleryId;

    private Long descriptionGalleryId;

    private Long regionId;

    private Long currencyId;

    private Integer priceValue;

    private boolean isSimpleDescription;

    private String simplePriceDescription;

    private String simpleRouteDescription;

    private String simpleItineraryDescription;

    private String specialOffer;

    private Boolean isImport;

    public Long getCruiseId()
    {
        return cruiseId;
    }

    public void setCruiseId(Long cruiseId)
    {
        this.cruiseId = cruiseId;
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

    public Long getCruiseCategory()
    {
        return cruiseCategoryId;
    }

    public void setCruiseCategory(Long cruiseCategoryId)
    {
        this.cruiseCategoryId = cruiseCategoryId;
    }

    public Long getVesselId()
    {
        return vesselId;
    }

    public void setVesselId(Long vesselId)
    {
        this.vesselId = vesselId;
    }

    public Long getCruiseLanguageServiceId()
    {
        return cruiseLanguageServiceId;
    }

    public void setCruiseLanguageServiceId(Long cruiseLanguageServiceId)
    {
        this.cruiseLanguageServiceId = cruiseLanguageServiceId;
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

    public Long getDescriptionGalleryId()
    {
        return descriptionGalleryId;
    }

    public void setDescriptionGalleryId(Long descriptionGalleryId)
    {
        this.descriptionGalleryId = descriptionGalleryId;
    }

    public Long getRegionId()
    {
        return regionId;
    }

    public void setRegionId(Long regionId)
    {
        this.regionId = regionId;
    }

    public Long getCurrencyId()
    {
        return currencyId;
    }

    public void setCurrencyId(Long currencyId)
    {
        this.currencyId = currencyId;
    }

    public Integer getPriceValue()
    {
        return priceValue;
    }

    public void setPriceValue(Integer priceValue)
    {
        this.priceValue = priceValue;
    }

    public boolean isSimpleDescription()
    {
        return isSimpleDescription;
    }

    public void setSimpleDescription(boolean isSimpleDescription)
    {
        this.isSimpleDescription = isSimpleDescription;
    }

    public String getSimplePriceDescription()
    {
        return simplePriceDescription;
    }

    public void setSimplePriceDescription(String simplePriceDescription)
    {
        this.simplePriceDescription = simplePriceDescription;
    }

    public String getSimpleRouteDescription()
    {
        return simpleRouteDescription;
    }

    public void setSimpleRouteDescription(String simpleRouteDescription)
    {
        this.simpleRouteDescription = simpleRouteDescription;
    }

    public String getSimpleItineraryDescription()
    {
        return simpleItineraryDescription;
    }

    public void setSimpleItineraryDescription(String simpleItineraryDescription)
    {
        this.simpleItineraryDescription = simpleItineraryDescription;
    }

    public String getSpecialOffer()
    {
        return specialOffer;
    }

    public void setSpecialOffer(String specialOffer)
    {
        this.specialOffer = specialOffer;
    }

    public Boolean getIsImport()
    {
        return isImport;
    }

    public void setIsImport(Boolean isImport)
    {
        this.isImport = isImport;
    }

    @Override
    public String toString()
    {
        return "Cruise [cruiseId=" + cruiseId + ", name=" + name + ", ufl="
                + ufl + ", cruiseCategoryId=" + cruiseCategoryId + ", vesselId="
                + vesselId + ", cruiseLanguageServiceId="
                + cruiseLanguageServiceId + ", description=" + description
                + ", galleryId=" + galleryId + ", descriptionGalleryId="
                + descriptionGalleryId + ", regionId=" + regionId
                + ", currencyId=" + currencyId + ", priceValue=" + priceValue
                + ", isSimpleDescription=" + isSimpleDescription
                + ", simplePriceDescription=" + simplePriceDescription
                + ", simpleRouteDescription=" + simpleRouteDescription
                + ", simpleItineraryDescription=" + simpleItineraryDescription
                + ", specialOffer=" + specialOffer + ", isImport=" + isImport
                + "]";
    }

}
