public class MyOrderList{
  Node cursor;
  MyOrderList(){
    cursor=null;
  }
  void insert(Node newElement){
    if(cursor==null){
      cursor=new Node(newElement.key,null);
      cursor.next=cursor;
    }else{
      Node p=cursor;
      Node n=cursor;
      Node tail=cursor;
      do{
        if(tail.key<tail.next.key){
          if(newElement.key>tail.key){
            if(newElement.key<tail.next.key){
              p=tail;
              n=tail.next;
              break;
            }
          }
        } else{
          if(newElement.key<tail.next.key || newElement.key>tail.key){
            p=tail;
            n=tail.next;
            break;
          }
        }
        tail=tail.next;
      }while(tail!=cursor);
      Node temp=new Node(newElement.key,n);
      p.next=temp;
    }
  }
  
  
  Node retrive(int searchKey){
    if(cursor==null)
      return null;
    else if(cursor.key==searchKey)
      return cursor;
    for(Node n=cursor.next;n!=cursor;n=n.next){
      if(n.key==searchKey){
        cursor=n;
        return cursor;
      }
    }
    return null;
  }
  
  
  Node remove(){
    if(cursor==null)
      return null;
    Node temp=cursor;
    if(cursor.next==cursor){
      cursor=null;
    } else{
      Node n=temp.next;
      while(n.next!=cursor)
        n=n.next;
      n.next=n.next.next;
      cursor=n.next;
    }
    return temp;
  }
  
  
  Node remove(int deleteKey){retrive(deleteKey);
    if(retrive(deleteKey)==null){
      return null;
    } 
    return remove();
  }
  
  
  void clear(){
    cursor=null;
  }
  
  
  boolean isEmpty(){
    if(cursor==null)
      return true;
    return false;
  }
  
  
  Node gotoBeginning(){
    if(cursor==null)
      return null;
    Node n=cursor.next;
    while(n!=cursor){
      if(n.key>n.next.key){
        cursor =n.next;
        return cursor;
      }
      n=n.next;
    }
    cursor=cursor.next;
    return cursor;
  }
  
  
  Node gotoEnd(){
    if(cursor==null)
      return null;
    Node n=cursor.next;
    while(n!=cursor){
      if(n.key>n.next.key){
        cursor =n;
        return cursor;
      }
      n=n.next;
    }
    return cursor;
  }
  
  
  Node gotoNext(){
    if(cursor==null)
      return null;
    cursor=cursor.next;
    return cursor;
  }
  
  
  Node gotoPrior(){
    if(cursor==null)
      return null;
    Node n=cursor.next;
    while(n.next!=cursor)
      n=n.next;
    cursor=n;
    return cursor;
  }
  
  Node getCursor(){
    if(cursor==null)
      return null;
    return cursor;
  }
  
  void showList(){
    if(cursor==null)
      System.out.println("Empty List");
    else{
      Node temp=cursor;
      gotoBeginning();
      System.out.print(cursor.key);
      for(Node n=cursor.next;n!=cursor;n=n.next){
        System.out.print(", "+n.key);
      }
      System.out.println();
      cursor=temp;
    }
  }
}