package com.huonglanto.studyjava;

import java.util.Date;
public class DateDemo2 {
   public static void main(String args[]) {
      Date date = new Date();
  
      System.out.printf("%1$s %2$tB %2$td, %2$tY", "Due date:", date);
   }
}
