package com.tnsif.dayseven;




 public class MyStudentExample extends Student1{
  public static void main(String[] args) {
          Student1 object1 = new Student1();
          object1.id = 1;
          object1.name = "HiteshReddy";
          Student1 obj2;
          obj2 = new Student1();
        obj2.id = 2;
        obj2.name = "Simple Snippets";
        System.out.println(object1.id);
        System.out.println(object1.name);
        System.out.println(obj2.id);
        System.out.println(obj2.name);     
    } 
}
