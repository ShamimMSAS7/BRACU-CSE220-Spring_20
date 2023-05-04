import java.util.Scanner;
public class BookTester{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    BookRecords br=new BookRecords();
    char c;
    do{
      System.out.println("Enter 1 to Add a Record\nEnter 2 to Print the Records\nEnter 3 to Delete a Record\nEnter 4 to Edit a Record");
      int num=sc.nextInt();
      if(num==1)
        br.addRecord();
      else if(num==2)
        br.printRecord();
      else if(num==3)
        br.deleteRecord();
      else if(num==4)
        br.editRecord();
      System.out.println("If u want to continue press Y/y");
      c=sc.next().charAt(0);
    } while(c=='Y' || c=='y');
  }
}