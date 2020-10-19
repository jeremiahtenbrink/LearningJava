import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int studentAge = 15;
        double someNumber = 3.45;

        boolean hasPrefectAttendance = true;
        String firstName = "Jeremiah";
        String lastName = "Tenbrink";

        char firstInital = firstName.charAt(0);
        char lastInital = lastName.charAt(0);

        System.out.println(firstName + " " + lastName + " has a GPA of " + someNumber);
        System.out.println("What do you want to update it to?");

        Scanner input = new Scanner(System.in);
        someNumber = input.nextDouble();

        System.out.println(firstName + " " + lastName + " now has a GPA of " + someNumber);
    }

}
