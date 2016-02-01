package net.maliavin.transfer.service;

import java.util.List;

import net.maliavin.transfer.domain.CruiseCategory;

public interface CruiseCategoryService
{
    public void add(List<? extends CruiseCategory> cruiseCategories);
}
