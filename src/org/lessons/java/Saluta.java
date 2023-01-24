package org.lessons.java;
public class Saluta {
    public static final int z = 3;
   


    public static void main(String[] args) {
        System.out.println("Hello Java"); //hello Java
        System.out.println(z);
        
        // VARIABLES

        /////  STRING 
        //  https://www.w3schools.com/java/java_ref_string.asp  (38)
        //  String - stores text, such as "Hello". String values are surrounded by double quotes

        final String name = "John";  // final as const
        String res = "Result: ";
        System.out.println(res.concat(name));
 }
}
 