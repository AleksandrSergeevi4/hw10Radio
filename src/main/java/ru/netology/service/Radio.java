package ru.netology.service;

public class Radio {
    private int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setIncreaseVolume(int newIncreaseVolume) {
        if (newIncreaseVolume < 100) {
            newIncreaseVolume = newIncreaseVolume + 1;
        }
        if (newIncreaseVolume > 100) {
            return;
        }
        currentVolume = newIncreaseVolume;
    }

    public void setDecreaseVolume(int newDecreaseVolume) {
        if (newDecreaseVolume > 0) {
            newDecreaseVolume = newDecreaseVolume - 1;
        }
        if (newDecreaseVolume < 0) {
            return;
        }
        currentVolume = newDecreaseVolume;
    }

    private int currentStationNumber;

    public int getCurrentStationNumber() {
        return currentStationNumber;
    }

    public void setNextStationNumber(int newStationNumber) {
        if (newStationNumber >= 0) {
            newStationNumber = newStationNumber + 1;
        }
        if (newStationNumber > 9) {
            newStationNumber = 0;
        }
        if (newStationNumber < 0) {
            return;
        }
        currentStationNumber = newStationNumber;
    }

    public void setPrevStationNumber(int newStationNumber) {
        if (newStationNumber <= 9) {
            newStationNumber = newStationNumber - 1;
        }
        if (newStationNumber < 0) {
            newStationNumber = 9;
        }
        if (newStationNumber > 9) {
            return;
        }
        currentStationNumber = newStationNumber;
    }

    public void installStationNumber(int newStationNUmber) {
        if (newStationNUmber < 0) {
            return;
        }
        if (newStationNUmber > 9) {
            return;
        }
        currentStationNumber = newStationNUmber;
    }
}