package ru.stqa.pft.sandbox;

public class FirstProgram {
  public static void main(String[] args) {

    Square s = new Square(9);
    System.out.println("Плозадь квадрата со стороной " + s.l + " = " + s.area());

    Rectangle r = new Rectangle(8,8);
    System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());
  }

}