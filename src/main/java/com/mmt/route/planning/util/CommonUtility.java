package com.mmt.route.planning.util;

import com.google.gson.Gson;
import com.mmt.route.planning.constants.AppConstants;
import com.mmt.route.planning.models.APIResponse;

import javax.ws.rs.core.Response;
import java.util.HashMap;
import java.util.Map;

public class CommonUtility {
    public static String getRoute(String src, String dest) {
        if (!src.isBlank()
                && !dest.isBlank()
                && src.trim().length() != 0
                && dest.trim().length() != 0)
            return src + AppConstants.COLON + dest;
        return AppConstants.EMPTY_STRING;
    }

    public static Map<String, Object> formatResponse(APIResponse apiResponse) {
        Map<String, Object> response = new HashMap<>();
        response.put(AppConstants.STATUS, apiResponse.getStatus());
        response.put(AppConstants.STATUS_CODE, apiResponse.getStatusCode());
        response.put(AppConstants.MESSAGE, apiResponse.getMessage());
        response.put(AppConstants.BODY, apiResponse.getBody());
        return response;
    }
}
