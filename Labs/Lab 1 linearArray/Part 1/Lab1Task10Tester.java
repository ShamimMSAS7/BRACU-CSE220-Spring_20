import java.util.Scanner;
public class Lab1Task10Tester{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int x,y;
    for(;;){
      System.out.println("Enter the number of month");
      x=sc.nextInt();
      if(x>=1 && x<=12)
        break;
      else
        System.out.println("invalid number");
    }
    for(;;){
      System.out.println("Enter the number of date");
      y=sc.nextInt();
      if(y>=1 && y<=31)
        break;
      else
        System.out.println("invalid number");
    }
    Lab1Task10 msas= new Lab1Task10();
    System.out.println(msas.season(x,y));
  }
}