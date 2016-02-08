package net.maliavin.transfer.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "public.company_category")
public class CompanyCategory
{

    @Id
    @Column(name = "company_category_id", nullable = false)
    private Long companyCategoryId;
    
    @Column(name = "name")
    @NotNull
    @Size(min = 1, max = 256)
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
