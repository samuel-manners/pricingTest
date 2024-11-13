package com.avios.springtest.model;

public class PricingError {
    private final int code;
    private final String reason;

    public PricingError(int code, String reason) {
        this.code = code;
        this.reason = reason;
    }

    public int getCode() {
        return code;
    }

    public String getReason() {
        return reason;
    }
}
