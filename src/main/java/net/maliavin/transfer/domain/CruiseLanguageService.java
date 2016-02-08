package net.maliavin.transfer.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "public.cruise_language_service")
public class CruiseLanguageService
{
    @Id
    @Column(name = "cruise_language_service_id", nullable = false)
    private Long cruiseLanguageServiceId;

    @Column(name = "name")
    @Size(min = 1, max = 256)
    private String name;

    @Column(name = "icon_class")
    @Size(min = 1, max = 128)
    private String iconClass;

    public Long getCruiseLanguageServiceId()
    {
        return cruiseLanguageServiceId;
    }

    public void setCruiseLanguageServiceId(Long cruiseLanguageServiceId)
    {
        this.cruiseLanguageServiceId = cruiseLanguageServiceId;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getIconClass()
    {
        return iconClass;
    }

    public void setIconClass(String iconClass)
    {
        this.iconClass = iconClass;
    }

    @Override
    public String toString()
    {
        return "CruiseLanguageService [cruiseLanguageServiceId="
                + cruiseLanguageServiceId + ", name=" + name + ", iconClass="
                + iconClass + "]";
    }
}
