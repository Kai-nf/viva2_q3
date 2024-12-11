package viva.pkg2;

import java.util.Scanner;

public class Viva2 {
    //create a function format
    public static String format(int num, int width){
        //convert int num into string
        String x = String.valueOf(num);
        //initialise new string
        String newString = "";
        //declare a condition when padding 0(s) is needed
        if (width>x.length()){
            //get number of 0(s) needed to be padded
            int numOfZero = width - x.length();
            //repeat adding 0(s) into newString for several needed time(s)
            for (int i = 1; i <= numOfZero; i++)
                newString += "0";
            //add num into newString
            newString += x;
        return newString;
        }
        else
            //return original string
            return x;
    }
    
    public static void main(String[] args) {
        //call method and store the returned value into variables a, b and c
        String a = format(34, 4);
        String b = format(34, 5);
        String c = format(34, 1);
        
        //print variables a, b and c
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        //prompt user to input number and width
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter an integer number: ");
        int number = scanner.nextInt();
        System.out.print("Please enter the width required: ");
        int wid = scanner.nextInt();

        String Result = format(number, wid);
        System.out.println(Result);
    }
    
}
