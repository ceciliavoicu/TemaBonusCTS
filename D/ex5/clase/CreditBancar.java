package D.ex5.clase;

public class CreditBancar implements ICreditService{
    @Override
    public void acordaCredit(double suma, int durataInLuni) {
        System.out.println("Credit bancar acordat: "+suma+" EUR pentru "+durataInLuni+ " luni.");
    }
}
