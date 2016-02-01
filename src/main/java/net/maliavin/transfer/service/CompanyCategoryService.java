package net.maliavin.transfer.service;

import java.util.List;

import net.maliavin.transfer.domain.CompanyCategory;

public interface CompanyCategoryService
{
    public void add(List<? extends CompanyCategory> companyCategories);
}
