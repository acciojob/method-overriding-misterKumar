package com.driver;

public class Main {
  A obj=new B();
  System.out.println(obj.meth());
}
class A{
  public String meth(){
    retutn "Invoking method from class A";
  }
}
class B extends A{
public void meth(){
    return ;
  }
}
