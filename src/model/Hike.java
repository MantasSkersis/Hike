package model;

import java.io.Serializable;

public class Hike implements Serializable {
    private int distance;
    private String season;
    private int numberoOfPeople;
    private int numberOfPets;
    private int days;
    private int foodSuppliesInDaysForPeople;
    private int foodSuppliesInDaysForPets;
    private String item;

    public Hike(int distance, String season, int numberoOfPeople, int numberOfPets, int days, int foodSuppliesInDaysForPeople, int foodSuppliesInDaysForPets, String item) {
        this.distance = distance;
        this.season = season;
        this.numberoOfPeople = numberoOfPeople;
        this.numberOfPets = numberOfPets;
        this.days = days;
        this.foodSuppliesInDaysForPeople = foodSuppliesInDaysForPeople;
        this.foodSuppliesInDaysForPets = foodSuppliesInDaysForPets;
        this.item = item;
    }

    public Hike() {

    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public int getNumberoOfPeople() {
        return numberoOfPeople;
    }

    public void setNumberoOfPeople(int numberoOfPeople) {
        this.numberoOfPeople = numberoOfPeople;
    }

    public int getNumberOfPets() {
        return numberOfPets;
    }

    public void setNumberOfPets(int numberOfPets) {
        this.numberOfPets = numberOfPets;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getFoodSuppliesInDaysForPeople() {
        return foodSuppliesInDaysForPeople;
    }

    public void setFoodSuppliesInDaysForPeople(int foodSuppliesInDaysForPeople) {
        this.foodSuppliesInDaysForPeople = foodSuppliesInDaysForPeople;
    }

    public int getFoodSuppliesInDaysForPets() {
        return foodSuppliesInDaysForPets;
    }

    public void setFoodSuppliesInDaysForPets(int foodSuppliesInDaysForPets) {
        this.foodSuppliesInDaysForPets = foodSuppliesInDaysForPets;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
}
