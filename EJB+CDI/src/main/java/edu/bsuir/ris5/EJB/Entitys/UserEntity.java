package edu.bsuir.ris5.EJB.Entitys;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserEntity {

    @Id
    private int id;
    private String surname;
    private String code_of_state;
    private String limit_of_credit;

    public UserEntity(int id, String surname, String code_of_state, String limit_of_credit) {
        this.id = id;
        this.surname = surname;
        this.code_of_state = code_of_state;
        this.limit_of_credit = limit_of_credit;
    }

    public UserEntity() {
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
}
