import java.util.Scanner;
public class Tester{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    MyOrderList m=new MyOrderList();
    int n=1;
    while(n!=0){
      System.out.println("Enter 0 to stop the program");
      System.out.println("Enter 1 to insert element");
      System.out.println("Enter 2 to retrive element");
      System.out.println("Enter 3 to remove element of the cursor");
      System.out.println("Enter 4 to remove given element");
      System.out.println("Enter 5 to clear the list");
      System.out.println("Enter 6 to know whether the list is empty");
      System.out.println("Enter 7 to go to beginning");
      System.out.println("Enter 8 to go to end");
      System.out.println("Enter 9 to go to next");
      System.out.println("Enter 10 to go to prior");
      System.out.println("Enter 11 to get cursor");
      System.out.println("Enter 12 to show the list");
      n=sc.nextInt();
      if(n==1){
        System.out.println("Enter the number");
        Node k=new Node(sc.nextInt(),null);
        m.insert(k);
      } else if(n==2)
        System.out.println(m.retrive(sc.nextInt()));
      else if(n==3)
        System.out.println(m.remove());
      else if(n==4)
        System.out.println(m.remove(sc.nextInt()));
      else if(n==5)
        m.clear();
      else if(n==6)
        System.out.println(m.isEmpty());
      else if(n==7)
        System.out.println(m.gotoBeginning());
      else if(n==8)
        System.out.println(m.gotoEnd());
      else if(n==9)
        System.out.println(m.gotoNext());
      else if(n==10)
        System.out.println(m.gotoPrior());
      else if(n==11){
        if(m.getCursor()!=null)
          System.out.println(m.getCursor().key);
      }
      else if(n==12)
        m.showList();
    }
  }
}