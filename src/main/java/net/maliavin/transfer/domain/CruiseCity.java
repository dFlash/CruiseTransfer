package net.maliavin.transfer.domain;

public class CruiseCity
{

    private Long cruiseCityId;

    private Long cruiseId;

    private Long cityId;

    public Long getCruiseCityId()
    {
        return cruiseCityId;
    }

    public void setCruiseCityId(Long cruiseCityId)
    {
        this.cruiseCityId = cruiseCityId;
    }

    public Long getCruiseId()
    {
        return cruiseId;
    }

    public void setCruiseId(Long cruiseId)
    {
        this.cruiseId = cruiseId;
    }

    public Long getCityId()
    {
        return cityId;
    }

    public void setCityId(Long cityId)
    {
        this.cityId = cityId;
    }

    @Override
    public String toString()
    {
        return "CruiseCity [cruiseCityId=" + cruiseCityId + ", cruiseId="
                + cruiseId + ", cityId=" + cityId + "]";
    }
    
    
}
