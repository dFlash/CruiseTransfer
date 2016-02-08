package net.maliavin.transfer.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "public.cruise_city")
public class CruiseCity
{

    @Id
    @Column(name = "cruise_city_id", nullable = false)
    private Long cruiseCityId;

    @Column(name = "cruise_id")
    @NotNull
    private Long cruiseId;

    @Column(name = "city_id")
    @NotNull
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
