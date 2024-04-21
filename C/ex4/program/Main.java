package C.ex4.program;

import C.ex4.clase.Reteta;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        List<String > accesorii=new ArrayList<>();
        accesorii.add("Paracetamol");
        Reteta reteta=new Reteta("Agumentin",accesorii);
        Reteta reteta1=(Reteta) reteta.copiaza();
        System.out.println(reteta);

        reteta1.setNume("Paracetamol");
        System.out.println(reteta1);
    }
}
