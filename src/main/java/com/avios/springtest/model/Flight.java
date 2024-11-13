package com.avios.springtest.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;


public class Flight {
    @NotNull
    private String departureIATA;

    @NotNull
    private String arrivalIATA;

    @NotNull
    @Pattern(regexp = "[MWJF]")
    private CabinCode cabinCode;

    private int avios;

    public String getDepartureIATA() {
        return departureIATA;
    }

    public void setDepartureIATA(String departureIATA) {
        this.departureIATA = departureIATA;
    }

    public String getArrivalIATA() {
        return arrivalIATA;
    }

    public void setArrivalIATA(String arrivalIATA) {
        this.arrivalIATA = arrivalIATA;
    }

    public CabinCode getCabinCode() {
        return cabinCode;
    }

    public void setCabinCode(CabinCode cabinCode) {
        this.cabinCode = cabinCode;
    }

    public int getAvios() {
        return avios;
    }

    public void setAvios(int avios) {
        this.avios = avios;
    }
}