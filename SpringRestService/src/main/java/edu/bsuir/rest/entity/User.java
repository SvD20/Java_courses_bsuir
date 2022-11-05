package edu.bsuir.rest.entity;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int id;

    @Column(name = "Lastname")
    private String lastname;

    @Column(name = "Firstname")
    private String firstname;

    @Column(name = "Surname")
    private String surname;

    @Column(name = "Date_of_birth")
    private String date_of_birth;

    @Column(name = "Passport_series")
    private String passport_series;

    @Column(name = "Passport_number")
    private String passport_number;

    @Column(name = "State")
    private String state;

    @Column(name = "Fact_addres")
    private String fact_addres;

    @Column(name = "Phone_number")
    private String phone_number;

    @Column(name = "E_mail")
    private String e_mail;

    @Column(name = "Employed")
    private String employed;

    @Column(name = "Position")
    private String position;

    @Column(name = "Registration_addres")
    private String registration_addres;

    @Column(name = "Citizenship")
    private String citizenship;

    public User() {
    }

    public User(int id, String lastname, String firstname, String surname, String date_of_birth,
                String passport_series, String passport_number, String state, String fact_addres,
                String phone_number, String e_mail, String employed, String position, String registration_addres,
                String citizenship) {
        this.id = id;
        this.lastname = lastname;
        this.firstname = firstname;
        this.surname = surname;
        this.date_of_birth = date_of_birth;
        this.passport_series = passport_series;
        this.passport_number = passport_number;
        this.state = state;
        this.fact_addres = fact_addres;
        this.phone_number = phone_number;
        this.e_mail = e_mail;
        this.employed = employed;
        this.position = position;
        this.registration_addres = registration_addres;
        this.citizenship = citizenship;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getPassport_series() {
        return passport_series;
    }

    public void setPassport_series(String passport_series) {
        this.passport_series = passport_series;
    }

    public String getPassport_number() {
        return passport_number;
    }

    public void setPassport_number(String passport_number) {
        this.passport_number = passport_number;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getFact_addres() {
        return fact_addres;
    }

    public void setFact_addres(String fact_addres) {
        this.fact_addres = fact_addres;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public String getEmployed() {
        return employed;
    }

    public void setEmployed(String employed) {
        this.employed = employed;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getRegistration_addres() {
        return registration_addres;
    }

    public void setRegistration_addres(String registration_addres) {
        this.registration_addres = registration_addres;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

}
