package C.ex9.clase;

public class Proxy implements IFarmacie{
    private Farmacie farmacie=new Farmacie();
    @Override
    public void cumparaMedicament(String reteta) throws Exception {
        if(reteta!=null &&!reteta.isEmpty()){
            farmacie.cumparaMedicament(reteta);
        }else{
            throw new Exception("Este necesara o reteta pentru a cumpara medicamente.");

        }

    }
}
