package ru.Sobolev.lesson06;

public class Tank {

    private final int maxVolume;
    private int volume;

    public Tank(int maxVolume) {
        this.maxVolume = maxVolume;
        this.volume = 0;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

}
