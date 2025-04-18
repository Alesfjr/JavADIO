package POOEX3;

public non-sealed class ClockUS extends Clock {

    private String periodIndicator;

    public String getPeriodIndicator() {
        return periodIndicator;
    }

    public void setPM(){
        this.periodIndicator="PM";
    }
    public void setAM(){
        this.periodIndicator="AM";
    }


    public void setHour(int hour) {

        setAM();

        if ((hour >= 12) && (hour <= 23)) {
            setPM();
            this.hour = hour - 12;
        }
        else if (hour >= 24){

            this.hour = hour;
        }
        else{
            this.hour = hour;

        }


    }

    @Override
    Clock convert(Clock clock) {
        switch (clock) {

            case ClockUS usClock -> {
                this.hour = usClock.getHour() ;
                this.periodIndicator =usClock.getPeriodIndicator();
            }

            case ClockBR brClock -> this.setHour(brClock.getHour());

        }
        return this;
    }
    @Override
    public  String getTime(){
        return  super.getTime()+ this.periodIndicator;
    }
}



