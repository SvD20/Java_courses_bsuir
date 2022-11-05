package edu.bsuir.ris5.EJB.Stateless;

import edu.bsuir.ris5.EJB.Entitys.CarEntity;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class CarEntityEJB {

    @PersistenceContext(unitName ="RisDS" )
    private EntityManager entityManager;

    public void saveCarEntity(int id,String modelname,String mileage_km, String number){
        CarEntity carEntity = new CarEntity(id,modelname,mileage_km,number);
        entityManager.persist(carEntity);
    }

    public void updateCarEntity(int id,String modelname,String mileage_km, String number){
        CarEntity carEntity = new CarEntity(id,modelname,mileage_km,number);
        entityManager.merge(carEntity);
    }

    public void deleteUserEntity(int id,String modelname,String mileage_km, String number){
        CarEntity carEntity = new CarEntity(id,modelname,mileage_km,number);
        if (entityManager.contains(carEntity)){
            entityManager.remove(carEntity);
        }
        else {
            entityManager.remove(entityManager.merge(carEntity));
        }
    }

    public CarEntity getCarEntity(int id){
        CarEntity response = entityManager.find(CarEntity.class,id);
        return response;
    }

}
