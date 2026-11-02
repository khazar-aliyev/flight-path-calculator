import java.util.Scanner;
public class main{
    public static void main(String[] args) {
        double distance;
        double horizontal;
        double vertical;
        double average_speed;
        double time;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter horizontal distance (m): ");
        horizontal=scanner.nextDouble();
        System.out.print("Enter vertical distance (m): ");
        vertical=scanner.nextDouble();
        System.out.print("Enter average speed (m/s): ");
        average_speed=scanner.nextDouble();
        distance=(Math.sqrt((Math.pow(horizontal,2)+Math.pow(vertical,2 ))));
        time=distance/average_speed;
        System.out.printf("Flight distance: %.0f m",distance);
        System.out.printf("%nFlight time: %.2f seconds",time);
        scanner.close();
    }
}
