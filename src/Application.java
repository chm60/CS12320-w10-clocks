import java.util.*;

/**
 * @author Chris Machala
 * @email Chm60@aber.ac.uk
 * @version 2.0
 */

/**
 * application class creates clock and time objects then it reads user inputs their values to the times for current and alarm
 */
public class Application {


    public static void main(String[] args) {

        runTests();

    }


    /**
     * Method that creates the clock and time objects then it reads user inputs their values to the times for current and alarm
     */
    private static void runTests() {
        int currentHour = 0;
        int currentMinute = 0;
        int alarmHour = 0;
        int alarmMinute = 0;

        Clock Clock01 = new Clock(true);
        runMenuWithForLoop(Clock01);
        //  runMenuWithWhileLoop(Clock01);

/** old for loop that takes user input for setting current and alarm time and alarm state */
//       /** Reads usr input */
//
//        Scanner reader = new Scanner(System.in);  // Reading from System.in
//        System.out.print("current Hour: ");
//        currentHour = reader.nextInt(); // Scans the next token of the input as an int.
//        System.out.print("current Minute: ");
//        currentMinute = reader.nextInt(); // Scans the next token of the input as an int.
//
//        Time current = new Time(currentHour,currentMinute);
//
//
//        for (int i = 0; i < 5; i++){
//
//
//            /**
//             * Reads user input for alarm  and loops 5 times
//             */
//            System.out.print("alarm Hour: ");
//            alarmHour = reader.nextInt(); // Scans the next token of the input as an int.
//            System.out.print("alarm Minute: ");
//            alarmMinute = reader.nextInt(); // Scans the next token of the input as an int.
//
//            Time alarm = new Time(alarmHour, alarmMinute);
//
//            Clock01.setAlarmTime(alarm);
//            Clock01.setCurrentTime(current);
//
//            System.out.println(Clock01.toString());
//
//            //System.out.println("Alarm State : " + Clock01.isAlarmSet());
//
//        }


    }

    /** Method that creates a menu in the command line which allows users to pass certain input using a while loop
     * RUN MENU USING A WHILE LOOP IS FOUND HERE **/
//     private static void runMenuWithWhileLoop(Clock clockObject){
//
//        int i=0;
//        do{
//            System.out.println("Press 1 to change the current time");
//            System.out.println("Press 2 to set the alarm time");
//            System.out.println("Press 3 to set the state of the alarm, the current state is : " + clockObject.isAlarmSet());
//            System.out.println("Press 4 to check the clock status");
//            System.out.println("Press 5 to quit");
//
//            Scanner reader = new Scanner(System.in);  // Reading from System.in
//
//            int option =  reader.nextInt();
//            int currentHour;
//            int currentMin;
//            int alarmHour;
//            int alarmMin;
//
//
//            switch(option) {
//                /**
//                 * Sets current time( hour and minute ) also performs checks to see if time exists
//                 */
//                case 1 :
//                    System.out.print("current Hour: ");
//                    currentHour = reader.nextInt(); // Scans the next token of the input as an int.
//                    /**
//                     * restriction on what time you can enter here, for hour value has to be between 0 and 23
//                     */
//                    while (currentHour < 0 || currentHour > 23){
//                        System.out.println("No such time, please try again!");
//                        System.out.print("current Hour: ");
//                        currentHour = reader.nextInt();
//                    }
//                    System.out.print("current Minute: ");
//                    currentMin = reader.nextInt(); // Scans the next token of the input as an int.
//                    /**
//                     * restriction on what time you can enter here, for minute value has to be between 0 and 59
//                     */
//                    while (currentMin < 0 || currentMin > 59){
//                        System.out.println("No such time, please try again!");
//                        System.out.print("current Min: ");
//                        currentMin = reader.nextInt();
//                    }
//                    Time current = new Time(currentHour,currentMin);
//                    clockObject.setCurrentTime(current);
//                    break;
//                /**
//                 * Sets alarm time( hour and minute ) also performs checks to see if time exists
//                 */
//                case 2 :
//                    System.out.print("alarm Hour: ");
//                    alarmHour = reader.nextInt(); // Scans the next token of the input as an int.
//
//                    /**
//                     * restriction on what time you can enter here, for hour value has to be between 0 and 23
//                     */
//                    while (alarmHour < 0 || alarmHour > 23) {
//                        System.out.println("No such time, please try again!");
//                        System.out.print("alarm Hour: ");
//                        alarmHour = reader.nextInt();
//                    }
//                    System.out.print("alarm Minute: ");
//                    alarmMin = reader.nextInt(); // Scans the next token of the input as an int.
//                    /**
//                     * restriction on what time you can enter here, for minute value has to be between 0 and 59
//                     */
//                    while (alarmMin < 0 || alarmMin > 59){
//                        System.out.println("No such time, please try again!");
//                        System.out.print("alarm Min: ");
//                        alarmMin = reader.nextInt();
//                    }
//                    Time alarm = new Time(alarmHour,alarmMin);
//                    clockObject.setAlarmTime(alarm);
//                    break;
//                /**
//                 * Inverses alarm state
//                 */
//                case 3 :
//                    boolean alarmState = clockObject.isAlarmSet();
//                    clockObject.setAlarmSet(!alarmState);
//                    System.out.println("The alarm state is now : " + clockObject.isAlarmSet() + "\n");
//                    break;
//                /**
//                 * Prints object toString
//                 */
//                case 4 :
//                    System.out.println(clockObject.toString());
//                    break;
//                /**
//                 * quit menu
//                 */
//                case 5 :
//                    i = 5;
//                    break;
//
//
//                default :
//                    System.out.println("Boy you fucked up man");
//            }
//
//
//
//            i++;
//
//
//}
//  while(i<5);
//
//
//
//    }
    /** RUN MENU USING A WHILE LOOP ENDS HERE*/


    /**
     * Method that creates a menu in the command line which allows users to pass certain input using a for loop
     * RUN MENU USING A FOR LOOP IS FOUND HERE
     */

    private static void runMenuWithForLoop(Clock clockObject) {

        for (int i = 0; i < 5; i++) {

            System.out.println("Press 1 to change the current time");
            System.out.println("Press 2 to set the alarm time");
            System.out.println("Press 3 to set the state of the alarm, the current state is : " + clockObject.isAlarmSet());
            System.out.println("Press 4 to check the clock status");
            System.out.println("Press 5 to quit");

            Scanner reader = new Scanner(System.in);  // Reading from System.in

            int option = reader.nextInt();
            int currentHour;
            int currentMin;
            int alarmHour;
            int alarmMin;


            switch (option) {
                /**
                 * Sets current time( hour and minute ) also performs checks to see if time exists
                 */
                case 1:

                    Time current = new Time(0, 0);

                    int ch =0;
                    int cm = 0;

                    do {

                        if (ch>= 1){

                            System.out.println("Sorry but the value you entered is not a valid hour, please enter a number between 0 and 23");
                        }

                        System.out.print("current Hour: ");
                        currentHour = reader.nextInt(); // Scans the next token of the input as an
                        ch++;

                    } while (current.setHour(currentHour) == false);

                    do {

                        if (cm>= 1){

                            System.out.println("Sorry but the value you entered is not a valid minute, please enter a number between 0 and 59");
                        }

                        System.out.print("current Min: ");
                        currentMin = reader.nextInt(); // Scans the next token of the input as an
                        cm++;


                    } while (current.setMinute(currentMin) == false);

                    clockObject.setCurrentTime(current);


                    break;
                /**
                 * Sets alarm time( hour and minute ) also performs checks to see if time exists
                 */


                case 2:
                    Time alarm = new Time(0, 0);
                    int ah = 0;
                    int am =0 ;

                    do {

                        if (ah>= 1){

                            System.out.println("Sorry but the value you entered is not a valid hour, please enter a number between 0 and 23");
                        }


                        System.out.print("alarm Hour: ");
                        alarmHour = reader.nextInt(); // Scans the next token of the input as an int.
                        ah++;

                    } while (alarm.setHour(alarmHour) == false);

                    do {


                        System.out.print("alarm Minute: ");
                        alarmMin = reader.nextInt(); // Scans the next token of the input as an


                    } while (alarm.setMinute(alarmMin) == false);
                    clockObject.setAlarmTime(alarm);


                    break;
                /**
                 * Inverses alarm state
                 */
                case 3:
                    boolean alarmState = clockObject.isAlarmSet();
                    clockObject.setAlarmSet(!alarmState);
                    System.out.println("The alarm state is now : " + clockObject.isAlarmSet() + "\n");
                    break;
                /**
                 * Prints object toString
                 */
                case 4:
                    System.out.println(clockObject.toString());
                    break;
                /**
                 * quit menu
                 */
                case 5:
                    i = 5;
                    break;


                default:
                    System.out.println("Boy you fucked up man");
            }


        }


    }

    /**RUN MENU USING A FOR LOOP ENDS HERE*/


}
