/**
 * @author Chris Machala
 * @email Chm60@aber.ac.uk
 * @version 1.0
 */
public class Clock {

        private Time alarmTime;
        private Time currentTime;
        private boolean alarmSet;

    // MAX_ROADS represents the maximum number of roads that can be connected to a Settlement object.



    /**
     * Constructor for objects of class Clock
     *
     * @param alarmState becomes initial alarmSet state.
     *
     */

    public Clock( boolean alarmState){


        alarmSet = alarmState;

    }


    public String toString() {
        return "Clock{" +
                "alarmTime=" + alarmTime +
                ", currentTime=" + currentTime +
                ", alarmSet=" + alarmSet +
                '}';
    }


    public Time getAlarmTime() {
        return alarmTime;
    }

    public void setAlarmTime(Time alarmTime) {
        this.alarmTime = alarmTime;
    }

    public Time getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(Time currentTime) {
        this.currentTime = currentTime;
    }

    public boolean isAlarmSet() {
        return alarmSet;
    }

    public void setAlarmSet(boolean alarmSet) {
        this.alarmSet = alarmSet;
    }
}
