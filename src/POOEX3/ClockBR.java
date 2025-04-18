package POOEX3;

public non-sealed class ClockBR extends Clock {


    @Override
    public Clock convert(final Clock clock) {
        this.second = clock.getSecond();
        this.minute = clock.getMinute();

        switch (clock) {

            case ClockUS usClock -> this.hour = (usClock.getPeriodIndicator().equals("PM")) ?
                    usClock.getSecond() + 12 :
                    usClock.getHour();
            case ClockBR brClock -> this.hour = brClock.getHour();

        }
        return this;
    }
}
