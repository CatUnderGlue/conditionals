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
        if (age >= 24){
            System.out.println("Вы окончили университет и можете искать первую работу.");
        }
        if (age >= 18 && age <= 23){
            System.out.println("Вы закончили школу и можете отправляться в университет.");
        }
        if (age >= 7 && age <= 17){
            System.out.println("Вы явно ходите в школу.");
        }

        // Задание 3
        System.out.println("Задание 3");
        int peopleInTrain = 66;
        int totalCapacity = 102;
        if (peopleInTrain == totalCapacity){
            System.out.println("Вагон полностью забит");
        }
        if (peopleInTrain >= 60 && peopleInTrain <= 101){
            System.out.println("Остались только стоячие места");
        }
        if (peopleInTrain < 60 && peopleInTrain > 0){
            System.out.println("Имеются как стоячие, так и сидячие места");
        }
    }
}