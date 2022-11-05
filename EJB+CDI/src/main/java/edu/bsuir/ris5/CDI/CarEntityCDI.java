package edu.bsuir.ris5.CDI;

import edu.bsuir.ris5.EJB.Entitys.CarEntity;
import edu.bsuir.ris5.EJB.Stateless.CarEntityEJB;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped //жизненный цикл
public class CarEntityCDI {

    private int id;
    private String modelname;
    private String mileage_km;
    private String number;

    @EJB
    private CarEntityEJB carEntityEJB;

    public void saveCarEntity(){
        carEntityEJB.saveCarEntity(id,modelname,mileage_km,number);
    }

    public void updateCarEntity(){
        carEntityEJB.updateCarEntity(id,modelname,mileage_km,number);
    }

    public void deleteCarEntity(){
        carEntityEJB.deleteUserEntity(id,modelname,mileage_km,number);
    }

    public void getCarEntity(){
        CarEntity response = carEntityEJB.getCarEntity(id);
        if(response!=null){
            modelname = response.getModelname();
            mileage_km = response.getMileage_km();
            number = response.getNumber();
        }
        else{
            modelname = "none";
            mileage_km = "none";
            number = "none";
        }

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelname() {
        return modelname;
    }

    public void setModelname(String modelname) {
        this.modelname = modelname;
    }

    public String getMileage_km() {
        return mileage_km;
    }

    public void setMileage_km(String mileage_km) {
        this.mileage_km = mileage_km;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public CarEntityEJB getCarEntityEJB() {
        return carEntityEJB;
    }

    public void setCarEntityEJB(CarEntityEJB carEntityEJB) {
        this.carEntityEJB = carEntityEJB;
    }
}
