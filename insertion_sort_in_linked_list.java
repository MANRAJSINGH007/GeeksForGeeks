
public class Solution {

  	public static LinkedListNode<Integer> function(LinkedListNode<Integer> head){
      
      LinkedListNode<Integer> curr=head.next;
      LinkedListNode<Integer> parent=head;
      
      while(curr!=null){
        
        if(curr.data>parent.data){
          
          parent=curr;
          curr=curr.next;
          
        }
        
        else{
          
          LinkedListNode<Integer> new_curr=curr.next;
          curr.next=null;
          parent.next=null;
          
          LinkedListNode<Integer> t=head;
          LinkedListNode<Integer> prev=null;
          
          while(t.data<curr.data){
            
            prev=t;
            t=t.next;
            
          }
          
          if(prev==null){
            
            curr.next=head;
            head=curr;
            
          }
          
          else{
            
            prev.next=curr;
            curr.next=t;
            
          }
          
          parent.next=new_curr;
          curr=new_curr;
          
        }
        
        
      }
      
      
      return head;      
      
    }
  
  
	public static LinkedListNode<Integer> insertionSort(LinkedListNode<Integer> head) {
	
      if(head==null || head.next==null){
        
        return head;
        
      }
      
      return function(head);
      
      
	}

}
