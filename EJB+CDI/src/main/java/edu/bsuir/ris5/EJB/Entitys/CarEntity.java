package edu.bsuir.ris5.EJB.Entitys;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CarEntity {

    @Id
    private int id;
    private String modelname;
    private String mileage_km;
    private String number;

    public CarEntity(int id,String modelname,String mileage_km, String number) {
        this.id = id;
        this.modelname = modelname;
        this.mileage_km = mileage_km;
        this.number = number;
    }

    public CarEntity() {
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
}
