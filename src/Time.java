/**
 * @author Chris Machala
 * @email Chm60@aber.ac.uk
 * @version 2.0
 */
public class Time {

    private int hour;
    private int minute;

    /**
     * Constructor for objects of class Time
     *
     * @param startHour becomes initial hour time
     * @param startMinute becomes initial minute time
     *
     */

    public Time ( int startHour, int startMinute){

        hour = startHour;
        minute = startMinute;



    }


    /**
     * @return clock variables
     */

    public String toString() {
        return	String.format("%02d:%02d",	hour,	minute);
//        return "Time{" +
//                "hour=" + hour +
//                ", minute=" + minute +
//                '}';
    }

    /**
     * get method for hour
     * @return hour
     */
    public int getHour() {
        return hour;
    }

    /**
     * set method for hour
     * @param hour
     */
    public boolean setHour(int hour) {

        boolean state;

        /**
         * restriction on what time you can enter here, for minute value has to be between 0 and 59
         */
                        if (hour < 0 || hour > 23){
                    //error
                           state = false;

                                  }else{

                            this.hour = hour;

                            state = true;

        }

        return state;

    }

    /**
     * get method for min
     * @return minute
     */
    public int getMinute() {
        return minute;
    }

    /**
     * set method for min
     * @param minute
     */
    public boolean setMinute(int minute) {

        boolean state;

        /**
         * restriction on what time you can enter here, for minute value has to be between 0 and 59
         */
        if (minute < 0 || minute > 59){
            //error
            state = false;

        }else{

            this.minute = minute;

            state = true;

        }

        return state;

    }
}
