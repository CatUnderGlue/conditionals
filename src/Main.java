public class Main {
    public static void main(String[] args) {
        // Домашнее задание
        // Задание 1
        System.out.println("Задание 1");
        int age = 22;
        if (age >= 18){
            System.out.println("Поздравляем с совершеннолетием!🎉🎉🎉");
        }
        if (age < 18){
            System.out.println("До совершеннолетия осталось совсем чуть-чуть😎");
        }

        // Задание 2
        System.out.println("Задание 2");
        boolean flag = false;
        if (age >= 24 && !flag){
            flag = true;
            System.out.println("Вы окончили университет и можете искать первую работу.");
        }
        if (age >= 18 && !flag){
            flag = true;
            System.out.println("Вы закончили школу и можете отправляться в университет.");
        }
        if (age >= 7 && !flag){
            flag = true;
            System.out.println("Вы явно ходите в школу.");
        }

    }
}