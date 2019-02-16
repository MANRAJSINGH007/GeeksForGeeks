
public class Solution {

  
  	public static LinkedListNode<Integer> function(LinkedListNode<Integer> head){
      
      int count=0;
      
      LinkedListNode<Integer> te=head;
      
      while(te!=null){
        
        te=te.next;
        count++;
        
      }
      
      while(count!=1){
        
        LinkedListNode<Integer> max=head;
        LinkedListNode<Integer> prev=null;
       
        
        LinkedListNode<Integer> t=head;
        LinkedListNode<Integer> parent=null;
        
        
        int cnt=0;
        
        while(cnt!=count){
          
          if(t.data>max.data){
            
            max=t;
            prev=parent;
            
          }
          
     	  parent=t;
          t=t.next;
          cnt++;
          
        }
        
        if(max==parent){
          
          // alraedy at the right place.
        }
        
        else if(max==head){
          
          head=max.next;
          max.next=null;
          max.next=parent.next;
          parent.next=max;
          
          
        }
        
        else{
          
          prev.next=max.next;
          max.next=parent.next;
          parent.next=max;
          
          
        }
        
        
        count--;
        
        
      }
      
      
      return head;
      
    }
  
  	
	public static LinkedListNode<Integer> bubbleSort(LinkedListNode<Integer> head) {
		// write your code here
      
      if(head==null || head.next==null){
        
        return head;
        
      }
      
      return function(head);
      
	}

}
