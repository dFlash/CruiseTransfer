package net.maliavin.transfer.service;

import java.util.List;

import net.maliavin.transfer.domain.Country;

public interface CountryService
{
    public void add(List<? extends Country> countries);
}
