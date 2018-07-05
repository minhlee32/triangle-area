import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        double side1;
        double side2;
        double side3;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter length of first side:");
        side1 = input.nextDouble();
        System.out.println("Enter length of second side:");
        side2 = input.nextDouble();
        System.out.println("Enter length of third side:");
        side3 = input.nextDouble();

        System.out.println(isValid(side1, side2, side3));

        if (isValid(side1,side2,side3)==true) {
            System.out.println("The area of this triangle is: " + area(side1, side2, side3));
        } else {
            System.out.println("This is not a triangle!");
        }


    }

    public static boolean isValid(double side1, double side2, double side3) {
        return side1 < (side2 + side3) && side2 < (side1 + side3) && side3 < (side1 + side2);
    }

    public static double area(double side1, double side2, double side3) {
        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        return area;
    }



}


