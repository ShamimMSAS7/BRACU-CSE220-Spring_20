import java.util.Scanner;
public class Lab11{
  public static void main(String [] args){
    Node a=new Node(10,null,null,null);
    Node b=new Node(20,a,null,null);
    Node c=new Node(30,a,null,null);
    a.left=b;
    a.right=c;
    Node d=new Node(40,b,null,null);
    Node e=new Node(50,b,null,null);
    b.left = d;
    b.right=e;
    Node f=new Node(60,c,null,null);
    Node g=new Node(70,c,null,null);
    c.left=f;
    c.right=g;
    Node h=new Node(80,g,null,null);
    g.right=h;
    Node i=new Node(90,f,null,null);
    f.left=i;
    Node j=new Node(100,h,null,null);
    h.left=j;
    
    // task 1
    System.out.println(height(a));
    
    //task 2
    System.out.println(level(i));
    
    //task 3
    printPreOrdered(a);
    System.out.println();
    
    //task 4
    printInOrdered(a);
    System.out.println();
    
    //task 5
    printPostOrdered(a);
    System.out.println();
    
    //task 6
    System.out.println(checkSame(a,a));
    System.out.println(checkSame(i,a));
    
    //task 7
    Node n=copyTree(a);
    printPreOrdered(n);
    System.out.println();
    System.out.println(checkSame(n,a));
  }
  
  
  public static int height(Node n){
    if(n==null)
      return -1;
    int l=1+height(n.left);
    int r=1+height(n.right);
    if(r>l)
      return r;
    return l;
  }
  
  public static int level(Node n){
    if(n==null)
      return -1;
    return 1+level(n.parent);
  }
  
  public static void printPreOrdered(Node n){
    if(n==null)
      return;
    System.out.print(n.object+" ");
    printPreOrdered(n.left);
    printPreOrdered(n.right);
  }
  
  public static void printInOrdered(Node n){
    if(n==null)
      return;
    printInOrdered(n.left);
    System.out.print(n.object+" ");
    printInOrdered(n.right);
  }
  
  public static void printPostOrdered(Node n){
    if(n==null)
      return;
    printPostOrdered(n.left);
    printPostOrdered(n.right);
    System.out.print(n.object+" ");
  }
  
  public static boolean checkSame(Node a, Node b){
    if(a==null && b==null)
      return true;
    if((a==null && b!=null) || (a!=null && b==null))
      return false;
    return checkSame(a.left,b.left) && checkSame(a.right,b.right);
  }
  
  public static Node copyTree(Node a){
    if(a==null)
      return null;
    Node n=new Node(a.object,null,null,null);
    Node l=copyTree(a.left);
    Node r=copyTree(a.right);
    n.left=l;
    n.right=r;
    if(l!=null)
      l.parent=n;
    if(n!=null)
      n.parent=n;
    return n;
  }
}