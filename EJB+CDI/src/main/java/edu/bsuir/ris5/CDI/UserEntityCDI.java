package edu.bsuir.ris5.CDI;

import edu.bsuir.ris5.EJB.Entitys.UserEntity;
import edu.bsuir.ris5.EJB.Stateless.UserEntityEJB;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@RequestScoped //жизненный цикл
public class UserEntityCDI implements Serializable {

    private int id;
    private String surname;
    private String code_of_state;
    private String limit_of_credit;

    @EJB
    private UserEntityEJB userEntityEJB;

    public void saveUserEntity(){
        userEntityEJB.saveUserEntity(id,surname, code_of_state, limit_of_credit);
    }

    public void updateUserEntity(){
        userEntityEJB.updateUserEntity(id,surname, code_of_state, limit_of_credit);
    }

    public void deleteUserEntity(){
        userEntityEJB.deleteUserEntity(id,surname,code_of_state, limit_of_credit);
    }


    public void getUserEntity(){
        UserEntity response = userEntityEJB.getUserEntity(id);
        if(response!=null){
            surname = response.getSurname();
            code_of_state = response.getCode_of_state();
            limit_of_credit = response.getLimit_of_credit();
        }
        else{
            surname = "none";
            code_of_state = "none";
            limit_of_credit = "none";
        }

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCode_of_state() {
        return code_of_state;
    }

    public void setCode_of_state(String code_of_state) {
        this.code_of_state = code_of_state;
    }

    public String getLimit_of_credit() {
        return limit_of_credit;
    }

    public void setLimit_of_credit(String limit_of_credit) {
        this.limit_of_credit = limit_of_credit;
    }

    public UserEntityEJB getUserEntityEJB() {
        return userEntityEJB;
    }

    public void setUserEntityEJB(UserEntityEJB userEntityEJB) {
        this.userEntityEJB = userEntityEJB;
    }
}
