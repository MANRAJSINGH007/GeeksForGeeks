public Stack<Integer> sortStack(Stack<Integer> st) {

    if(st==null || st.empty() || st.size()==1) {
       return st;
  }
	
	Stack<Integer> aux=new Stack<Integer>();

	int counter=0;
	int temp=0;

	while(!st.isEmpty()) {
    temp=st.pop();
    counter=0;	
	
    while(!aux.isEmpty() && aux.peek()>temp){
      int  popped=aux.pop();
      counter++;
      st.push(popped);	
    }

		aux.push(temp);
    for (int i=0;i<counter;i++) {
      aux.push(st.pop());
    }
  }

  while(!aux.isEmpty()) {
    st.push(aux.pop());
  }

	return st;
  
}
