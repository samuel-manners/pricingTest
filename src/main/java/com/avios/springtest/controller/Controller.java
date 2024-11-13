package com.avios.springtest.controller;

import com.avios.springtest.model.*;
import com.avios.springtest.service.PricingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class Controller {

    private PricingService pricingService;

    @Autowired
    public Controller(PricingService pricingService) {
        this.pricingService = pricingService;
    }

    @PostMapping("/product-prices")
    public PricingResponse retrievePrices(@RequestBody PricingRequest request) {
        PricingResponse response = new PricingResponse();
        Flight flight = request.getFlight();

        Flight completedFlightDetails = pricingService.getFlightRewards(flight);
        response.setFlight(completedFlightDetails);

        return response;
    }
}