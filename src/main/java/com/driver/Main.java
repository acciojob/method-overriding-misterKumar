package com.driver;

public class Main {
  public void main(String[] args) {
    A obj = new B();
    String ans = obj.meth();
    System.out.println(ans);
  }

  static class A {
    public String meth() {
      return "Invoking method from class A";
    }
  }

  static class B extends A {
    public String meth() {
      return "Method is overridden in Extendend class B";
    }
  }
}
