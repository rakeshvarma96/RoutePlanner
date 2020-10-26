package com.mmt.route.planning.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class InventoryDetails {
    private String startTime;
    private String departureDate;
    private String endTime;
    private String arrivalDate;
    private int fare;
    private int durationInMin;
}
