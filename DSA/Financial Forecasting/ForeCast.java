
import java.util.*;

public class ForeCast {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double currentValue = sc.nextDouble();
        int forecastYear = sc.nextInt();
        double percentage = sc.nextDouble();

        double futureValue = Futurevalue(currentValue, forecastYear, percentage);

        System.out.println("Current Value: " + currentValue);
        System.out.println("Future Value after " + forecastYear + " years: " + futureValue);

        sc.close();
    }

    public static double Futurevalue(double CV, int Y, double P) {

        if (Y == 0)
            return CV;

        double previousValue = Futurevalue(CV, Y - 1, P);

        return previousValue + (previousValue * P / 100);
    }
}