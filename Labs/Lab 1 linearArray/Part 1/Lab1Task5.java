import java.util.Scanner;
public class Lab1Task5{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int []x=new int[10];
    for(int i=0;i<15;i++){
      System.out.println("Enter the number of position "+(i+1));
      int num=sc.nextInt();
      if(num>=0 && num<=9)
        x[num]++;
      else{
        System.out.println("invalid number");
        i--;
      }
    }
    for(int i=0;i<x.length;i++)
      System.out.println(i+" was found "+x[i]+" times");
  }
}