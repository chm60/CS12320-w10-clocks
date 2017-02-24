import java.util.*;

/**
 * @author Chris Machala
 * @email Chm60@aber.ac.uk
 * @version 1.0
 */
public class Application {



    public static void main(String[] args){



        runTests();


    }






    private static void runTests(){
        int currentHour = 0;
        int currentMinute = 0;
        int alarmHour = 0;
        int alarmMinute = 0;

        Clock Clock01 = new Clock(true);

        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("current Hour: ");
        currentHour = reader.nextInt(); // Scans the next token of the input as an int.
        System.out.println("current Minute: ");
        currentMinute = reader.nextInt(); // Scans the next token of the input as an int.


        for (int i = 0; i < 5; i++){

            System.out.println("alarm Hour: ");
            alarmHour = reader.nextInt(); // Scans the next token of the input as an int.
            System.out.println("alarm Minute: ");
            alarmMinute = reader.nextInt(); // Scans the next token of the input as an int.



        }

        Time current = new Time(currentHour,currentMinute);
        Time alarm = new Time(alarmHour, alarmMinute);

        Clock01.setAlarmTime(alarm);
        Clock01.setCurrentTime(current);

        System.out.println(Clock01.toString());



    }


}
