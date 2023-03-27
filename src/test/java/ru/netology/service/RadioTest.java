package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void increaseLevelVolume() {
        Radio level = new Radio();

        level.setIncreaseVolume(99);

        int expected = 100;
        int actual = level.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void notIncreaseLevelVolume() {
        Radio level = new Radio();

        level.setIncreaseVolume(102);

        int expected = 0;
        int actual = level.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseLevelVolume() {
        Radio level = new Radio();

        level.setDecreaseVolume(4);

        int expected = 3;
        int actual = level.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void notDecreaseLevelVolume() {
        Radio level = new Radio();

        level.setDecreaseVolume(-1);

        int expected = 0;
        int actual = level.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStationNumber() {
        Radio nextStation = new Radio();

        nextStation.setNextStationNumber(1);

        int expected = 2;
        int actual = nextStation.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStationForMaxNumber() {
        Radio nextStation = new Radio();

        nextStation.setNextStationNumber(9);

        int expected = 0;
        int actual = nextStation.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void notNextRadioStationNumber() {
        Radio nextStation = new Radio();

        nextStation.setNextStationNumber(-11);

        int expected = 0;
        int actual = nextStation.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStationNumber() {
        Radio nextStation = new Radio();

        nextStation.setPrevStationNumber(2);

        int expected = 1;
        int actual = nextStation.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStationForMinNumber() {
        Radio prevStation = new Radio();

        prevStation.setPrevStationNumber(0);

        int expected = 9;
        int actual = prevStation.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void notPrevRadioStationNumber() {
        Radio prevStation = new Radio();

        prevStation.setPrevStationNumber(11);

        int expected = 0;
        int actual = prevStation.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void installCurrentStationNumber() {
        Radio install = new Radio();

        install.installStationNumber(5);

        int expected = 5;
        int actual = install.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void notInstallCurrentStationNumberAboveMin() {
        Radio install = new Radio();

        install.installStationNumber(-11);

        int expected = 0;
        int actual = install.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void notInstallCurrentStationNumberAboveMax() {
        Radio install = new Radio();

        install.installStationNumber(11);

        int expected = 0;
        int actual = install.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }
}
