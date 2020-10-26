package com.mmt.route.planning.models;

import lombok.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ViewRouteRequest {
    @NotBlank(message = "from city cannot be blank")
    private String from;
    @NotBlank(message = "to city cannot be blank")
    private String to;
    @NotBlank(message = "date of travel cannot be blank")
    @Pattern(regexp = "([12]\\d{3}-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01]))", message = "date should be of the format yyyy-mm-dd")
    private String date;
    @NotBlank(message = "sortBy cannot be blank")
    @Pattern(regexp = "^(FARE|DURATION)$", message = "sortBy can be either FARE or DURATION")
    private String sortBy;
}
