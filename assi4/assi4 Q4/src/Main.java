import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double s1,s2,s3;
        s1= scanner.nextDouble();
        s2= scanner.nextDouble();
        s3= scanner.nextDouble();

        String color;
        boolean filled;

        color= scanner.next();
        filled= scanner.nextBoolean();

        Triangle triangle = new Triangle(s1,s2,s3,color,filled);
    }
}