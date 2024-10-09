@SuppressWarnings("ConstantValue")
public class Main {
    public static void main(String[] args) {

        //task1
        int age = 19;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        }
        else {
            System.out.println("Если возраст человека равен " + age + ", он не достиг совершеннолетия, нужно немного подождать");
        }

        //task2
        int temperature = -4;
        if (temperature <= 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        }
        else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }

        //task3
        int speed = 80;
        boolean overSpeedLimit = speed > 60;
        if (overSpeedLimit) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        }
        else {
            System.out.println("Если скорость " + speed + ", можно ездить спокойно");
        }

        //task4
        int age2 = 28;
        if (age2 >= 2 && age2 <= 6) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в детский сад");
        }
        if (age2 >= 7 && age2 <= 17) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в школу");
        }
        if (age2 >= 18 && age2 <= 24) {
            System.out.println("Если возраст человека равен " + age2 + ", то его место в университете");
        }
        if (age2 >= 24) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему пора ходить на работу");
        }

        //task5
        int age3 = 14;
        boolean noRide = age3 < 5;
        if (noRide) {
            System.out.println("Если возраст ребенка равен " + age3 + ", то ему нельзя кататься на аттракционе");
        }
        boolean rideWithAdult = age3 >= 5 && age3 < 14;
        if (rideWithAdult) {
            System.out.println("Если возраст ребенка равен " + age3 + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        }
        boolean rideAlone = age3 >= 14 ;
        if (rideAlone) {
            System.out.println("Если возраст ребенка равен " + age3 + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }

        //task6
        int passengerAmount = 103;
        boolean sittingSpace = passengerAmount <= 60;
        boolean standingSpace = passengerAmount > 60 && passengerAmount <= 102;
        if (sittingSpace) {
            System.out.println("В вагоне есть сидячее место");
        }
        else if (standingSpace) {
            System.out.println("В вагоне есть стоячее место");
        }
        else {
            System.out.println("Вагон полностью забит");
        }

        //task 7
        int one = 18;
        int two = 18;
        int three = 18;
        boolean oneHighest = one > two && one > three;
        boolean twoHighest = two > one && two > three;
        boolean oneAndTwoHighest = one == two && one > three;
        boolean twoAndThreeHighest = two == three && two > one;
        boolean oneAndThreeHighest = one == three && one > two;
        boolean allSame = one == two && two == three;
        if (oneHighest) {
            System.out.println("Первое число бо́льшее");
        }
        else if (twoHighest) {
            System.out.println("Второе число бо́льшее");
        }
        else if (oneAndTwoHighest) {
            System.out.println("Первое и Второе число бо́льшее");
        }
        else if (oneAndThreeHighest) {
            System.out.println("Первое и Третье число бо́льшее");
        }
        else if (twoAndThreeHighest) {
            System.out.println("Второе и Третье число бо́льшее");
        }
        else if (allSame) {
            System.out.println("Все числа одинаковые");
        }
        else {
            System.out.println("Третье число бо́льшее");
        }

    }
}