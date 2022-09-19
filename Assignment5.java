// Assignment #: 5
//         Name: Suvan Kumar
//    StudentID: 1221910898
//      Lecture: MWF 10:10 - 11am
//  Description:

import java.io.*;         //to use InputStreamReader and BufferedReader
import java.util.*;       //to use ArrayList

public class Assignment5 {
	public static void main(String[] args) {
        char input;
        String line;
        String inputInfo;

        // ArrayList used to store the aircraft objects
        ArrayList<AircraftEntity> aircraftList = new ArrayList<>();

        try{
            System.out.println("Welcome to the aircraft stats simulator!");
            printMenu();

            // create a BufferedREader object to read input from a keyboard
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader stdin = new BufferedReader(isr);

            do{
                System.out.println("\nWhat action would you like to perform?");
                line = stdin.readLine().trim();
                input = line.charAt(0);
                input = Character.toUpperCase(input);

                if(line.length() == 1){
                    switch (input){
                        case 'A': // add aircraft to the fleet
                            System.out.println("Please enter your aircraft stats:");
                            inputInfo = stdin.readLine().trim();
                            /**********************************************************************************************************
                            **  ADD code here to create an aircraft object (child of AircraftEntity) and add it to the aircraft list **
                            **********************************************************************************************************/
                            aircraftList.add(AircraftParser.parseNewAircraft(inputInfo));
                            

                            break;

                        case 'C': // calculate attack powers
                            /*********************************************************************************
                            **  ADD code here to compute the attack power for all the aircrafts in the list **
                            *********************************************************************************/
                            
                            System.out.println("Attack powers computed");
                            break;

                        case 'D': // how many aircrafts have attack power equal to or larger than a user-defined value
                            System.out.print("Please enter a minimum attack power you want to calculate:\n");
                            inputInfo = stdin.readLine().trim();
                            int min = Integer.parseInt(inputInfo);
                            int count = 0;
                            /***********************************************************************************************************
                            **  ADD code here to count how many aircrafts in the list have attack powers equal to or larger than input**
                            ***********************************************************************************************************/
                            System.out.println("The number of aircrafts with " + min
                                    + " attack powers or more is: " + count);
                            break;

                        case 'L': // list aircrafts
                            /***********************************************************
                            **  ADD code here to print all aircrafts in the list 
                            **  If the list is empty print "No aircrafts in the fleet yet.\n"
                            ************************************************************/
                            if (aircraftList.isEmpty()) {
                                System.out.println("No aircrafts in the fleet yet.");
                            }
                            else {
                                for (int i = 0; i < aircraftList.size(); i++) {
                                    System.out.println(aircraftList.get(i));
                                }
                            }
                            break;

                        case 'Q':
                            break;

                        case '?':
                            printMenu();
                            break;

                        default:
                            System.out.println("Unknown action\n");
                            break;
                    }
                }
                else
                    System.out.println("Unknown action");

            }while (input != 'Q');
        }
        catch(IOException e){
            System.out.println("IO Exception");
        }
	}
	
    public static void printMenu(){
        System.out.print("Choice\t\tAction\n" +
                "------\t\t------\n" +
                "A\t\tAdd Aircraft\n" +
                "C\t\tCompute Attack Power\n" +
                "D\t\tCalculate the Number of Aircrafts with Minimum Attack Power\n" +
                "L\t\tList Aircrafts\n" +
                "Q\t\tQuit\n" +
                "?\t\tDisplay Help\n\n");
    }
}
