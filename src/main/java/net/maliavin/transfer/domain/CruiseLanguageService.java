package net.maliavin.transfer.domain;

public class CruiseLanguageService
{
    private Long cruiseLanguageServiceId;

    private String name;

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
