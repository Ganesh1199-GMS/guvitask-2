package guvitask2;
import java.util.Scanner;

public class HotelTariff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the month number: ");
        int month = sc.nextInt();
        System.out.print("Enter the room rent per day: ");
        double rentPerDay = sc.nextDouble();
        System.out.print("Enter the number of days stayed: ");
        int daysStayed = sc.nextInt();

        double totalTariff = rentPerDay * daysStayed;

        switch (month) {
            case 4:
            case 5:
            case 6:
            case 11:
            case 12:
                totalTariff += totalTariff * 0.2; // 20% increase during peak seasons
                break;
        }

        System.out.printf("Hotel Tariff: %.2f\n", totalTariff);
    }
}

