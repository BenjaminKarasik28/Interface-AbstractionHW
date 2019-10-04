package GA.homework.InheritenceAndAbstraction;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        PreCalculus precalc = new PreCalculus();
        precalc.setClassName("precalc1");
        Math calc = new Calculus();
        calc.setClassName("calc1");
        Class class1 = precalc;
        precalc.gradesOffered();
        System.out.println(class1.getClassName());
        System.out.println(precalc);
        System.out.println(calc);



    }
}
