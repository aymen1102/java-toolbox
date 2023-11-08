package general.dependencyInjection.annotation;

import org.springframework.stereotype.Component;

@Component
public class CarDao {
    private String carBrand = "Mercedes";

    public CarDao() {
    }

    public CarDao(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarBrand() {
        return carBrand;
    }
}
