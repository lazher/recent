package com.scja.exam.util;
import java.util.*;
public class PropertiesManager{
public static void main(String[] args) {

Properties props=System.getProperties();
props.setProperty("new_Property2","new_value2");
if(args[0].equals("-list_all"))
   {
   props.list(System.out);
   }
else 
   if(args[0].equals("-list_props"))
     {
     System.out.println(props.getProperty(args[1]));
     }
     else
     {
      System.out.println("Usage:");
      System.out.println("java PropertiesManager[-list_all]");
      System.out.println("java PropertiesManager[-list_prop [property]]");
     }
    }
}