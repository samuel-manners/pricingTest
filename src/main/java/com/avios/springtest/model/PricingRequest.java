package com.avios.springtest.model;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class PricingRequest {

    @Valid
    @NotNull
    private Flight flight;

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }
}
