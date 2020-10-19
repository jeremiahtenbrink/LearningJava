import java.util.Scanner;

public class Functions {

    public static void announceDeveloperTeaTime(){
        System.out.println("Waiting for developer team time...");
        System.out.println("Type in a random word and press Enter to start devloper tea time. ");
        Scanner input = new Scanner(System.in);
        input.next();
        System.out.println("It's developer tea time!!!");
    }

    public static void main(String[] args){
        announceDeveloperTeaTime();
    }
}
