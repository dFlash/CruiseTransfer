package net.maliavin.transfer.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "public.company")
public class Company
{
    @Id
    @Column(name = "company_id", nullable = false)
    private Long companyId;

    @Column(name = "name")
    @Size(min = 1, max = 256)
    private String name;

    @Column(name = "ufl")
    @Size(min = 1, max = 256)
    private String ufl;

    @Column(name = "company_category_id")
    @NotNull
    private Long companyCategoryId;

    @Column(name = "company_cruise_category_id")
    private Long companyCruiseCategoryId;

    @Column(name = "description")
    @Size(max = 65536)
    private String description;

    @Column(name = "gallery_id")
    private Long galleryId;

    public Long getCompanyId()
    {
        return companyId;
    }

    public void setCompanyId(Long companyId)
    {
        this.companyId = companyId;
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

    public Long getCompanyCategory()
    {
        return companyCategoryId;
    }

    public void setCompanyCategory(Long companyCategoryId)
    {
        this.companyCategoryId = companyCategoryId;
    }

    public Long getCompanyCruiseCategory()
    {
        return companyCruiseCategoryId;
    }

    public void setCompanyCruiseCategory(Long companyCruiseCategoryId)
    {
        this.companyCruiseCategoryId = companyCruiseCategoryId;
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
        return "Company [companyId=" + companyId + ", name=" + name + ", ufl="
                + ufl + ", companyCategoryId=" + companyCategoryId
                + ", companyCruiseCategoryId=" + companyCruiseCategoryId
                + ", description=" + description + ", galleryId=" + galleryId
                + "]";
    }
    
    
}
