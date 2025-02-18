package com.tns.placementservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PlacementService {

    @Autowired
    private PlacementRepository placementRepository;

    public List<Placement> getAllPlacements() {
        return placementRepository.findAll();
    }

    public Placement getPlacementById(Long id) {
        return placementRepository.findById(id).orElse(null);
    }

    public Placement addPlacement(Placement placement) {
        return placementRepository.save(placement);
    }

    public Placement updatePlacement(Long id, Placement placementDetails) {
        Placement placement = placementRepository.findById(id).orElse(null);
        if (placement != null) {
            placement.setCompanyName(placementDetails.getCompanyName());
            placement.setRole(placementDetails.getRole());
            placement.setLocation(placementDetails.getLocation());
            placement.setPackageAmount(placementDetails.getPackageAmount());
            return placementRepository.save(placement);
        }
        return null;
    }

    public void deletePlacement(Long id) {
        placementRepository.deleteById(id);
    }
}
