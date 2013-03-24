package com.scja.exam.calcu;
import java.math.*;
public class Calculatrice{
public static void main(String[] args) {
int a,b;
float s;
if(args[0].equals("-a"))
   {
   a=Integer.parseInt(args[1]);
   b=Integer.parseInt(args[2]);
   s=a+b;
   System.out.println(s);
   }
else
if(args[0].equals("-s"))
   {
   a=Integer.parseInt(args[1]);
   b=Integer.parseInt(args[2]);
   s=a-b;
   System.out.println(s);
   }
else
if(args[0].equals("-m"))
   {
   a=Integer.parseInt(args[1]);
   b=Integer.parseInt(args[2]);
   s=a*b;
   System.out.println(s);
   }
else
if(args[0].equals("-d"))
   {
   a=Integer.parseInt(args[1]);
   b=Integer.parseInt(args[2]);
   if(b==0){System.out.println("Erreur:division par zéro");}
   else
      {
       s=a/b;
       System.out.println(s);
      }   
  }
else
{
System.out.println("Usage:");
System.out.println("Option invalide");
System.out.println("Les opérandes doit etre des entiers");
}
}
}