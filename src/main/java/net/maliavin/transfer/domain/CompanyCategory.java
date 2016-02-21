package net.maliavin.transfer.domain;

public class CompanyCategory
{
    private Long companyCategoryId;

    private String name;

    public Long getCompanyCategoryId()
    {
        return companyCategoryId;
    }

    public void setCompanyCategoryId(Long companyCategoryId)
    {
        this.companyCategoryId = companyCategoryId;
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
        return "CompanyCategory [companyCategoryId=" + companyCategoryId
                + ", name=" + name + "]";
    }
}
