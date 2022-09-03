import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        checkYear(2017);
        checkPhone(0, 2022);
        checkDist(20);
    }

    public static void checkYear(int year){
        if((year % 4 == 0 || year % 400 == 0) && year % 100 != 0)
        {
            System.out.println(year + " високосный год");
        }
        else
        {
            System.out.println(year + " не високосный год");
        }
    }

    public static void checkPhone(int os, int yearRelease){
        int currentYear = LocalDate.now().getYear();
        if (os == 0 && yearRelease == currentYear)
        {
            System.out.println("для IOS обычную версию установить");
        }
        else if(os == 0 && yearRelease < currentYear){
            System.out.println("для IOS lite версию установить");
        }
        else if(os == 1 && yearRelease == currentYear){
            System.out.println("для Android обычную версию установить");
        }
        else if(os == 1 && yearRelease < currentYear){
            System.out.println("для Android lite версию установить");
        }
    }

    public static void checkDist(int deliveryDistance){
        int deliveryTime = 1;
        if(deliveryDistance <= 20){
            System.out.println("Потребуется дней: " + deliveryTime);
        }
        else if(deliveryDistance > 20 && deliveryDistance <= 60){
            deliveryTime = deliveryTime + 1;
            System.out.println("Потребуется дней: " + deliveryTime);
        }
        else if(deliveryDistance > 60 && deliveryDistance <= 100){
            deliveryTime = deliveryTime + 2;
            System.out.println("Потребуется дней: " + deliveryTime);
        }
    }
}