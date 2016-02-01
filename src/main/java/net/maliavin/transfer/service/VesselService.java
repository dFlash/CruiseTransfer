package net.maliavin.transfer.service;

import java.util.List;

import net.maliavin.transfer.domain.Vessel;

public interface VesselService
{
    public void add(List<? extends Vessel> vessels);
}
