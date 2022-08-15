package general.dependencyInjection.byConstructor;

public class CarDao {
    private String carBrand;
    public CarDao() {
    }

    public CarDao(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarBrand(){
        return carBrand;
    }
}
