public class Recursion{
  
  
  public int factorial(int n){
    if(n==0)
      return 1;
    return n*factorial(n-1);
  }
  
  
  public int fibonacci(int n){
    if(n==0 || n==1)
      return n;
    return fibonacci(n-1)+fibonacci(n-2);
  }
  
  
  public void printArray(int []array, int n){
    if(n<array.length){
      System.out.print(array[n]+" ");
      printArray(array,n+1);
    } else
      System.out.println();
  }
  
  
  public String toBinary(int n){
    if(n<0)
      return "Negative number";
    if(n/2==0)
      return String.valueOf(n%2);
    return String.valueOf(toBinary(n/2))+String.valueOf(n%2);
  }
  
  
  public double power(int m, int n){
    if(n==0)
      return 1.0;
    else if(n>0)
      return 1.0*m*power(m,n-1);
    else
      return 1.0*power(m,n+1)/m;
  }
  
  
  public int add(Node n){
    if(n==null)
      return 0;
    return n.val+add(n.next);
  }
  
  
  public void printReverse(Node n){
    if(n!=null){
      printReverse(n.next);
      System.out.print(n.val+" ");
    }
  }
}