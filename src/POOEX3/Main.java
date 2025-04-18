package POOEX3;

public class Main {
    public static void main(String[] args) {
        Clock brlClock = new ClockBR();
        brlClock.setSecond(0);
        brlClock.setMinute(0);
        brlClock.setHour(12);


        System.out.println(brlClock.getTime());
        System.out.println(new ClockUS().convert(brlClock).getTime());
    }
}
