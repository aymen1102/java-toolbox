package bestPractices.bestPractice17;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {
    @Autowired
    private CarDao carDAO;
    /** bad habit : CarService depends on CarDAo
     public CarService(){
        this.carDAO = new CarDao();
     }
    * */

    /**
     * good habit : Dependency injection by constructor
     */
    public CarService(CarDao carDAO) {
        this.carDAO = carDAO;
    }

    public String getBrandNameUpperCase(){
        return carDAO.getCarBrand();
    }
}
