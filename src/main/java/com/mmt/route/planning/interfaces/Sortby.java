package com.mmt.route.planning.interfaces;

import com.mmt.route.planning.models.InventoryDetails;

import java.util.List;

public interface Sortby {
    List<InventoryDetails> fetchTrips(String from, String to, String startDate);
}
