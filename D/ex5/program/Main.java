package D.ex5.program;

import D.ex5.clase.Adapter;
import D.ex5.clase.CreditBancar;
import D.ex5.clase.ICreditService;
import D.ex5.clase.Leasing;

public class Main {
    public static void main(String[] args) {
        ICreditService creditBancar = new CreditBancar();
        creditBancar.acordaCredit(5000, 24);

        Leasing leasing = new Leasing();
        ICreditService leasingAdapter = new Adapter(leasing, "Cecilia");
        leasingAdapter.acordaCredit(10000, 36);
    }
}
