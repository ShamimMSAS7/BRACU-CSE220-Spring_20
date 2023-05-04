public class LabHWTester{
  public static void main(String[]args){
    int []a={7,9,0,0,0,1,3,5};
    int []b={0,2,4,6,8,10};
    int []d={1,2,100,100,500,500};
    int []e={4,9,500,30,30,500,1};
    LinkedList l1=new LinkedList(d);
    
    LinkedList l2=new LinkedList(e);
    
    LabHW l=new LabHW();
    int []c=l.union(a,d);
    l.print(c);
    c=l.union(a,2,b,1);
    l.print(c);
    LinkedList l3=new LinkedList(l.union(l1.head,l2.head));
    l3.printList();
    c=l.intersection(a,b);
    l.print(c);
    c=l.intersection(a,2,b,1);
    l.print(c);
    l3=new LinkedList(l.intersection(l1.head,l2.head));
    l3.printList();
    c=l.sort(e);
    l.print(c);
    c=l.sort(a,2);
    l.print(c);
    c=l.sort(a);
    l.print(c);
    l3=new LinkedList(l.sort(l2.head));
    l3.printList();
    int []f={1,3,7,7};
    int []g={4,6,9,10};
    c=l.zigzag(f,g);
    l.print(c);
    int []h={7,9,0,0,0,1,3,5};
    c=l.zigzag(h,5,5,b,1,5);
    l.print(c);
    
    l1=new LinkedList(f);
    l2=new LinkedList(g);
    l3=new LinkedList(l.zigzag(l1.head,l2.head));
    l3.printList();
    
    l3=new LinkedList(l.product(l1.head,l2.head));
    l3.printList();
    
    l3=new LinkedList(l.sum(l1.head,l2.head));
    l3.printList();
    
    l3=new LinkedList(l.difference(l1.head,l2.head));
    l3.printList();
    
    System.out.println(l.dotProduct(l1.head,l2.head));
    int j[]={1,3,4,5,8,9};
    int i[]={4,6,7,8,10,11,12};
    c=l.mergeSorted(j,i);
    l.print(c);
  }
}