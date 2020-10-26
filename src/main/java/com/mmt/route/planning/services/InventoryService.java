package com.mmt.route.planning.services;

import com.mmt.route.planning.models.InventoryDetails;
import com.mmt.route.planning.util.CommonUtility;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class InventoryService {
    private Map<String, Map<String, List<InventoryDetails>>> inventoryMap;

    InventoryService() {
        inventoryMap = new HashMap<>();
        populateTrips();
    }

    public List<InventoryDetails> findAllTrips(
            String from, String to, String startDate
    ) {
        List<InventoryDetails> trips
                = new ArrayList<>();
        String route = CommonUtility.getRoute(from, to);
        if (Objects.nonNull(inventoryMap.get(startDate))
                && Objects.nonNull(inventoryMap.get(startDate).get(route))) {
            return inventoryMap.get(startDate).get(route);
        }
        return trips;
    }

    public void populateTrips() {
        inventoryMap.putIfAbsent("2020-10-25", new HashMap<>());
        inventoryMap.putIfAbsent("2020-10-26", new HashMap<>());
        inventoryMap.putIfAbsent("2020-10-27", new HashMap<>());
        inventoryMap.putIfAbsent("2020-10-28", new HashMap<>());
        inventoryMap.get("2020-10-25")
                .put("Bengaluru:Hyderabad", new ArrayList<>(
                        List.of(new InventoryDetails(
                                        "10:30", "2020-10-25", "11:45", "2020-10-25", 3500, 75
                                ),
                                new InventoryDetails(
                                        "12:30", "2020-10-25", "13:30", "2020-10-25", 3800, 60
                                ))
                ));
    }
}
