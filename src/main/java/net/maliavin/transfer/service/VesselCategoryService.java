package net.maliavin.transfer.service;

import java.util.List;

import net.maliavin.transfer.domain.VesselCategory;

public interface VesselCategoryService
{
    public void add(List<? extends VesselCategory> vesselCategories);
}
