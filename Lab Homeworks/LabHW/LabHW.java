public class LabHW{
  
  
  public int[] union(int []a,int []b){
    int []c=new int[a.length+b.length];
    for(int i=0;i<a.length;i++){
      c[i]=a[i];
    }
    for(int i=0;i<b.length;i++){
      c[i+a.length]=b[i];
    }
    for(int i=0;i<c.length;i++){
      for(int j=0;j<i;j++){
        if(c[i]==c[j]){
          c[i]=0;
          break;
        }
      }
    }
    int count=0;
    for(int i=0;i<c.length;i++){
      if(c[i]==0)
        count++;
    }
    int []d=new int[c.length-count];
    for(int i=0,j=0;i<c.length;i++){
      if(c[i]!=0)
        d[j++]=c[i];
    }
    
    return sort(d);
  }
  
  
  public int[] union(int[]a, int startA,int[] b, int startB){
    return  union(a,b);
  }
  
  
  public Node union(Node a,Node b){
    Node head=new Node(a.element,null);
    Node tail=head;
    for(Node n=a.next;n!=null;n=n.next){
      int count=0;
      for(Node m=head;m!=null;m=m.next){
        if(n.element==m.element){
          count++;
          break;
        }
      }
      if(count==0){
        tail.next=new Node(n.element,null);
        tail=tail.next;
      }
    }
    for(Node n=b;n!=null;n=n.next){
      int count=0;
      for(Node m=head;m!=null;m=m.next){
        if(n.element==m.element){
          count++;
          break;
        }
      }
      if(count==0){
        tail.next=new Node(n.element,null);
        tail=tail.next;
      }
    }
    return sort(head);
  }
  
  
  public int[] intersection(int []a, int []b){
    int c[]=new int[a.length];
    int count=0;
    for(int i=0;i<a.length;i++){
      for(int j=0;j<b.length;j++){
        if(a[i]==b[j] && a[i]!=0){
          c[count++]=a[i];
          break;
        }
      }
    }
    int d[]=new int[count];
    for(int i=0;i<d.length;i++)
      d[i]=c[i];
    return d;
  }
  
  
  public int[] intersection(int []a, int startA, int []b, int startB){
    return intersection(a,b);
  }
  
  
  public Node intersection(Node a, Node b){
    Node head=null;
    Node tail=null;
    int count=0;
    for(Node n=a;n!=null;n=n.next){
      for(Node m=b;m!=null;m=m.next){
        if(n.element==m.element){
          if(count==0){
            head=new Node(n.element,null);
            tail=head;
          } else{
            int count2=0;
            for(Node k=head;k!=null;k=k.next){
              if(n.element==k.element){
                count2++;
                break;
              }
            }
            if(count2==0){
              Node k=new Node(n.element,null);
              tail.next=k;
              tail=tail.next;
            }
          }
          count++;
          break;
        }
      }
    }
    return sort(head);
  }
  
  
  public int[] sort(int[]a){
    for(int i=0;i<a.length-1;i++){
      int count=0;
      for(int j=0;j<a.length-1;j++){
        if(a[j]>a[j+1]){
          int temp=a[j];
          a[j]=a[j+1];
          a[j+1]=temp;
          count++;
        }
      }
      if(count==0)
        break;
    }
    return a;
  }
  
  
  public int[] sort(int[]a,int start){
    a=sort(a);
    int count=0;
    for(int i=0;i<a.length;i++){
      if(a[i]==0)
        count++;
      else
        break;
    }
    int b[]=new int[a.length-count];
    for(int i=0;i<b.length;i++)
      b[i]=a[i+count];
    return b;
  }
  
  
  public Node sort(Node a){
    for(Node n=a;n!=null;n=n.next){
      for(Node m=n.next;m!=null;m=m.next){
        if(m.element<n.element){
          int temp=m.element;
          m.element=n.element;
          n.element=temp;
        }
      }
    }
    return a;
  }
  
  
  public int[] zigzag(int []a, int[]b){
    int []c=new int[a.length+b.length];
    for(int i=0;i<c.length;i++){
      if(i%2==0)
        c[i]=a[i/2];
      else
        c[i]=b[i/2];
    }
    return c;
  }
  
  
  public int[] zigzag(int []a,int startA,int sizeA, int[]b,int startB,int sizeB){
    int []c=new int[sizeA+sizeB];
    for(int i=0;i<c.length;i++){
      if(i%2==0)
        c[i]=a[(i/2+startA)%a.length];
      else
        c[i]=b[(i/2+startB)%b.length];
    }
    return c;
  }
  
  
  public Node zigzag(Node a, Node b){
    Node head=new Node(a.element,null);
    Node tail=head;
    for(Node n=a.next;n!=null;n=n.next){
      Node k=new Node(n.element,null);
      tail.next=k;
      tail=tail.next;
    }
    tail=head;
    for(Node n=b;n!=null;n=n.next){
      Node k=new Node(n.element,tail.next);
      tail.next=k;
      tail=tail.next.next;
    }
    return head;
  }
  
  
  public Node product(Node a, Node b){
    Node head=new Node((Integer)a.element*(Integer)b.element,null);
    Node tail=head;
    for(Node tailA=a.next,tailB=b.next;tailA!=null;tailA=tailA.next,tailB=tailB.next){
      Node n=new Node((Integer)tailA.element*(Integer)tailB.element,null);
      tail.next=n;
      tail=tail.next;
    }
    return head;
  }
  
  public Node sum(Node a, Node b){
    Node head=new Node((Integer)a.element+(Integer)b.element,null);
    Node tail=head;
    for(Node tailA=a.next,tailB=b.next;tailA!=null;tailA=tailA.next,tailB=tailB.next){
      Node n=new Node((Integer)tailA.element+(Integer)tailB.element,null);
      tail.next=n;
      tail=tail.next;
    }
    return head;
  }
  
  
  public Node difference(Node a, Node b){
    Node head=new Node((Integer)a.element-(Integer)b.element,null);
    Node tail=head;
    for(Node tailA=a.next,tailB=b.next;tailA!=null;tailA=tailA.next,tailB=tailB.next){
      Node n=new Node((Integer)tailA.element-(Integer)tailB.element,null);
      tail.next=n;
      tail=tail.next;
    }
    return head;
  }
  
  public int dotProduct(Node a, Node b){
    int x=0;
    for(Node tailA=a,tailB=b;tailA!=null;tailA=tailA.next,tailB=tailB.next){
      x+=(Integer)tailA.element*(Integer)tailB.element;
    }
    return x;
  }
  
  
  public int[] mergeSorted(int []a, int []b){
    int []c=new int[a.length+b.length];
    int i=0;
    int j=0;
    for(int k=0;k<c.length;k++){
      if(i==a.length)
        c[k]=b[j++];
      else if(j==b.length)
        c[k]=a[i++];
      else if(a[i]<b[j])
        c[k]=a[i++];
      else
        c[k]=b[j++];
    }
    return c;
  }
  
  
  public void print(int[] a){
    for(int i=0;i<a.length-1;i++)
      System.out.print(a[i]+", ");
    if(a.length>0)
      System.out.println(a[a.length-1]);
    System.out.println("***************");
  }
}