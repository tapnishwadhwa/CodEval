
//**********************************************************
// Assignment: Fizz Buzz 
//
// Description: a program that prints out the final series of numbers where those divisible by X, Y and both are replaced by “F” for fizz, “B” for buzz and “FB” for fizz buzz.
// Author: Tapnish Wadhwa 
//
// Date Start: 11/30/2016
// Date Completed: 11/3-/2016
//
// Completion time: 30 minutes 
//            
// Honor Code: I pledge that this program represents my own
//   program code. I received help from no one 
//   in designing and debugging my program.
//*********************************************************

import java.io.*;
public class FizzBuzz {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
       
    String split[] = line.split("\\s");
      
    String fizz = split[0];
    String buzz = split[1];
    String n = split[2]; 
    
             int x = Integer.parseInt(fizz);
             int y = Integer.parseInt(buzz);
             int len = Integer.parseInt(n);
             
           for (int i = 1; i <= len; i++) {
               
               if (i%x == 0 && i%y == 0){
                   System.out.print("FB" + " ");
               }
               else if (i%x == 0){
                   System.out.print("F" + " ");
               }
               else if (i%y == 0){
                   System.out.print("B" + " ");
                   
               }
               
               else {
                  System.out.print(i + " ");
               }
               
           }
               System.out.println("");

       
       
       
       
       
       
      
        }
    }
}
