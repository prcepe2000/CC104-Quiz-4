/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackmainclass;

import java.util.Scanner;

/**
 *
 * @author username
 */
public class StackMainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic her
        
        Scanner s = new Scanner(System.in);
        
        StackInterface<String> S = new Stack<>( );
//        S.push(5); // contents: (5)
//        S.push(3); // contents: (5, 3)
//        System.out.println(S.size( )); // contents: (5, 3) outputs 2
//        System.out.println(S.pop( )); // contents: (5) outputs 3
//        System.out.println(S.isEmpty( )); // contents: (5) outputs false
//        System.out.println(S.pop( )); // contents: () outputs 5
//        System.out.println(S.isEmpty( )); // contents: () outputs true
//        System.out.println(S.pop( )); // contents: () outputs null
//        S.push(7); // contents: (7)
//        S.push(9); // contents: (7, 9)
//        System.out.println(S.top( )); // contents: (7, 9) outputs 9
//        S.push(4); // contents: (7, 9, 4)
//        System.out.println(S.size( )); // contents: (7, 9, 4) outputs 3
//        System.out.println(S.pop( )); // contents: (7, 9) outputs 4
//        S.push(6); // contents: (7, 9, 6)
//        S.push(8); // contents: (7, 9, 6, 8)
//        System.out.println(S.pop( ));
          
          System.out.println("Input Sentence: ");
          S.push(s.nextLine());
          System.out.println("Undo? (Y/N) \n");
          s.nextLine();
          System.out.println("New Sentence: " + S.pop());    
    }
    
}
