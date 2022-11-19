package ru.netology.domain;

public class Radio {
    static final int maxStation = 9;
    static final int minStation = 0;
    private int currentStation;
    static final int maxVolume = 10;
    static final int minVolume = 0;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        this.currentStation = currentStation;
    }

    public void setSelectStation(int selectStation) {
        if (selectStation < minStation || selectStation > maxStation) {
            return;
        }
        this.currentStation = selectStation;
    }

    public void setNextStation() {
        if (currentStation == maxStation) {
            this.currentStation = minStation;
        } else {
            this.currentStation = currentStation + 1;
        }
    }

    public void setPrevStation() {
        if (currentStation == minStation) {
            this.currentStation = maxStation;
        } else {
            this.currentStation = currentStation - 1;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public void setVolumeUp() {
        if (currentVolume == maxVolume) {
            return;
        }
        this.currentVolume = currentVolume + 1;
    }

    public void setVolumeDown() {
        if (currentVolume == minVolume) {
            return;
        }
        this.currentVolume = currentVolume - 1;
    }
}

