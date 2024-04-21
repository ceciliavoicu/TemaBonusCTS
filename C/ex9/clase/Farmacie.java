package C.ex9.clase;

public class Farmacie implements IFarmacie{

    @Override
    public void cumparaMedicament(String reteta) throws Exception {
        if(reteta!=null&&!reteta.isEmpty()){
            System.out.println("Medicamentul a fost furnizat.");
        }else{
            System.out.println("Nu a fost furnizata nicio reteta.");
        }
    }
}
