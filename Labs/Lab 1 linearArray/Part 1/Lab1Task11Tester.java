import java.util.Scanner;
public class Lab1Task11Tester{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    Lab1Task11 msas=new Lab1Task11();
    System.out.println(msas.allDigitsOdd(x));
  }
}