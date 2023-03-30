package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void setPrevStation() {
        Radio prevStation = new Radio();

        prevStation.setCurrentStationNumber(5);

        prevStation.prevStation();

        int expected = 4;
        int actual = prevStation.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setPrevStationBelowMin() {
        Radio prevStation = new Radio();

        prevStation.setCurrentStationNumber(0);

        prevStation.prevStation();

        int expected = 9;
        int actual = prevStation.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void notSetPrevStatoinNumber() {
        Radio prevStation = new Radio();

        prevStation.setCurrentStationNumber(-2);

        int expected = 0;
        int actual = prevStation.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNextStation() {
        Radio nextStation = new Radio();

        nextStation.setCurrentStationNumber(4);

        nextStation.nextStation();

        int expected = 5;
        int actual = nextStation.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNextStationAboveMax() {
        Radio nextStation = new Radio();

        nextStation.setCurrentStationNumber(9);

        nextStation.nextStation();

        int expected = 0;
        int actual = nextStation.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void notSetNextStatoinNumber() {
        Radio nextStation = new Radio();

        nextStation.setCurrentStationNumber(11);

        int expected = 0;
        int actual = nextStation.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume() {
        Radio increase = new Radio();

        increase.setCurrentVolume(50);

        increase.increaseVolume();

        int expected = 51;
        int actual = increase.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void notIncreaseVolumeAboveMax() {
        Radio increase = new Radio();

        increase.setCurrentVolume(101);

        int expected = 0;
        int actual = increase.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume() {
        Radio decrease = new Radio();

        decrease.setCurrentVolume(50);

        decrease.decreaseVolume();

        int expected = 49;
        int actual = decrease.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void notDecreaseVolumeBelowMin() {
        Radio decrease = new Radio();

        decrease.setCurrentVolume(-1);

        int expected = 0;
        int actual = decrease.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setMinDecreaseVolume() {
        Radio minDecrease = new Radio();

        minDecrease.setCurrentVolume(0);

        minDecrease.decreaseVolume();

        int expected = 0;
        int actual = minDecrease.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setMaxIncreaseVolume() {
        Radio maxIncrease = new Radio();

        maxIncrease.setCurrentVolume(100);

        maxIncrease.increaseVolume();

        int expected = 100;
        int actual = maxIncrease.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
