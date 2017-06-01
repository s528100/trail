/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

import static java.lang.Math.random;
import java.util.Random;

/**
 *
 * @author Shravani Alampalli
 */
public class StringAndNumbers 
{
    public static void main(String[] args)
    {
    //1a qn
        String s1 = "   Welcome";
        String s2 = "   to  ";
        String s3 = "computer";
        String s4 = " science     ";
        String s5 = " and ";
        String s6 = "  Information    ";
        String s7 = "systems   ";
        
        
    //1b
        String s8 = s1.concat(s2).concat(s3).concat(s4).concat(s5).concat(s6).concat(s7);
    
    //1c   
        System.out.println("The length of the concatenated string is:"+s8.length());
        
    //1d    
        String s9 = new String();
        s9 = s4.trim();
        System.out.println("Length of the trimmed string is:"+s9.length());
    
    //1e    
        String s10 = s8.substring(s8.indexOf("science"),s8.indexOf("science")+7);
        System.out.println("Index of first e in science is:"+s10.indexOf("e"));
        
    //2    
        String s11 = "rnururrunngisnnurun";
        System.out.println(s11.indexOf("run"));
        String s12 = s11.substring(s11.indexOf("run"),"run".length()+s11.indexOf("run"));
        String s13 = s11.substring(s11.indexOf("is"),"is".length()+s11.indexOf("is"));
        System.out.println("First occurrence of word run is:"+s12.concat(s13).concat("fun"));
    
    //3a(i)
        int x=4,y=6;
        System.out.println(Math.pow(x,y));
        
    //3a(ii)
        double z=26.30;
        System.out.println(Math.sqrt(z));
        System.out.println("ceil value" + "=" + Math.ceil(z));
        System.out.println("floor value" + "=" + Math.floor(z));
        
    //3a(iii)
        double a=30 , b=75;
        System.out.println(Math.round(Math.sin(a)));
        System.out.println(Math.round(Math.sin(b)));
        System.out.println(Math.round(Math.tan(a)));
        System.out.println(Math.round(Math.tan(b)));
        
    //3b
        double c = (Math.sqrt(5*5 + 4*3*3 + 2))/(3*2);
        System.out.println(Math.round(Math.sinh(c)));
       
    //4a    
        Random s = new Random();
        s.setSeed(10L);
        
        System.out.println("First random value "+s.nextInt(200));
        System.out.println("Second random value "+s.nextInt(200));
        System.out.println("Third random value "+s.nextInt(200));
        System.out.println("Fourth random value "+s.nextInt(200));
        System.out.println("Fifth random value "+s.nextInt(200));
        System.out.println("Sixth random value "+s.nextInt(200));
        System.out.println("Seventh random value "+s.nextInt(200));
        
    //4b
        System.out.println("I got same 7 random value for running multiple times ");
        
        System.out.print("\n");
        
    //4c
        Random w = new Random();
        System.out.println("First random value "+w.nextInt(200));
        System.out.println("Second random value "+w.nextInt(200));
        System.out.println("Third random value "+w.nextInt(200));
        System.out.println("Fourth random value "+w.nextInt(200));
        System.out.println("Fifth random value "+w.nextInt(200));
        System.out.println("Sixth random value "+w.nextInt(200));
        System.out.println("Seventh random value "+w.nextInt(200));
        System.out.println("I got different 7 random value for running multiple times ");
        
    //4d
        System.out.println("I got same seven value for more number of times to when the seed 10L is given.As in random without seed values are changing for every run time");
        
        
          
          
       
    
    }
    

}