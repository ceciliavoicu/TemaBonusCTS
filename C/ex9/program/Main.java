package C.ex9.program;

import C.ex9.clase.IFarmacie;
import C.ex9.clase.Proxy;

public class Main {
    public static  void main(String[] args){
        IFarmacie iFarmacie=new Proxy();
        try {
            iFarmacie.cumparaMedicament("Reteta valida");
            iFarmacie.cumparaMedicament("");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
