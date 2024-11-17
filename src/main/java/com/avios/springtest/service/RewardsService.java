package com.avios.springtest.service;

import com.avios.springtest.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class RewardsService {

    private final ConfigurationRetriever configurationRetriever;


    //Connects with currency service, config service and avios service
    @Autowired
    public RewardsService(ConfigurationRetriever configurationRetriever) {
        this.configurationRetriever = configurationRetriever;
    }

    public Flight getFlightRewards(Flight flight) {
        //Gets IATA codes and creates a combined code to make a route
        String departureIATA = flight.getDepartureIATA(); String arrivalIATA = flight.getArrivalIATA();
        String iataCombined = departureIATA + arrivalIATA;

        //Sends combined route and cabin code to config retriever to find pricing config
        IATAroutes combinedIATAroutes = IATAroutes.valueOf(iataCombined);
        CabinCode cabinCode = flight.getCabinCode();
        ArrayList<Integer> prices = configurationRetriever.retrievePricingConfig(combinedIATAroutes, cabinCode);

        //Adds to flight object info and returns updated Flight Object with price
        flight.setAvios(prices);
        return flight;
    }

}


