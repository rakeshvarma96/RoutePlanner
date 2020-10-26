package com.mmt.route.planning.controllers;

import com.mmt.route.planning.models.APIResponse;
import com.mmt.route.planning.models.ViewRouteRequest;
import com.mmt.route.planning.services.RoutePlanningService;
import com.mmt.route.planning.util.CommonUtility;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Map;

@RestController
@RequestMapping("/api/routes")
public class RoutePlanningController {

    private static final Logger LOGGER = LoggerFactory.getLogger(RoutePlanningController.class);

    @Autowired
    private RoutePlanningService routePlanningService;

    @GetMapping("/hc")
    @Produces(MediaType.APPLICATION_JSON)
    public String getMessage() {
        return "Server returning 200 status\n";
    }

    @PostMapping("/find")
    @Produces(MediaType.APPLICATION_JSON)
    public Map<String, Object> findRoutes(@Valid @RequestBody ViewRouteRequest viewRouteRequest) {
        LOGGER.info("Received the request for find routes: {}", viewRouteRequest);
        return CommonUtility.formatResponse(
                new APIResponse(200,
                        "Trips for the given route have successfully been fetched",
                        "success",
                        routePlanningService.findRoutes(viewRouteRequest)));
    }
}
