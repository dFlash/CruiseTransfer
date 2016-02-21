package net.maliavin.transfer.dao;

import net.maliavin.transfer.domain.CompanyCategory;

public interface CompanyCategoryDAO
{
    public void add(CompanyCategory companyCategory);

    public boolean isMappingPresent(Long companyCategoryRuId);

    public boolean isEntityPresent(CompanyCategory companyCategory);

    public Long getEntityId(CompanyCategory companyCategory);

    public void addMapping(Long uaId, Long ruId);
}
