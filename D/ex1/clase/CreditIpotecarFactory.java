package D.ex1.clase;

public class CreditIpotecarFactory extends  CreditFactory{
    @Override
    public Credit creazaCredit() {
        return new CreditIpotecar();
    }
}
