package net.maliavin.transfer.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "public.vessel_category")
public class VesselCategory
{
    @Id
    @Column(name = "vessel_category_id", nullable = false)
    private Long vesselCategoryId;

    @Column(name = "name")
    @Size(min = 1, max = 256)
    private String name;

    public Long getVesselCategoryId()
    {
        return vesselCategoryId;
    }

    public void setVesselCategoryId(Long vesselCategoryId)
    {
        this.vesselCategoryId = vesselCategoryId;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "VesselCategory [vesselCategoryId=" + vesselCategoryId
                + ", name=" + name + "]";
    }
    
    
}
