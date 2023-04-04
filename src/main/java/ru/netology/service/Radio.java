package ru.netology.service;

public class Radio {
    private int currentStationNumber;
    private int minStationNumber = 0;
    private int maxStationNumber = 9;
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio() {

    }

    public Radio(int amountOfStations) {
        this.maxStationNumber = amountOfStations - 1;
    }

    public int getCurrentStationNumber() {
        return currentStationNumber;
    }

    public void setCurrentStationNumber(int newStationNumber) {
        if (newStationNumber < minStationNumber) {
            return;
        }
        if (newStationNumber > maxStationNumber) {
            return;
        }
        currentStationNumber = newStationNumber;
    }

    public void nextStation() {
        if (currentStationNumber < maxStationNumber) {
            currentStationNumber++;
        } else {
            currentStationNumber = minStationNumber;
        }
    }

    public void prevStation() {
        if (currentStationNumber > minStationNumber) {
            currentStationNumber--;
        } else {
            currentStationNumber = maxStationNumber;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newVolume) {
        if (newVolume < minVolume) {
            return;
        }
        if (newVolume > maxVolume) {
            return;
        }
        currentVolume = newVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
    }
}