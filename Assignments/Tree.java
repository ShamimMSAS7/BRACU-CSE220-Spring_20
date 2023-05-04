public class Tree{
  public static void main(String[]args){
    Node a=new Node(10,null,null);
    Node b=new Node(20,null,null,a);
    Node c=new Node(30,null,null,a);
    a.left=b;
    a.right=c;
    Node d=new Node(60,null,null,b);
    Node e=new Node(25,null,null,d);
    Node f=new Node(50,null,null,c);
    Node g=new Node(5,null,null,f);
    Node h=new Node(12,null,null,f);
    b.right=d;
    d.right=e;
    c.right=f;
    f.left=g;
    f.right=h;
    System.out.println(level(a));
    System.out.println(level(b));
    System.out.println(level(c));
    System.out.println(level(d));
    System.out.println(level(e));
    System.out.println(level(f));
    System.out.println(level(g));
    System.out.println(level(h));
  }
  
  public static int level(Node k){
    if(k.parent==null)
      return 0;
    return 1+level(k.parent);
  }
  
}