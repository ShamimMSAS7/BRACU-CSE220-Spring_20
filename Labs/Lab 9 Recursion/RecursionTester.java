import java.util.Scanner;
public class RecursionTester{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    Recursion r=new Recursion();
    System.out.println(r.factorial(6));
    System.out.println(r.fibonacci(7));
    int []array={5,7,3,8,9,0};
    r.printArray(array,0);
    System.out.println(r.toBinary(1));
    System.out.println(r.power(5,4));
    LinkedList l=new LinkedList(array);
    System.out.println(r.add(l.head));
    r.printReverse(l.head);
  }
}