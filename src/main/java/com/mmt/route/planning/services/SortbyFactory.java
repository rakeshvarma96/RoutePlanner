package com.mmt.route.planning.services;

import com.mmt.route.planning.constants.AppConstants;
import com.mmt.route.planning.interfaces.Sortby;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SortbyFactory {

    @Autowired
    private CheapestRoute cheapestRoute;

    @Autowired
    private ShortestDuration shortestDuration;

    public Sortby createSortby(String attribute) {
        switch (attribute.toLowerCase()) {
            case AppConstants.FARE:
                return cheapestRoute;
            case AppConstants.DURATION:
                return shortestDuration;
            default:
                return null;
        }
    }
}
