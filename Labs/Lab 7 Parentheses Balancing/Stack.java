public interface Stack { 
    public int size();
    public boolean isEmpty();
    public void push(Object e);
    public Object pop();
    public Object peek();
    public String toString();
    public Object[] toArray();
    public int search(Object e);
}