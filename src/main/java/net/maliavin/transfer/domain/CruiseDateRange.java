package net.maliavin.transfer.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
@Table(name = "public.cruise_date_range")
public class CruiseDateRange
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,
            generator = "cruise_date_range_cruise_date_range_id_seq")
    @SequenceGenerator(name = "cruise_date_range_cruise_date_range_id_seq",
            sequenceName = "cruise_date_range_cruise_date_range_id_seq")
    @Column(name = "cruise_date_range_id", nullable = false)
    private Long cruiseDateRangeId;

    @Column(name = "begin_date")
    @DateTimeFormat(iso = ISO.DATE, pattern = "yyyy-MM-dd")
    @NotNull
    private Date beginDate;

    @Column(name = "end_date")
    @DateTimeFormat(iso = ISO.DATE, pattern = "yyyy-MM-dd")
    @NotNull
    private Date endDate;
    
    @Column(name = "cruise_id")
    @NotNull
    private Long cruiseId;

    @Column(name = "start_sity_id")
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
