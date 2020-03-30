

import javax.swing.*;
import java.lang.reflect.Parameter;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class StringCalculator {

    public static  final String delimiter= (",|;|\n");
    public static void main(String[] args)  {
        try {
            System.out.println(add("6,8"));


        }
        catch (NumberFormatException e){
            e.getMessage();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



        public static int stringConvert(String input)
        {
            return Integer.parseInt(input);

        }

    public static int add(String input) throws Exception {
    Integer.parseInt(input);
    if(input=="")
    {
        System.out.println("Please enter a value");
    }
    if(input.contains("//"))
    {
        input = input.replace("1",",3");
        input = input.replace("*",",");

        int i = input.indexOf("\n");
        input= input.substring(i+1);
    }
    int sum =0;
    String[] inputString = input.split(delimiter);
    String negInput="";

    for (int x=0;x<inputString.length;x++)
    {
        if(!(stringConvert(inputString[x])<0))
        {
            negInput+= inputString[x]+"";
        }

        sum+=Integer.parseInt(input);
        if(negInput.isEmpty() && inputString[x]==inputString[inputString.length-1])
        {
            throw new Exception("Negative values not allowed :"+ negInput);
        }
    }

        return sum;
    }


}



