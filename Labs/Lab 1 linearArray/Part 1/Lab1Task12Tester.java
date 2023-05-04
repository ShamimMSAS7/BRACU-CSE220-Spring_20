import java.util.Scanner;
public class Lab1Task12Tester{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int m1,d1,m2,d2;
    for(;;){
      System.out.println("Enter the number of first month");
      m1=sc.nextInt();
      if(m1>=1 && m1<=12)
        break;
      else
        System.out.println("invalid number");
    }
    for(;;){
      System.out.println("Enter the number of first day");
      d1=sc.nextInt();
      if(d1>=1 && d1<=31)
        break;
      else
        System.out.println("invalid number");
    }
    for(;;){
      System.out.println("Enter the number of second month");
      m2=sc.nextInt();
      if(m2>=1 && m2<=12)
        break;
      else
        System.out.println("invalid number");
    }
    for(;;){
      System.out.println("Enter the number of second day");
      d2=sc.nextInt();
      if(d2>=1 && d2<=31)
        break;
      else
        System.out.println("invalid number");
    }
    Lab1Task12 msas= new Lab1Task12();
    System.out.println(msas.comesFirst(m1,d1,m2,d2));
  }
}