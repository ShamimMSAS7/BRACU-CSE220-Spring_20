public class Lab10{
  public static void main(String []args){
    //Selection Sort
    int array[]={5,4,8,20,1};
    selectionSort(array,0);
    print(array,0);
    System.out.println();
    System.out.println();
    
    //Insertion Sort
    int array3[]={5,4,8,20,1};
    insertionSort(array,0);
    print(array,0);
    System.out.println();
    System.out.println();
    
    int [] array2={3,5,2,4,8,20,1,600,0};
    
    //Bubble Sort
    LinkedList l=new LinkedList(array2);
    l.printList(l.head);
    System.out.println();
    bubbleSort(l,l.head);
    l.printList(l.head);
    System.out.println();
    System.out.println();
    
    //Selection Sort
    LinkedList l2=new LinkedList(array2);
    l2.printList(l2.head);
    System.out.println();
    selectionSort(l2,l2.head);
    l2.printList(l2.head);
    System.out.println();
    System.out.println();
    
    //Insertion Sort
    DoublyList d=new DoublyList(array2);
    d.printList(d.head);
    System.out.println();
    insertionSort(d,d.head.next);
    d.printList(d.head);
    System.out.println();
    System.out.println();
    
    //Binary Search
    System.out.println(binarySearch(array,0,array.length-1,1));
  }
  
  
  //Selection Sort
  public static void selectionSort(int []array, int n){
    if(n==array.length-1)
      return ;
    int k=findMinIndex(array,n);
    int temp=array[n];
    array[n]=array[k];
    array[k]=temp;
    selectionSort(array,n+1);
  }
  public static int findMinIndex(int []array, int n){
    if(n==array.length-1)
      return n;
    int k=findMinIndex(array,n+1);
    if(array[n]<array[k])
      return n;
    return k;
  }
  
  
  //Insertion Sort
  public static void insertionSort(int []array,int n){
    if(n<array.length){
      int val=array[n];
      int k=findIndex(array,n-1,val);
      array[k]=val;
      insertionSort(array,n+1);
    }
  }
  public static int findIndex(int []array, int n, int val){
    if(n==-1)
      return 0;
    if(val<array[n]){
      array[n+1]=array[n];
      return findIndex(array,n-1,val);
    }
    return n+1;
  }
  
  
  //Bubble Sort
  public static void bubbleSort(LinkedList l, Node m){
    if(m!=null){
      l.head=swap(l.head,l.head,l.head.next);
      bubbleSort(l,m.next);
    }
  }
  public static Node swap(Node p, Node a, Node b){
    if(a!=null && b!=null){
      if(b.val<a.val){
        Node temp=b.next;
        b.next=a;
        a.next=temp;
        if(p==a){
          p=b;
        } else{
          p.next=b;
        }
        a=b;
        b=b.next;
      }
      swap(a,b,b.next);
    }
    return p;
  }
  
  
  //Selection sort
  public static void selectionSort(LinkedList l, Node n){
    if(n!=null){
      Node minNode=minNode(n);
      if(n==l.head){
        if(minNode!=l.head){
          Node prev=findPrev(l.head,minNode);
          prev.next=minNode.next;
          minNode.next=l.head;
          l.head=minNode;
        }
      }else{
        if(minNode!=n){
          Node prev=findPrev(l.head,minNode);
          prev.next=minNode.next;
          minNode.next=n;
          findPrev(l.head,n).next=minNode;
        }
      }
      n=minNode.next;
      selectionSort(l,n);
    }
    
  }
  public static Node minNode(Node n){
    if(n.next==null)
      return n;
    Node k=minNode(n.next);
    if(k.val<n.val)
      return k;
    return n;
  }
  public static Node findPrev(Node n, Node temp){
    if(n.next==temp)
      return n;
    return findPrev(n.next,temp);
  }
  
  
  //Insertion Sort
  public static void insertionSort(DoublyList d,Node2 n){
    if(n!=null){
      Node2 temp=findPos(n.prev,n);
      Node2 p=n.prev;
      Node2 s=n.next;
      if(temp!=p){
        p.next=s;
        if(s!=null)
          s.prev=p;
        if(temp==null){
          n.next=d.head;
          d.head.prev=n;
          n.prev=null;
          d.head=n;
        }else{
          n.next=temp.next;
          temp.next.prev=n;
          n.prev=temp;
          temp.next=n;
        }
      }
      insertionSort(d,s);
    }
  }
  public static Node2 findPos(Node2 n, Node2 m){
    if(n==null)
      return n;
    if(m.val>n.val)
      return n;
    return findPos(n.prev,m);
  }
  
  
  //Binary Search
  public static boolean binarySearch(int []array,int l, int r, int num){
    if(l>r)
      return false;
    if(array[(l+r)/2]==num)
      return true;
    if(array[(l+r)/2]>num)
      return binarySearch(array,l,(l+r)/2-1,num);
    return binarySearch(array,(l+r)/2+1,r,num);
  }
  
  
  //Print
  public static void print(int []array,int i){
    if(i<array.length){
      System.out.print(array[i]+" ");
      print(array,i+1);
    }
  }
}