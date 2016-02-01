package net.maliavin.transfer.service;

import java.util.List;

import net.maliavin.transfer.domain.Company;

public interface CompanyService
{
    public void add(List<? extends Company> companies);
}
