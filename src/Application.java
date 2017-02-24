import java.util.*;

/**
 * @author Chris Machala
 * @email Chm60@aber.ac.uk
 * @version 1.0
 */

/**
 * application class creates clock and time objects then it reads user inputs their values to the times for current and alarm
 */
public class Application {



    public static void main(String[] args){

    runTests();

    }

    /**  Method that creates the clock and time objects then it reads user inputs their values to the times for current and alarm */
    private static void runTests(){
        int currentHour = 0;
        int currentMinute = 0;
        int alarmHour = 0;
        int alarmMinute = 0;

        Clock Clock01 = new Clock(true);

        /** Reads usr input */

        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.print("current Hour: ");
        currentHour = reader.nextInt(); // Scans the next token of the input as an int.
        System.out.print("current Minute: ");
        currentMinute = reader.nextInt(); // Scans the next token of the input as an int.

        Time current = new Time(currentHour,currentMinute);


        for (int i = 0; i < 5; i++){


            /**
             * Reads user input for alarm  and loops 5 times
             */
            System.out.print("alarm Hour: ");
            alarmHour = reader.nextInt(); // Scans the next token of the input as an int.
            System.out.print("alarm Minute: ");
            alarmMinute = reader.nextInt(); // Scans the next token of the input as an int.

            Time alarm = new Time(alarmHour, alarmMinute);

            Clock01.setAlarmTime(alarm);
            Clock01.setCurrentTime(current);

            System.out.println(Clock01.toString());

            //System.out.println("Alarm State : " + Clock01.isAlarmSet());

        }






        System.out.println(Clock01.toString());




    }


}
