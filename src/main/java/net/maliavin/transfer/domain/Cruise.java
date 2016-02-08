package net.maliavin.transfer.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "public.cruise")
public class Cruise
{
    @Id
    @Column(name = "cruise_id", nullable = false)
    private Long cruiseId;

    @Column(name = "name")
    @Size(min = 1, max = 256)
    private String name;

    @Column(name = "ufl")
    @Size(min = 1, max = 256)
    private String ufl;

    @Column(name = "cruise_category_id")
    @NotNull
    private Long cruiseCategoryId;

    @Column(name = "vessel_id")
    @NotNull
    private Long vesselId;

    @Column(name = "cruise_language_service_id")
    private Long cruiseLanguageServiceId;

    @Column(name = "description")
    @Size(max = 65536)
    private String description;

    @Column(name = "gallery_id")
    private Long galleryId;

    @Column(name = "description_gallery_id")
    private Long descriptionGalleryId;

    @Column(name = "region_id")
    private Long regionId;

    @Column(name = "currency_id")
    @NotNull
    private Long currencyId;

    @Column(name = "price_value")
    @NotNull
    @Min(1)
    @Max(100000)
    private Integer priceValue;

    @Column(name = "is_simple_description")
    private boolean isSimpleDescription;

    @Column(name = "simple_price_description")
    @Size(max = 65536)
    private String simplePriceDescription;

    @Column(name = "simple_route_description")
    @Size(max = 65536)
    private String simpleRouteDescription;

    @Column(name = "simple_itinerary_description")
    @Size(max = 65536)
    private String simpleItineraryDescription;

    @Column(name = "special_offer")
    @Size(max = 256)
    private String specialOffer;

    @Column(name = "is_import")
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
