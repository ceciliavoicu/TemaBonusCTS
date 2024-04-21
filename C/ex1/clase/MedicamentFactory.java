package C.ex1.clase;

public class MedicamentFactory {
    public static Medicament getMedicamente(TipMedicament tip, String  denumire, float pret, int valabilitate) {
        switch (tip){
            case BODY:
                return new Body(denumire,pret);
            case DURERE:
                return new Durere(denumire,pret);
            case RACEALA:
                return new Raceala(denumire,pret);
            default:
                try{
                    throw  new Exception("Tipul de medicament nu exista!");
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
        }
    }
}
