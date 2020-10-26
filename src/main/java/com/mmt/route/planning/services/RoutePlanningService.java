package com.mmt.route.planning.services;

import com.mmt.route.planning.interfaces.Sortby;
import com.mmt.route.planning.models.InventoryDetails;
import com.mmt.route.planning.models.ViewRouteRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoutePlanningService {

    @Autowired
    private SortbyFactory sortbyFactory;

    public List<InventoryDetails> findRoutes(ViewRouteRequest viewRouteRequest) {
        Sortby sortby = sortbyFactory.createSortby(viewRouteRequest.getSortBy());
        return sortby.fetchTrips(
                viewRouteRequest.getFrom(),
                viewRouteRequest.getTo(),
                viewRouteRequest.getDate()
        );
    }
}
