/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if10k.pkg10119906.latihan48.kalkulator;
import java.util.Scanner;

/**
 *
 * @author senenngahenen
 * Nama     : Rizqy Ananda Rusmana
 * NIM      : 10119906
 * Kelas    : IF-10K
 */
public class IF10K10119906Latihan48Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double val1, val2;
        Scanner scanner = new Scanner(System.in);
        Kalkulator calc = new Kalkulator();

        calc.setValue1(7);
        calc.setValue2(5);
        val1 = calc.getValue1();
        val2 = calc.getValue2();
        System.out.printf("VALUE 1 = %.1f%n",val1);
        System.out.printf("VALUE 2 = %.1f%n",val2);
        calc.setNameProject();
        calc.setNoteProject("This project shown you how to manage project in java");
        System.out.printf("Result Add is\t\t= %.1f%n",calc.add(val1,val2));
        System.out.printf("Result Minus is\t\t= %.1f%n",calc.minus(val1,val2));
        System.out.printf("Result Multiple is\t= %.1f%n",calc.multiplication(val1,val2));
        System.out.printf("Result Division is\t= %.1f%n",calc.division(val1,val2));
    }
}
