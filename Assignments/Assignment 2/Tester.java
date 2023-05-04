public class Tester{
  public static void main(String [] args){
    Object [] array = {1,2,5,4,7,11,4,8,9};
    LinkedList l = new LinkedList(array);
    Assignment a=new Assignment();
    a.veryEasy(l);
    System.out.println("*************************");
    Object[] array2=a.easy(l);
    printArray(array2);
    System.out.println("*************************");
    a.medium(l);
    l.printList();
    System.out.println("*************************");
    a.hard(l);
    l.printList();
    System.out.println("*************************");
    l = new LinkedList(array);
    a.veryHard(l);
    l.printList();
    
  }
  public static void printArray(Object[] arr){
    for(int i=0;i<arr.length-1;i++)
      System.out.print(arr[i]+",");
    if(arr.length-1>=0)
      System.out.println(arr[arr.length-1]);
  }
}