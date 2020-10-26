package com.mmt.route.planning.services;

import com.mmt.route.planning.interfaces.Sortby;
import com.mmt.route.planning.models.InventoryDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
public class ShortestDuration implements Sortby {
    @Autowired
    private InventoryService inventoryService;

    @Override
    public List<InventoryDetails> fetchTrips(String from, String to, String startDate) {
        List<InventoryDetails> trips = inventoryService.findAllTrips(from, to, startDate);
        trips.sort(Comparator.comparingInt(InventoryDetails::getDurationInMin));
        return trips;
    }
}
