package com.avios.springtest.service;

import com.avios.springtest.model.*;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class ConfigurationRetriever {
    private double worldTravellerBonus = 0;
    private double worldTravellerPLusBonus = 0.2;
    private double clubWorldBonus = 0.5;
    private double first = 1;

    private final Map<IATAroutes, Integer> aviosRates = new HashMap<>();


    public ConfigurationRetriever() {
        aviosRates.put(IATAroutes.LHRLAX, 4500);
        aviosRates.put(IATAroutes.LHRSFO, 4400);
        aviosRates.put(IATAroutes.LHRJFK, 3200);
        aviosRates.put(IATAroutes.LGWYYZ, 3250);
    }

    public double retrievePricingConfig(IATAroutes IATAroutes, CabinCode cabinCode){
        //Find routes avios rate
        int aviosRate = aviosRates.get(IATAroutes);
        double bonusAviosRate;

        //Find avios bonus rate from cabin code
        if (cabinCode.equals(CabinCode.M)) {
            bonusAviosRate = worldTravellerBonus;
        } else if (cabinCode.equals(CabinCode.W)) {
            bonusAviosRate = worldTravellerPLusBonus;
        } else if (cabinCode.equals(CabinCode.J)) {
            bonusAviosRate = clubWorldBonus;
        }
        else if (cabinCode.equals(CabinCode.F)){
            bonusAviosRate = first;
        } else {
            throw new IllegalArgumentException("Invalid Cabin Code");
        }

        //Calculates reward rate and return the combined reward rate and avios value
        //Could be changed to an object to provide customers info on return request of how much extra avios was earn't by cabin upgrade
        double rewardsRate = (aviosRate * bonusAviosRate);
        return aviosRate + rewardsRate;
    }




}
