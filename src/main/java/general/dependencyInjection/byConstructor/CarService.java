package general.dependencyInjection.byConstructor;

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
    public CarService(CarDao carDAO) {
        this.carDAO = carDAO;
    }

    public String getBrandNameUpperCase(){
        return carDAO.getCarBrand();
    }
}
