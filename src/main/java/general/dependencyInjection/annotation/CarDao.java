package general.dependencyInjection.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public class CarDao {
    private String carBrand = "Mercedes";

    public CarDao() {
    }

    public CarDao(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarBrand(){
        return carBrand;
    }
}
