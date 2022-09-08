package com.webnexs.taxinetdriver.pojoClasses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class OvertripDetailsList extends BaseResponse{

    @SerializedName("details")
    @Expose
    private ArrayList<TripDetails> tripDetails = null;

    public ArrayList<TripDetails> getTripDetails() {
        return tripDetails;
    }

    public void setTripDetails(ArrayList<TripDetails> tripDetails) {
        this.tripDetails = tripDetails;
    }
}
