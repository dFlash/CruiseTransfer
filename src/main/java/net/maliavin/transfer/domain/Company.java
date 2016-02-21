package net.maliavin.transfer.domain;

public class Company
{
    private Long companyId;

    private String name;

    private String ufl;

    private Long companyCategoryId;

    private Long companyCruiseCategoryId;

    private String description;

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
