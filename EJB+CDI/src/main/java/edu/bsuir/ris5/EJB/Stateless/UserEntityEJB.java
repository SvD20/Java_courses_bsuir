package edu.bsuir.ris5.EJB.Stateless;

import edu.bsuir.ris5.EJB.Entitys.UserEntity;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class UserEntityEJB {

    @PersistenceContext(unitName ="RisDS" )
    private EntityManager entityManager;

    public void saveUserEntity(int id,String surname,String code_of_state,String limit_of_credit){
        UserEntity userEntity = new UserEntity(id,surname,code_of_state,limit_of_credit);
        entityManager.persist(userEntity);
    }

    public void updateUserEntity(int id,String surname,String code_of_state,String limit_of_credit){
        UserEntity userEntity = new UserEntity(id,surname,code_of_state,limit_of_credit);
        entityManager.merge(userEntity);
    }

    public void deleteUserEntity(int id,String surname,String code_of_state,String limit_of_credit){
        UserEntity userEntity = new UserEntity(id,surname,code_of_state,limit_of_credit);
        if (entityManager.contains(userEntity)){
            entityManager.remove(userEntity);
        }
       else {
            entityManager.remove(entityManager.merge(userEntity));
        }
    }

    public UserEntity getUserEntity(int id){
        UserEntity response = entityManager.find(UserEntity.class,id);
        return response;
    }


}
