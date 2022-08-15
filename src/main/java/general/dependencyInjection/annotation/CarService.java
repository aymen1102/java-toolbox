package general.dependencyInjection.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {

    private CarDao carDAO;
    /** bad habit : CarService depends on CarDAo
     public CarService(){
        this.carDAO = new CarDao();
     }
    * */

    /**
     * good habit : Dependency injection by constructor
     */
    @Autowired
    public CarService(CarDao carDAO) {
        this.carDAO = carDAO;
    }

    public CarService() {

    }

    public String getBrandNameUpperCase(){
        return carDAO.getCarBrand();
    }
}
