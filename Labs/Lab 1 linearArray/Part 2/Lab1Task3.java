import java.util.Scanner;
public class Lab1Task3{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    try{
      int x,n=sc.nextInt();
      int a[]=new int[n];
      a[5]=99;
      x=n/0;
    }
    catch(ArithmeticException a){
      System.out.println("No number is divisible by 0");
    }
    catch(ArrayIndexOutOfBoundsException a){
      System.out.println("Array size must be bigger than the provided index number");
    }
    finally{
      System.out.println("THE END");
    }
  }
}
