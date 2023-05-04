import java.util.Scanner;
public class A3T3{
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the height of the house");
    int h=sc.nextInt();
    if(h<0)
      System.out.println("Wrong input");
    else
      System.out.println("Number of cards needeed "+hocBuilder(h));
  }
  
  public static int hocBuilder(int height){
    if(height==0)
      return 0;
    if(height==1)
      return 8;
    return 5+hocBuilder(height-1);
  }
}