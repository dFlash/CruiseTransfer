package net.maliavin.transfer.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

public class CruiseDateRange
{
    private Long cruiseDateRangeId;

    @DateTimeFormat(iso = ISO.DATE, pattern = "yyyy-MM-dd")
    private Date beginDate;

    @DateTimeFormat(iso = ISO.DATE, pattern = "yyyy-MM-dd")
    private Date endDate;
    
    private Long cruiseId;

    private Long startCityId;

    public Long getCruiseDateRangeId()
    {
        return cruiseDateRangeId;
    }

    public void setCruiseDateRangeId(Long cruiseDateRangeId)
    {
        this.cruiseDateRangeId = cruiseDateRangeId;
    }

    public Date getBeginDate()
    {
        return beginDate;
    }

    public void setBeginDate(Date beginDate)
    {
        this.beginDate = beginDate;
    }

    public Date getEndDate()
    {
        return endDate;
    }

    public void setEndDate(Date endDate)
    {
        this.endDate = endDate;
    }

    public Long getCruiseId()
    {
        return cruiseId;
    }

    public void setCruiseId(Long cruiseId)
    {
        this.cruiseId = cruiseId;
    }

    public Long getStartCityId()
    {
        return startCityId;
    }

    public void setStartCityId(Long startCityId)
    {
        this.startCityId = startCityId;
    }

    @Override
    public String toString()
    {
        return "CruiseDateRange [cruiseDateRangeId=" + cruiseDateRangeId
                + ", beginDate=" + beginDate + ", endDate=" + endDate
                + ", cruiseId=" + cruiseId + ", startCityId=" + startCityId
                + "]";
    }

}
