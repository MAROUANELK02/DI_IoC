package presentation;

import dao.IDaoImpl;
import ext.IDaoImpl2;
import metier.IMetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        IDaoImpl dao = new IDaoImpl();
        IDaoImpl2 dao2 = new IDaoImpl2();
        IMetierImpl metier = new IMetierImpl(dao2);

        System.out.println("Résultat : "+metier.calcul());

    }
}