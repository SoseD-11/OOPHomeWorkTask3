public class Car {
    String brand;
    String model;
    String engineVolume;
    String color, productionCountry;
    int productionYear;


    Car(String brand, String model, String engineVolume, String color, int productionYear, String productionCountry) {
        if(brand.equals("")){
            this.brand = "--default--";
        }else {
            this.brand = brand;
        }
        if(model.equals("")){
            this.model = "--default--";
        }else {
            this.model = model;
        }
        if(engineVolume.equals("")){
            this.engineVolume = "1.5л";
        }else {
            this.engineVolume = engineVolume;
        }
        if(color.equals("")){
            this.color = "белый";
        }else {
            this.color = color;
        }
        if(productionYear <= 1999){
            this.productionYear = 2000;
        }else {
            this.productionYear = productionYear;
        }
        if(productionCountry.equals("")){
            this.productionCountry = "--default--";
        }else {
            this.productionCountry = productionCountry;
        }
    }

    void characteristics() {
        System.out.println(brand + " " + model + ". Объём двигателя - " + engineVolume + ". " + "Цвет кузова - " + color + ". Год выпуска - " + productionYear + ". Сборка - " + productionCountry);
    }

}
