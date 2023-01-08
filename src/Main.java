import jdk.jfr.FlightRecorder;

public class Main {
    public static void leapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " - Год високосный");
        } else {
            System.out.println(year + " - Год не високосный");
        }
    }

    public static void main(String[] args) {
//Задача 1
        System.out.println("  Задача 1");
        int year = 2020;
        leapYear(year);

        //Задача 2
        System.out.println("  Задача 2");
        String osName = "iOS";
        int clientOS = getClientOS(osName);
        int currentYear = 2023;
        int clientDeviceYear = 2022;
        int liteOrStand = getVersion(currentYear, clientDeviceYear);
        System.out.print("Установите ");
        if (liteOrStand == 0) {
            System.out.print("облегченную версию приложения");
        } else {
            System.out.print("стандартную версию приложения");
        }
        if (clientOS == 0) {
            System.out.println(" для iOS");
            return;
        }
        System.out.println(" для Android");
        //Задача 3
        System.out.println("  Задача 3");
        int deliveryDistance = 95;
        int deliveryDay = 1;
       int deliveryTime = getDeliveryTime(deliveryDistance, deliveryDay);
        System.out.println("Потребуется дней: " + deliveryTime);


    }

    public static int getClientOS(String name) {
        if (name.equals("iOS")) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int getVersion(int currentYear, int clientDeviceYear) {

        if (clientDeviceYear < currentYear) {
            return 0;
        }
        return 1;
    }

    public static int getDeliveryTime(int deliveryDistance, int deliveryDay) {
        if (deliveryDistance > 20) {
            deliveryDay++;
        }
        if (deliveryDistance > 60) {
            deliveryDay++;
        }
        return deliveryDay;
            }
        }
