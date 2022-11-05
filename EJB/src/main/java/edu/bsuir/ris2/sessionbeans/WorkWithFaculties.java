package edu.bsuir.ris2.sessionbeans;

import javax.ejb.Local;

@Local
public interface WorkWithFaculties {

    double calculateOfPayment(String faculty,int years);
    String searchFaculties();

}
