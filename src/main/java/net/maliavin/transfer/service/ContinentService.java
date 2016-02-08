package net.maliavin.transfer.service;

import java.util.List;

import net.maliavin.transfer.domain.Continent;

public interface ContinentService
{
    public void add(List<? extends Continent> continents);
}
