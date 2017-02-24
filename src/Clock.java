/**
 * @author Chris Machala
 * @email Chm60@aber.ac.uk
 * @version 1.0
 */
public class Clock {

        private Time alarmTime;
        private Time currentTime;
        private boolean alarmSet;

    /** MAX_ROADS represents the maximum number of roads that can be connected to a Settlement object. */



    /**
     * Constructor for objects of class Clock
     *
     * @param alarmState becomes initial alarmSet state.
     *
     */

    public Clock( boolean alarmState){


        alarmSet = alarmState;

    }

    /**
     * @return clock variables
     */

    public String toString() {
        return "Clock{" +
                "alarmTime=" + alarmTime +
                ", currentTime=" + currentTime +
                ", alarmSet=" + alarmSet +
                '}';
    }

    /**
     * get method for alarmTime
     * @return alarmTime
     */
    public Time getAlarmTime() {
        return alarmTime;
    }

    /**
     * set method for alarmTime
     * @param alarmTime
     */
    public void setAlarmTime(Time alarmTime) {
        this.alarmTime = alarmTime;
    }

    /**
     * get method for currentTime
     * @return Time
     */
    public Time getCurrentTime() {
        return currentTime;
    }

    /**
     * set Method for currentTime
     * @param currentTime
     */
    public void setCurrentTime(Time currentTime) {
        this.currentTime = currentTime;
    }

    /**
     * get method for alarmSet
     * @return alarmSet
     */
    public boolean isAlarmSet() {
        return alarmSet;
    }

    /**
     * set method for alarmSet
     * @param alarmSet
     */
    public void setAlarmSet(boolean alarmSet) {
        this.alarmSet = alarmSet;
    }
}
