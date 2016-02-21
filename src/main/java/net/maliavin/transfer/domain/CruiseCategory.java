package net.maliavin.transfer.domain;

public class CruiseCategory
{

    private Long cruiseCategoryId;

    private String name;

    private String description;

    public Long getCruiseCategoryId()
    {
        return cruiseCategoryId;
    }

    public void setCruiseCategoryId(Long cruiseCategoryId)
    {
        this.cruiseCategoryId = cruiseCategoryId;
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

    @Override
    public String toString()
    {
        return "CruiseCategory [cruiseCategoryId=" + cruiseCategoryId
                + ", name=" + name + ", description=" + description + "]";
    }
    
    
}
