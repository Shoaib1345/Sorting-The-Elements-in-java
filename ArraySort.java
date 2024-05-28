/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraysort;
import java.util.Arrays;
import java.util.Collections;
class Array{
    
    void f1(){
    int[] number={4,6,7,3,2,8,9,1};
    Arrays.sort(number);
    System.out.println(Arrays.toString(number));
    }
    
    void f2(){
    String names[]={"Shoaib","Waqar","Waseem","Ali","Ahmed","Bullo","Chachar" };
    //Arrays.sort(names);
    Arrays.sort(names);
    
        System.out.println(Arrays.toString(names));
    
    }
}
public class ArraySort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Array sc=new Array();
        sc.f1();
        sc.f2();
        String a="abc";
        String b="abe";
        System.out.println(a.compareTo(b));

    }
    
}
