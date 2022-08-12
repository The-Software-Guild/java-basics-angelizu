package Exercise3;

import java.util.Scanner;

public class HealthyHearts {
    public static void main(String[] args) {
        float age, maxRate, zone1, zone2;
        Scanner scanner = new Scanner(System.in);

        System.out.print("What's your age? ");
        age = Integer.parseInt(scanner.nextLine());

        maxRate = 220 - age;
        System.out.println("Your maximum heart rate should be " + Math.round(maxRate)
                + " beats per minute.");

        zone1 = maxRate * 50 / 100;
        zone2 = maxRate * 85 / 100;
        System.out.println("Your target HR Zone is " + Math.round(zone1) +
                " - " + Math.round(zone2) + " beats per minute.");

    }
}
