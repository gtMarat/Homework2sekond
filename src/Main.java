public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        dog = dog + 2;
        System.out.println(dog);
        cat = cat + 2;
        System.out.println(cat);
        paper = paper + 2;
        System.out.println(paper);
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        var faither1 = 78.2;
        System.out.println("Вес первого боксера " + faither1 + " кг ");
        var faither2 = 82.7;
        System.out.println("Вес второго боксера " + faither2 + " кг ");

        var difference = (faither1 - faither2);
        System.out.println("Задача 6 Разница в весе бойцов на " + -difference + " кг ");
        var difference2 = (faither2 - faither1);
        System.out.println("Задача 7 Вычитаю из большего меньшее   " + difference2 + " кг ");
        var difference3 = (faither2 % faither1);
        System.out.println("Задача 7 функция остаток отделения " + difference3);
        var hours = 640;
        var hoursOneMen = 8;
        var total = hours / hoursOneMen;
        System.out.println("Всего работников в компании — " + total + " человек ");
        var tottal2 = total + 94;
        var hours2 = tottal2 * 8;
        System.out.println("Если в компании работает " + tottal2 + " человека, то всего " + hours2 + " часов работы может быть поделено между сотрудниками ");
    }
}