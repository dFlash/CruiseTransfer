package net.maliavin.transfer.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

public class Vessel
{
    private Long vesselId;

    private String name;

    private String ufl;

    private String description;

    private Long vesselCategoryId;

    private Long companyId;

    private Long galleryId;

    private Long descriptionGalleryId;

    private Long schemaGalleryId;

    @DateTimeFormat(iso = ISO.NONE, pattern = "yyyy")
    private Date buildYear;

    private Float width;

    private Float length;

    private Float speed;

    private Integer capacity;

    private Boolean balancer;

    private Integer deckQuantity;

    private Integer cabinQuantity;

    private Integer restaurantQuantity;

    private Integer liftQuantity;

    private Integer poolQuantity;

    private Boolean isImport;

    private Boolean isEnabled;

    public Long getVesselId()
    {
        return vesselId;
    }

    public void setVesselId(Long vesselId)
    {
        this.vesselId = vesselId;
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



    public Long getVesselCategory()
    {
        return vesselCategoryId;
    }



    public void setVesselCategory(Long vesselCategoryId)
    {
        this.vesselCategoryId = vesselCategoryId;
    }



    public Long getCompany()
    {
        return companyId;
    }



    public void setCompany(Long companyId)
    {
        this.companyId = companyId;
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



    public Long getSchemaGalleryId()
    {
        return schemaGalleryId;
    }



    public void setSchemaGalleryId(Long schemaGalleryId)
    {
        this.schemaGalleryId = schemaGalleryId;
    }



    public Date getBuildYear()
    {
        return buildYear;
    }



    public void setBuildYear(Date buildYear)
    {
        this.buildYear = buildYear;
    }



    public Float getWidth()
    {
        return width;
    }



    public void setWidth(Float width)
    {
        this.width = width;
    }



    public Float getLength()
    {
        return length;
    }



    public void setLength(Float length)
    {
        this.length = length;
    }



    public Float getSpeed()
    {
        return speed;
    }



    public void setSpeed(Float speed)
    {
        this.speed = speed;
    }



    public Integer getCapacity()
    {
        return capacity;
    }



    public void setCapacity(Integer capacity)
    {
        this.capacity = capacity;
    }



    public Boolean getBalancer()
    {
        return balancer;
    }



    public void setBalancer(Boolean balancer)
    {
        this.balancer = balancer;
    }



    public Integer getDeckQuantity()
    {
        return deckQuantity;
    }



    public void setDeckQuantity(Integer deckQuantity)
    {
        this.deckQuantity = deckQuantity;
    }



    public Integer getCabinQuantity()
    {
        return cabinQuantity;
    }



    public void setCabinQuantity(Integer cabinQuantity)
    {
        this.cabinQuantity = cabinQuantity;
    }



    public Integer getRestaurantQuantity()
    {
        return restaurantQuantity;
    }



    public void setRestaurantQuantity(Integer restaurantQuantity)
    {
        this.restaurantQuantity = restaurantQuantity;
    }



    public Integer getLiftQuantity()
    {
        return liftQuantity;
    }



    public void setLiftQuantity(Integer liftQuantity)
    {
        this.liftQuantity = liftQuantity;
    }



    public Integer getPoolQuantity()
    {
        return poolQuantity;
    }



    public void setPoolQuantity(Integer poolQuantity)
    {
        this.poolQuantity = poolQuantity;
    }



    public Boolean getIsImport()
    {
        return isImport;
    }



    public void setIsImport(Boolean isImport)
    {
        this.isImport = isImport;
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
        return "Vessel [vesselId=" + vesselId + ", name=" + name + ", ufl="
                + ufl + ", description=" + description + ", vesselCategoryId="
                + vesselCategoryId + ", companyId=" + companyId + ", galleryId="
                + galleryId + ", descriptionGalleryId=" + descriptionGalleryId
                + ", schemaGalleryId=" + schemaGalleryId + ", buildYear="
                + buildYear + ", width=" + width + ", length=" + length
                + ", speed=" + speed + ", capacity=" + capacity + ", balancer="
                + balancer + ", deckQuantity=" + deckQuantity
                + ", cabinQuantity=" + cabinQuantity + ", restaurantQuantity="
                + restaurantQuantity + ", liftQuantity=" + liftQuantity
                + ", poolQuantity=" + poolQuantity + ", isImport=" + isImport
                + ", isEnabled=" + isEnabled + "]";
    }
    
    
}
