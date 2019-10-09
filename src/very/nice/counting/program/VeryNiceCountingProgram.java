/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package very.nice.counting.program;
import java.util.Scanner;
/**
 *
 * @author hayou1838
 */
public class VeryNiceCountingProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner personInput = new Scanner(System.in);
        int choice;
        
        System.out.println("__Very Nice Numberinos__\n Pick a numberinos 1 through 5!\n 1. Counting from 0 to 10 by 1\n 2. Counting from 100 to 0 by 10\n 3. Counting from 50 to 500 by 50\n 4. Counting from 6000 to 1000 by 1000\n 5. The Sin Tally");
        System.out.println("☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼☼");
        choice = personInput.nextInt();
        switch(choice){
            case 1:
                for (int Opt1 = 0; Opt1 <=10; Opt1++)
                    System.out.println("\n" + Opt1);
                break;
            case 2:
                for (int Opt2 = 0; Opt2 <= 100; Opt2 = Opt2 + 10)
                    System.out.println(Opt2);
                break;    
            case 3:
                for (int Opt3 = 50; Opt3<=500; Opt3 = Opt3 + 50)
                    System.out.println("\n" + Opt3);
                break;
            case 4:
                for (int Opt4 = 6000; Opt4 >= 1000; Opt4 = Opt4 - 1000)  
                    System.out.println("\n" + Opt4);
                break;
            case 5:
                for (int Opt5 = 0; Opt5>=0; Opt5++)
                    System.out.println("\n" + Opt5 + " sins");
                break;
        }
    }
    
}