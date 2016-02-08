package net.maliavin.transfer.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "public.cruise_category")
public class CruiseCategory
{
    @Id
    @Column(name = "cruise_category_id", nullable = false)
    private Long cruiseCategoryId;

    @Column(name = "name")
    @Size(min = 1, max = 256)
    private String name;

    @Column(name = "description")
    @Size(max = 65536)
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
