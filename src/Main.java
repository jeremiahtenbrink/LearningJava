import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Triangle triangleA = new Triangle(15, 8, 15, 8, 17);
        Triangle triangleB = new Triangle(3, 5, 3, 2, 4);

        double trinagleAArea = triangleA.findArea();
        System.out.println(trinagleAArea);

    }

}
