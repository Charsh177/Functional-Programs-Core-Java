import java.util.Scanner;

public class Quadratic {

    public static void main(String[] args) {

        // value a, b and c
        Scanner value = new Scanner(System.in);

        System.out.println("Enter value 1 : ");
        double a = value.nextDouble();
        System.out.println("Enter value 2 : ");
        double b = value.nextDouble();
        System.out.println("Enter value 3 : ");
        double c = value.nextDouble();

        double root1; double root2;

        // Calculate the determinant (b2 - 4ac)
        double determinant = b * b - 4 * a * c;

        // Check if determinant is greater than 0

        if (determinant > 0) {

            // Two real and distinct roots
            root1 = (-b + Math.sqrt(determinant)) / (2 * a);
            root2 = (-b - Math.sqrt(determinant)) / (2 * a);
            System.out.format("root1 = %.2f and root2 = %.2f", root1, root2);
        }

        // check if determinant is equal to zero

        else if (determinant == 0) {

            // two real and equal roots
            // determinant is equal to 0
            // so -b + 0 == -b
            root1 = root2 = -b / (2 * a);
            System.out.format("root1 = root2 = %.2f;", root1);
        }
        else {

            // roots are complex number and distinct

            double real = -b / (2 * a);
            double imaginary = Math.sqrt(-determinant) / (2 * a);
            System.out.format("root1 = %.2f+%.2fi", real, imaginary);
            System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
        }
    }
}
