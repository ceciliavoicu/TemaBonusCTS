package C.ex6.program;

import C.ex6.clase.Depozit;
import C.ex6.clase.FacadeVerificareFarmacie;
import C.ex6.clase.SistemCardSanatate;
import C.ex6.clase.SistemRetete;

import java.util.Date;

public class Main {
    public static void  main(String[] args){
        SistemRetete sistemRetete=new SistemRetete();
        Depozit depozit=new Depozit();
        SistemCardSanatate sistemCardSanatate=new SistemCardSanatate();

        FacadeVerificareFarmacie facade=new FacadeVerificareFarmacie(sistemRetete,depozit,sistemCardSanatate);
        boolean esteOK=facade.verificareTotul(123,456,10,"XYZ123");
        System.out.println("Toate verificarile sunt complete si valide: "+esteOK);
    }
}
