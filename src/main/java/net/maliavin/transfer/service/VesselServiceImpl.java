package net.maliavin.transfer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.maliavin.transfer.dao.VesselDAO;
import net.maliavin.transfer.domain.Vessel;

@Service("vesselService")
public class VesselServiceImpl implements VesselService
{

    @Autowired
    private VesselDAO vesselDAO;

    @Transactional
    public void add(List<? extends Vessel> vessels)
    {
        for (Vessel vessel : vessels)
        {
            vesselDAO.add(vessel);
        }
    }

}
