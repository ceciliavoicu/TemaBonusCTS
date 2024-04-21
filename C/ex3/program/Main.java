package C.ex3.program;

import C.ex3.clase.Factura;
import C.ex3.clase.FacturaBuilder;

public class Main {
    public static void main(String args[]){
        Factura factura=new FacturaBuilder().setNrPagini(11).setPlataCuCard(false).setCardFidelitate(true).setCotaTVA(12).build();

        System.out.println(factura);

    }

}
