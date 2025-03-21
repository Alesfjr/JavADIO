package anotomiadeclasses;

public class SmartTV {

    boolean power = true;
    int channel = 35;
    int volum = 41;

    public void power() {
        power = true;
    }

    public void switchoff() {
        power = false;
    }

    public void volumup() {
        volum++;
    }

    public void volumdown() {
        volum--;
    }

    public void channelup() {
        channel++;
    }

    public void channeldown() {
        channel--;
    }

    public void changechannel( int newchannel ){
        channel = newchannel;
    }
}