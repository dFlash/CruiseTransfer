package net.maliavin.transfer.domain;

public class VesselCategory
{
    private Long vesselCategoryId;

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
