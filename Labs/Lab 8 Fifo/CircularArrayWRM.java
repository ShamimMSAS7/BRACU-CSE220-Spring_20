import java.util.Scanner;
public class CircularArrayWRM implements WRM{
  Patient []cir=new Patient[1];
  int size=0;
  int start=0;
  Scanner sc=new Scanner(System.in);
  
  
  void resize(){
    Patient []msas=new Patient[cir.length+1];
    for(int i=start;i<start+size;i++){
      msas[i%msas.length]=cir[i%cir.length];
    }
    cir=msas;
  }
  
  
public void registerPatient(){
    System.out.println("Enter the name of the patient");
    String name=sc.nextLine();
    System.out.println("Enter the age of the patient");
    int age=sc.nextInt();
    sc.nextLine();
    System.out.println("Enter the Blood Group of the patient");
    String bg=sc.nextLine();
    System.out.println("Enter the priority of the patient");
    int priority=sc.nextInt();
    sc.nextLine();
    Patient p=new Patient(name,age,bg,priority);
    if(size==cir.length)
      resize();
    cir[(start+size)%cir.length]=p;
    for(int i=start+size;i>start;i--){
      if(cir[i%cir.length].getPriority()<cir[(i-1)%cir.length].getPriority()){
        Patient temp=cir[i%cir.length];
        cir[i%cir.length]=cir[(i-1)%cir.length];
        cir[(i-1)%cir.length]=temp;
      }else
        break;
    }
    size++;
  }
  
  
  public Patient servePatient(){
    if(size==0)
      return null;
    Patient p=cir[start];
    start=(start+1)%cir.length;
    size--;
    return p;
  }
  
  
  public void cancelAll(){
    size=0;
  }
  
  
  public boolean canDoctorGoHome(){
    if(size==0)
      return true;
    return false;
  }
  
  
  public void showAllPatient(){
    if(size==0)
      System.out.println("No patient to show");
    else{
      Patient temp[]=new Patient[size];
      for(int i=0;i<size;i++)
        temp[i]=cir[(start+i)%cir.length];
      for(int i=0;i<temp.length-1;i++){
        for(int j=i+1;j<temp.length;j++){
          if(temp[j].getName().compareTo(temp[i].getName())<0){
            Patient msas=temp[i];
            temp[i]=temp[j];
            temp[j]=msas;
          }
        }
      }
      for(int i=0;i<temp.length;i++)
        temp[i].printDetail();
      System.out.println("#########################");
      for(int i=0;i<size;i++)
        cir[(i+start)].printDetail();
    }
  }
}