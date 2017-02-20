/**
 * @author Chris Machala
 * @email Chm60@aber.ac.uk
 * @version 1.0
 */
public class Clock {

        private Time alarmTime;
        private Time currentTime;
        private boolean alarmSet;

    /**
     * Constructor for objects of class Clock
     *
     * @param startAlarmTime becomes initial alarmTime time.
     * @param startCurrentTime becomes initial currentTime time.
     * @param startAlarmSet becomes initial alarmSet state.
     *
     */

    public Clock(Time startAlarmTime, Time startCurrentTime, boolean startAlarmSet){

        alarmTime = startAlarmTime;
        currentTime = startCurrentTime;
        alarmSet = startAlarmSet;

    }

    @Override
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
