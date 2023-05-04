public class Assignment{
  public void veryEasy(LinkedList l){
    int count=0;
    for(Node n=l.head;n!=null;n=n.next){
      if(Integer.valueOf(String.valueOf(n.element))%2==0){
        if(count==0)
          System.out.print(n.element);
        else
          System.out.print(","+n.element);
        count++;
      }
    }
    System.out.println();
  }
  
  
  public Object[] easy(LinkedList l){
    int count=0;
    for(Node n=l.head;n!=null;n=n.next){
      if(Integer.valueOf(String.valueOf(n.element))%2==0)
        count++;
    }
    Object []array=new Object[count];
    count=0;
    for(Node n=l.head;n!=null;n=n.next){
      if(Integer.valueOf(String.valueOf(n.element))%2==0)
        array[count++]=n.element;
    }
    return array;
  }
  
  public void medium(LinkedList l){
    int count=0;
    for(Node n=l.head;n!=null;n=n.next){
      if(Integer.valueOf(String.valueOf(n.element))%2==0){
        l.remove(count);
        break;
      }
      count++;
    }
  }
  public void hard(LinkedList l){
    int count=0;
    for(Node n=l.head;n!=null;n=n.next){
      if(Integer.valueOf(String.valueOf(n.element))%2==0)
        l.remove(count);
      else
        count++;
    }
  }
  public void veryHard(LinkedList l){
    Node prevN=l.head;
    Node n=l.head;
    if((Integer)n.element%2==0){
      for(n=n.next;n!=null;n=n.next){
        if((Integer)n.element%2!=0){
          prevN.next=n.next;
          n.next=l.head;
          l.head=n;
          break;
        }
        prevN=n;
      }
    }
    Node tail=l.head;
    for(n=prevN.next;n!=null;n=n.next){
      if((Integer)n.element%2!=0){
        prevN.next=n.next;
        n.next=tail.next;
        tail.next=n;
        tail=tail.next;
        n=prevN;
      }
      prevN=n;
    }
  }
}
