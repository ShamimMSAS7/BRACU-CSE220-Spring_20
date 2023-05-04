public class Patient{
  private String name;
  private int age;
  private String bG;
  private int priority;
  Patient(String n, int a, String b,int prio){
    name=n;
    age=a;
    bG=b;
    priority=prio;
  }
  String getName(){
    return name;
  }
  int getAge(){
    return age;
  }
  String getBG(){
    return bG; 
  }
  int getPriority(){
    return priority;
  }
  void printDetail(){
    System.out.println("***********************************");
    System.out.println("Name of the Patient: "+name);
    System.out.println("Age of the Patient: "+age);
    System.out.println("Blood Group of the Patient: "+bG);
    System.out.println("Priority of the Patient: "+priority);
  }
  
}