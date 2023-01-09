package oop;

import oop.model.Car;
import oop.model.Human1;

public class Lesson1 {
    public static void main(String[] args) {
        Human1 human = new Human1();
        human.firstName = "Ando";
        human.lastName = "Muradyan";
        human.year = 25;
        human.isArmenian = true;
        human.gender = 'M';

        Human1 human1 = new Human1();
        human1.firstName = "Anna";
        human1.lastName = "Petrosyan";
        human1.year = 28;
        human1.isArmenian = true;
        human1.gender = 'F';

        if (human.year > human1.year) {
            System.out.println(human.firstName);
        } else
            System.out.println(human1.firstName);

        System.out.println("-----------------------------------");
//        ternari greladzev nuyn if else pes uxaki mek toxov
        System.out.println(human.year > human1.year ? human.firstName : human1.firstName);

        System.out.println("-----------------------------------");
        Car car = new Car();
        car.model = "BMW";
        car.year = 2020;
//        System.out.println(car.engine);

        System.out.println("-----------------------------------");
//        skzbnakan kranq klasin arjeq tanq bayc menq karonx  enq metodi popoxakanov poxenq ira arjeky
        Human1 h = new Human1();
        h.firstName = "Ani";//poxenq skzbnakan arjeqy Aram --> Ani
        System.out.println(h.firstName);

        System.out.println("-----------------------------------");
        h.sayHello();
//      ARANC metod sout ov tpel
        System.out.println(human.firstName + " " + human.lastName);
        System.out.println(human1.firstName + " " + human1.lastName);
        System.out.println(h.firstName + " " + h.lastName);

        System.out.println("-----------------------------------");
//        metod sarkelov uxaki kanchenq vor popoxakani anun azganunenq uzum tpel es depkum h.printFulName(metodi anunn e) ktpi h i anun azganuny
        h.printFullName();
        human.printFullName();
        human1.printFullName();

        System.out.println("-----------------------------------");

        String s = human.fullName();
        System.out.println("Full name of human is " + s);

        System.out.println("-----------------------------------");

//        metode enq sarkel vorv erku tiv talov kgumari irar u kveradarcni mez arjeqy
        h.sum(40, 50);


        System.out.println("-----------------------------------");
//        funkcia e vorov metody grum enq aranc tvi tivy talis enq erb kanchum enq metodi anuny talis enq u inqy ktpe mer tvac tvi hamarjeq
        h.print1toN(4);
        h.print1toN(8);
        h.print1toN(15);


        System.out.println("-----------------------------------");
        Car car1 = new Car();
//        car.getEngine() = -8.8;
        car1.setEngine(8.8);
        System.out.println(car1.getEngine());
    }
}
