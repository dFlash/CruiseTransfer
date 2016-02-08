package net.maliavin.transfer.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
@Table(name = "public.vessel")
public class Vessel
{
    @Id
    @Column(name = "vessel_id", nullable = false)
    private Long vesselId;

    @Column(name = "name")
    @Size(min = 1, max = 256)
    private String name;

    @Column(name = "ufl")
    @Size(min = 1, max = 256)
    private String ufl;

    @Column(name = "description")
    @Size(max = 65536)
    private String description;

    @Column(name = "vessel_category_id")
    @NotNull
    private Long vesselCategoryId;

    @Column(name = "company_id")
    @NotNull
    private Long companyId;

    @Column(name = "gallery_id")
    private Long galleryId;

    @Column(name = "description_gallery_id")
    private Long descriptionGalleryId;

    @Column(name = "schema_gallery_id")
    private Long schemaGalleryId;

    @Column(name = "build_year")
    @DateTimeFormat(iso = ISO.NONE, pattern = "yyyy")
    @Past
    private Date buildYear;

    @Column(name = "width")
    @Min(0)
    private Float width;

    @Column(name = "length")
    @Min(0)
    private Float length;

    @Column(name = "speed")
    @Min(0)
    private Float speed;

    @Column(name = "capacity")
    @Min(0)
    private Integer capacity;

    @Column(name = "balancer")
    private Boolean balancer;

    @Column(name = "deck_quantity")
    @Min(0)
    private Integer deckQuantity;

    @Column(name = "cabin_quantity")
    @Min(0)
    private Integer cabinQuantity;

    @Column(name = "restaurant_quantity")
    @Min(0)
    private Integer restaurantQuantity;

    @Column(name = "lift_quantity")
    @Min(0)
    private Integer liftQuantity;

    @Column(name = "pool_quantity")
    @Min(0)
    private Integer poolQuantity;

    @Column(name = "is_import")
    private Boolean isImport;

    @Column(name = "is_enabled")
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
