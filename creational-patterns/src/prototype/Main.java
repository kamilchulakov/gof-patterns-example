package prototype;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Ciliophora> ciliophoras = new LinkedList<>();
        Ciliophora ciliophora1 = new Ciliophora();
        Ciliophora ciliophora2 = new Ciliophora();
        Ciliophora ciliophora3 = new Ciliophora();
        ciliophoras.add(ciliophora1);
        ciliophoras.add(ciliophora2);
        ciliophoras.add(ciliophora3);
        while (ciliophoras.size() < 10e2) {
            LinkedList<Ciliophora> copy = new LinkedList<>();
            for (Ciliophora ciliophora : ciliophoras) {
                copy.add(ciliophora);
                copy.add((Ciliophora) ciliophora.clone());
            }
            ciliophoras = copy;
        }
        int ciliphora1Number = 0;
        int ciliphora2Number = 0;
        int ciliphora3Number = 0;
        for (Ciliophora ciliophora : ciliophoras) {
            if (ciliophora.equals(ciliophora1)) ciliphora1Number += 1;
            if (ciliophora.equals(ciliophora2)) ciliphora2Number += 1;
            if (ciliophora.equals(ciliophora3)) ciliphora3Number += 1;
        }
        System.out.printf("%s: %s\n", ciliophora1, ciliphora1Number);
        System.out.printf("%s: %s\n", ciliophora2, ciliphora2Number);
        System.out.printf("%s: %s\n", ciliophora3, ciliphora3Number);
    }
}
