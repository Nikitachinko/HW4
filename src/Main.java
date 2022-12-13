public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задача 1!");
        int clientOS = 0;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (clientOS == 0)
            System.out.println("Установите версию приложения для iOS по ссылке");
        else {
            System.out.println("У вас неизвестная ОС!");
        }
    }
    public static void task2() {
        System.out.println("Задача 2!");
        int clientOS = 1;
        int clientDeviceYear = 2018;
        if (clientDeviceYear < 2015 && clientOS == 0){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }else if (clientDeviceYear >= 2015 && clientOS == 0){
            System.out.println("Установите обычную версию приложения для Android по ссылке");
        }
        if (clientDeviceYear < 2015 && clientOS == 1){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }else if (clientDeviceYear >= 2015 && clientOS == 1){
            System.out.println("Установите обычную версию приложения для iOS по ссылке");
        }
    }
    public static void task3() {
        System.out.println("Задача 3!");
        int year = 2029;
        if(year%4==0 && year%100!=0 || year%400==0){
            System.out.println("Год " + year + " Високосный!");
        }else {
            System.out.println("Год " + year + " Не високосный!");
        }
    }
    public static void task4() {
        System.out.println("Задача 4!");
        int deliveryDistance = 50;
        if (deliveryDistance >= 0 && deliveryDistance <= 20){
            System.out.println("Доставка 1 сутки!");
        }else if (deliveryDistance > 20 && deliveryDistance <= 60){
            System.out.println("Доставка 2-ое суток!");
        }else if (deliveryDistance > 60 && deliveryDistance <= 100){
            System.out.println("Доставка 3-ое суток!");
        }else{
            System.out.println("Доставки нет!");
        }

    }
    public static void task5() {
        System.out.println("Задача 5!");
        int moth = 12;
        switch (moth){
            case 1, 2, 12:
                System.out.println("Месяц под номером " + moth + " относится к зиме!");
                break;
            case 3, 4, 5:
                System.out.println("Месяц под номером " + moth + " относится к весна!");
                break;
            case 6, 7, 8:
                System.out.println("Месяц под номером " + moth + " относится к лето!");
                break;
            case 9, 10, 11:
                System.out.println("Месяц под номером " + moth + " относится к осень!");
                break;
            default:
                System.out.println("Нет такого месяца!");
        }
    }





}



