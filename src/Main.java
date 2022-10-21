import transport.Car;

public class Main {
    public static void main(String[] args) {
        //Task-3
    Car lada = new Car(null,
            "Granta",
            1.7,
            "жёлтый",
            2015,
            "Россия",
            "Механическая",
            5,
            "АА856А56", "седан",
            true,new Car.Key(true,true),
            new Car.Insurence(null,10030,null));
    Car audi = new Car("Audi",
            "A8 50L TDI quattro",
            3.0,
            "черный",
            2020,
            "Германия",
            "Автомат",
            2,
            "АА456А56", "седан",true,
            new Car.Key(true,true),
            new Car.Insurence(null,10030,null));
    Car bmw = new Car("BMW",
            "Z8",
            3.0,
            "чёрный",
            2021,
            "Германия",
            "Механическая",
            5,
            "АА878А56", "седан",true,
            new Car.Key(true,true),
            new Car.Insurence(null,10030,null));
    Car kia = new Car("KIA",
            "Sportage 4-го поколения",
            2.4,
            "красный",
            2018,
            "Южная Корея",
            "Механическая",
            5,
            "АА777А56", "седан",true,
            new Car.Key(true,true),
            new Car.Insurence(null,10030,null));
    Car hyunday = new Car("Hyunday",
            "Avante",
            1.6,
            "оранжевый",
            2016,
            "Южная Корея",
            "Механическая",
            5,
            "АА856А56","седан",true
            ,new Car.Key(false,false),
            new Car.Insurence(null,10030,null));
    lada.characteristics();
    audi.characteristics();
    bmw.characteristics();
    kia.characteristics();
    hyunday.characteristics();
    }
}