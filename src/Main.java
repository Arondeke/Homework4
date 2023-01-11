public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();

    }

    public static void task1 () {
        System.out.println("Задача 1");
        byte ageOfHuman=17;
        byte ageOfMajority=18;
        String verdict;

        if (ageOfMajority <= ageOfHuman){
            verdict = " он совершеннолетний";
        }
        else {verdict = " он не достиг совершеннолетия, нужно немного подождать";
        }
        System.out.println("Если возраст человека равен " + ageOfHuman + " то" + verdict);
    }
    public static void task2 () {
        System.out.println("Задача 2");

        byte outdoorTemperature = 6;
        byte limitTemperature = 5;
        String verdict;

        if(outdoorTemperature>=limitTemperature){
            verdict = "можно идти без шапки";
        }
        else {
            verdict = "нужно надеть шапку";
        }
        System.out.println("На улице " + outdoorTemperature + " градусов," + verdict);

    }
    public static void task3 () {
        System.out.println("Задача 3");

        byte limitSpeed = 60;
        byte realSpeed = 70;
        String verdict;

        if (realSpeed < limitSpeed) {
            verdict = "можно ехать спокойно";
        } else {
            verdict = "придется заплатить штраф";
        }
        System.out.println("Если скорость " + realSpeed + ", " + verdict);
    }

    public static void task4 () {
        System.out.println("Задача 4");

        byte ageMan = 25;
        boolean kinderMan = (ageMan <= 6) && (ageMan > 2);
        boolean schoolMan = (ageMan >= 7) && (ageMan < 18);
        boolean studentMan = (ageMan >= 18) && (ageMan < 24);
        boolean workerMan = (ageMan >= 24);

        if (kinderMan) {
            System.out.println("Если возраст человека равен " + ageMan + " нужно ходить в детсад");
        }
        else if (schoolMan) {
            System.out.println("Если возраст человека равен " + ageMan + " нужно ходить в школу");
        }
        else if (studentMan) {
            System.out.println("Если возраст человека равен " + ageMan + " нужно ходить в институт");
        }
        else  {
            System.out.println("Если возраст человека равен " + ageMan + " нужно ходить на работу");
        }
    }
    public static void task5 () {
        System.out.println("Задача 5");

        byte ageChild = 14;
        boolean childAndOlder = true;

        if (ageChild < 5) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему нельзя кататься на аттракционе");
        } else if ((ageChild >= 5) && (ageChild < 14) && childAndOlder){
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        } else {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }
    }

    public static void task6() {
        System.out.println("Задача 6");

        short quantityPeople = 20;
        short capacityBus = 102;
        short sitPlaces = 60;

        if (quantityPeople > capacityBus){
            System.out.println("Если мест занято " + quantityPeople + ", придётся подождать следующий автобус");
        } else if ((quantityPeople > sitPlaces) && (quantityPeople < capacityBus)) {
            System.out.println("Если мест занято " + quantityPeople + ", можно ехать стоя");
        } else {
            System.out.println("Если мест занято " + quantityPeople + ", можно даже посидеть в дороге");
        }
    }

    public static void task7() {
        System.out.println("Задача 7");

        int one = 7;
        int two = 4;
        int three = 3;

        if ((one > two) && (one > three))
        {System.out.println("значение " + one + " больше остальных");}
        else if ((two > one) && (two > three))
        {System.out.println("значение " + two + " больше остальных");}
        else if ((three > one) && (three > two))
        {System.out.println("значение " + three + " больше остальных");}

    }
}