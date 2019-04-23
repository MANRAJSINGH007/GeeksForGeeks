class Node
{
    int k;
    int v;
    Node next;
    Node prev;
    
}
class LRUCache {
 
     HashMap<Integer,Node> map;
     Node head;
     Node tail;
     int capacity=0;
    
    public void insert(int key, int value)
    {
        if(head==null)
        {
            head=new Node();
            head.k=key;
            head.v=value;
            tail=head;
            map.put(key,head);
            return ;
        }
        
        else
        {
            if(map.size()==capacity)
            {
                if(capacity==1)
                {
                    int already_present_key=head.k;
                    head=null;
                    map.remove(already_present_key);
                    head=new Node();
                    head.k=key;
                    head.v=value;
                    tail=head;
                    map.put(key,head);
                    return ;
                }
                else
                {
                    tail=tail.prev;
                    int to_be_removed=tail.next.k;
                    map.remove(to_be_removed);
                    tail.next=null;
                    Node abc=new Node();
                    abc.k=key;
                    abc.v=value;
                    abc.next=head;
                    head.prev=abc;
                    head=abc;
                    map.put(key,head);
                    return ;
                }
            }
            else
            {
                Node temp=new Node();
                temp.k=key;
                temp.v=value;
                temp.next=head;
                head.prev=temp;
                map.put(key,temp);
                head=temp;
                
                return ;    
            }
                
        }
        
    }
    
    public LRUCache(int n) {
     
       head=null;
       tail=null;
       map=new HashMap<Integer,Node>();
       capacity=n;
       
    }
    
    public void duplicateset1(int key, int value)
    {
        Node refer=map.get(key);
        if(head==tail || refer==head)
        {
            head.v=value;
            return ;
        }
        
        if(refer==tail)
        {
            tail=tail.prev;
            tail.next=null;
            refer.prev=null;
            refer.next=head;
            head.prev=refer;
            head=refer;
            head.v=value;
            return ;
        }
        
        Node pichla=refer.prev;
        Node agla=refer.next;
        pichla.next=agla;
        agla.prev=pichla;
        refer.next=null;
        refer.prev=null;
        
        refer.next=head;
        head.prev=refer;
        head=refer;
        refer.v=value;
        return ;
        
    }
    
    public void duplicateset2(int key)
    {
        Node refer=map.get(key);
        if(head==tail || refer==head)
        {
            return ;
        }
        
        if(refer==tail)
        {
            tail=tail.prev;
            tail.next=null;
            refer.prev=null;
            refer.next=head;
            head.prev=refer;
            head=refer;
            return ;
        }
        
        Node pichla=refer.prev;
        Node agla=refer.next;
        pichla.next=agla;
        agla.prev=pichla;
        refer.next=null;
        refer.prev=null;
        
        refer.next=head;
        head.prev=refer;
        head=refer;
        return ;
        
    }
    
    public int get(int key) {
       
       if(!map.containsKey(key))
       {
           return -1;
       }
       duplicateset2(key);
       return map.get(key).v;
    }
    
    
    public void set(int key, int value) {
        
        if(!map.containsKey(key))
        {
            insert(key,value);
        }
       
        duplicateset1(key,value);
        
        return ;
       
       
    }
}
