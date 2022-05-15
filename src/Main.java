import java.time.LocalDate;

public class Main {

 // 1 Задание
    private static void printLeapYear(int year) {
        boolean isLeapYear = isLeapYear (year);
        if (isLeapYear) {
            System.out.println("Год " + year + " високосный");
        } else {
            System.out.println("Год " + year + " не високосный");
        }
    }
    private static boolean isLeapYear (int year){
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;

    }

    public static void main(String[] args) {
        int year = 2021; // переменные для 1 задания
        printLeapYear(year);

        int clientOS = 1; // переменные для 2 задания
        int clientDeviceYear = 2016;
        suggestVersion(clientOS, clientDeviceYear);

        int deliveryDistance = 95; // переменные для 3 задания
        int countDeliveryDays = countDeliveryDays(deliveryDistance);
        System.out.println("Потребуется дней " + countDeliveryDays);

    }
 // 2 Задание

    private static void suggestVersion (int clientOS, int clientDeviсеYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientDeviсеYear > currentYear) {
            System.out.print("Установите облегченную версию для ");
        } else {
            System.out.print("Установите полную версию для ");
        }
        if (clientOS == 1) {
            System.out.println("Android");
        } else {
            System.out.println("iOS");
        }
    }

        // 3 Задание

    private static int countDeliveryDays(int deliveryDistance) {
            int deliveryDays = 4;
        if (deliveryDistance <= 20) {
            deliveryDays = 1;
        }
        if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryDays = 2;
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryDays = 3;
        }
        return deliveryDays;
        }



}





