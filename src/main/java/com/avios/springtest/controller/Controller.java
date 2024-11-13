package com.avios.springtest.controller;

import com.avios.springtest.model.*;
import com.avios.springtest.service.RewardsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private RewardsService rewardsService;

    @Autowired
    public Controller(RewardsService rewardsService) {
        this.rewardsService = rewardsService;
    }

    @PostMapping("/calculate-rewards")
    public RewardsResponse retrievePrices(@RequestBody RewardsRequest request) {
        RewardsResponse response = new RewardsResponse();
        Flight flight = request.getFlight();

        Flight completedFlightDetails = rewardsService.getFlightRewards(flight);
        response.setFlight(completedFlightDetails);

        return response;
    }
}