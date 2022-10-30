/*import Transport.Car;
import Transport.Train;
import Transport.Bus;
import Animals.*;*/


import Drivers.Driver;
import Drivers.DriverBuses;
import Drivers.DriverTrucks;
import Transport.*;
import Drivers.DriverCars;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задание-1");

        Mechanic<Cars> petya = new Mechanic<Cars>("Petya", "Petrov","Pirelli");
        Mechanic<Trucks> alesha = new Mechanic<Trucks>("Alesha", "Petrov","Pirelli");
        Mechanic<Buses> grisha = new Mechanic<Buses>("Grisha", "Petrov","Pirelli");

        Sponsor agusha = new Sponsor("Agusha", 1000);

        Cars lada = new Cars("Lada", null/*"Granta"*/, -1.5f, BodyType.SEDAN);
        lada.addDriver(new DriverCars("Mihail", 5, lada));
        lada.addMechanic(petya);
        lada.addSponsor(agusha);

       /* Cars audi = new Cars("Audi", "A8 50 l TDI quattro", 3.0f,BodyType.COUPE);
        Cars bmw = new Cars("BMW", "Z9", 3.0f,BodyType.COUPE);
        Cars kia = new Cars("Kia", "Sportage", 2.4f,BodyType.CROSSOVER);
*/
        Trucks zil = new Trucks("ZIL", "Shishiga", 4.2f, Weights.N1);
        zil.addDriver(new DriverCars("Mihail", 5, lada));
        zil.addMechanic(alesha);
        zil.addSponsor(agusha);
        /*Trucks kraz = new Trucks("KRAZ", "255", 5.2f,Weights.N3);
        Trucks daf = new Trucks("DAF", "CF 65.220", 4.5f,Weights.N2);
        Trucks volvo = new Trucks("VOLVO", "FH 540", 5.0f,Weights.N2);*/

        Buses man = new Buses("MAN", "Lion's coach", 6.2f,Capacity.LARGE);
        man.addDriver(new DriverCars("Mihail", 5, lada));
        man.addMechanic(grisha);
        man.addSponsor(agusha);
       /* Buses iveco = new Buses("IVECO", "D-43",5.8f,Capacity.MEDIUM);
        Buses van = new Buses("VAN","HOOL TX-16",7.1f,Capacity.EXTRA_LARGE);
        Buses mercedes = new Buses("Mercedes-Benz","Integro 12-M",8.0f,Capacity.SMALL);
*/
       /* DriverCars mihail = new DriverCars("Mihail", 5, kia);
        DriverTrucks aleksey = new DriverTrucks("Aleksey", 7, volvo);
        DriverBuses konstantin = new DriverBuses("Konstantin", 9, mercedes);*/



        List<Transport> transports
                = List.of(lada,zil,man);

        ServiceStation serviceStation = new ServiceStation();
        serviceStation.addCars(lada);
        serviceStation.addTrucks(zil);
        serviceStation.service();
        serviceStation.service();


        for (Transport transport : transports) {
            printInfo(transport);
        }



       /* System.out.println(mihail);
        System.out.println(lada);
        lada.startMoving();
        bmw.endMoving();
        man.pitStop();*/

      /* String s = daf.toString();
        System.out.println(s);
        System.out.println(audi);
        kraz.printType();*/
       /* try {
            lada.service();
        } catch (DiagnosticException e){
            System.out.println("Транспортное средство " + lada.getBrand() + " " + lada.getModel()+" не прошло диагностику");
        }
        try {
            man.service();
        } catch (DiagnosticException e){
            System.out.println("Транспортное средство не прошло диагностику");
        }
*/
        
        


        /*Car lada = new Car(
                null, "Granta", 0,
                "", "желтый", 3.0f,
                null, null, null,
                0, null, null,
                new Car.Insurance(),
                122);

        Car audi = new Car(
                "audi", "A8 50 L TDI quattro",
                2022, "Germane",
                "желтый", 3.0f,
                null, null,
                null, 0, null, null,
                new Car.Insurance(),
                221);

        Car bmw = new Car(
                "BMW", "Z9",
                2021, "Germane",
                "черный", 3.0f,
                null, null,
                null, 0, null,
                new Car.Key(),
                null,
                0);

        Car kia = new Car(
                "Kia", "Sportage 4",
                2018,
                "South Korea",
                "красный", 2.4f,
                null, null,
                null, 0, null,
                new Car.Key(),
                new Car.Insurance(),
                231);

        Car hyundai = new Car(
                "Hyundai", "Avante", 2016,
                "South Korea", "оранжевый",
                1.6f, null, null,
                null, 0, null, null,
                null,
                144);

        Car lada2 = new Car(
                null,
                "Granta", 0,
                "", "",
                0, null, "",
                null, 0, null, null,
                new Car.Insurance(),
                322);

        System.out.println("lada = " + lada.toString());
        System.out.println("kia = " + kia.toString());
        System.out.println("lada2 = " + lada2.toString());

        System.out.println(lada.isCorrectRegNumber());
        System.out.println(lada2.isCorrectRegNumber());


        System.out.println("Задание-2");
        Train lastochka = new Train(
                "Ласточка", "B-901",
                2011, "Россия",
                null, 301,
                3500, 0,
                "Белорусский вокзал",
                "Минск-Пассажирский",
                11);

        Train leningrad = new Train(
                "Ленинград", "D-125",
                2019, "Россия",
                null, 270,
                1700, 0,
                "Ленинградский вокзал",
                "Ленинград - Пассажирский",
                8);

        System.out.println("lastochka = " + lastochka.toString());
        System.out.println("leningrad = " + lastochka.toString());


        System.out.println("Задание-3");
        Bus man = new Bus(
                "MAN ", "Lion’s City G/GL",
                2018, "Германия",
                null, 180, 423);

        Bus nefAz = new Bus(
                "НефАЗ", "5299",
                2000, "Россия",
                null, 150, 9763);

        System.out.println("bus1 = " + man.toString());
        System.out.println("bus2 = " + nefAz.toString());


        System.out.println("Домашнее задание-2");
        System.out.println("Задание-1");
        leningrad.refill();
        lada.refill();
        man.refill();


        System.out.println("Домашнее задание-3");
        System.out.println("Задание-1");

        Herbivores horse = new Herbivores(
                "Звездочка",
                13,
                "Степи и луга",
                "88 км/ч");

        Herbivores giraffe = new Herbivores(
                "Рафик",
                19,
                "Саванна",
                "Жираф бегает со коростью жирафа");

        Herbivores gazelle = new Herbivores("Галина",
                7,
                "Саванны Африки",
                "97 км/ч");

        Predators hyena = new Predators(
                "Локки",
                5,
                "Cаванна",
                "64 км/ч");

        Predators tiger = new Predators(
                "Шерхан",
                8,
                "Джунгли",
                "50 км/ч");

        Predators bear = new Predators(
                "Баллу",
                15,
                "Лес",
                "55 км/ч");

        Amphibians frog = new Amphibians(
                "Квакушка",
                2,
                "Болота и озера");

        Amphibians already = new Amphibians(
                "Ужик",
                1,
                "Болота и озера");

        Flightless peacock = new Flightless(
                "Паша",
                4,
                "Лесистая местность",
                "Пешком на своих двоих");

        Flightless penguin = new Flightless(
                "Гоша",
                3,
                "Антарктика",
                "Вразвалочку, ну и плавают хорошо");

        Flightless dodoBird = new Flightless(
                "Маргарита",
                8,
                "Городские джунгли",
                "Курьером");

        Flying gull = new Flying(
                "Джонатон Ливингстон",
                5,
                "Побережье морей и океанов",
                "Летает");

        Flying albatross = new Flying(
                "Лабрадор",
                3,
                "Побережье морей и океанов",
                "Летает");

        Flying falcon = new Flying(
                "Томас",
                9,
                "Повсеместно",
                "Летает");

        System.out.println("horse = " + horse.toString());
        System.out.println("frog = " + frog.toString());
        System.out.println("gull = " + gull.toString());
        System.out.println("dodoBird = " + dodoBird.toString());
        System.out.println("bear = " + bear.toString());*/

    }

    public static void printInfo(Transport transport) {
        System.out.println("Информация по автомобилю " + transport.getBrand()
                + " "+ transport.getModel() );
        System.out.println("Водители: " + transport.getDrivers());

        System.out.println("Механики: " + transport.getMechanics());

        System.out.println("Спонсоры: " + transport.getSponsors());

    }
}