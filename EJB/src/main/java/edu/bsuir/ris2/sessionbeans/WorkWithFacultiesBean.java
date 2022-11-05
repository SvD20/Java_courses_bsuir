package edu.bsuir.ris2.sessionbeans;

import javax.ejb.Stateless;

@Stateless
public class WorkWithFacultiesBean implements WorkWithFaculties{

    private final String FKP ="FKP";
    private final String IEF ="IEF";
    private final String FITU ="FITU";
    private final String KSIS ="KSIS";

    private final int FKP_RATE =1000;
    private final int IEF_RATE =2000;
    private final int FITU_RATE=3000;
    private final int KSIS_RATE=4000;

    @Override
    public double calculateOfPayment(String faculty, int years) {
        switch (faculty){
            case FKP:
                return years*FKP_RATE;
            case IEF:
                return years*IEF_RATE;
            case FITU:
                return years*FITU_RATE;
            case KSIS:
                return years*KSIS_RATE;
            default:
                return -1;
        }
    }

    @Override
    public String searchFaculties() {
        return FKP + "," + IEF;
    }
}
