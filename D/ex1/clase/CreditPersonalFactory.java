package D.ex1.clase;

public class CreditPersonalFactory extends CreditFactory{
    @Override
    public Credit creazaCredit() {
        return new CreditPersonal();
    }
}
