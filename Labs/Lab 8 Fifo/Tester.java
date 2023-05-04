import java.util.Scanner;
public class Tester{
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    WRM wrm;
    for(;;){
      System.out.println("***********************************");
      System.out.println("Press \'1\' for Circular Array based WRM");
      System.out.println("Press \'2\' for Linked List based WRM");
      int n=sc.nextInt();
      sc.nextLine();
      if(n==1){
        wrm=new CircularArrayWRM();
        break;
      } else if(n==2){
        wrm=new ListWRM();
        break;
      } else
        System.out.println("Wrong Input.");
    }
    for(;;){
      System.out.println("***********************************");
      System.out.println("For registeing a patient press \'1\'");
      System.out.println("For serving a patient press \'2\'");
      System.out.println("For cancelling all appointment press \'3\'");
      System.out.println("For knowing if doctor can go home press \'4\'");
      System.out.println("For showing all patient press \'5\'");
      System.out.println("For stopping the program press any other number");
      int n=sc.nextInt();
      sc.nextLine();
      Patient p;
      if(n==1)
        wrm.registerPatient();
      else if(n==2){
        p=wrm.servePatient();
        if(p!=null)
          p.printDetail();
      }else if(n==3){
        wrm.cancelAll();
      }else if(n==4){
        if(wrm.canDoctorGoHome())
          System.out.println("Yes, the doctor can go home.");
        else
          System.out.println("No, the doctor can't go home.");
      }else if(n==5)
        wrm.showAllPatient();
      else
        break;
    }
  }
}