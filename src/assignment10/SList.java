package assignment10;

public class SList<T> {

   Link head;

    public SList() {

    }

    private class Link {
        T data;
        Link next;

       Link(T data){
        this.data = data;
        this.next = null;
       }
    }

    // initiate link list with one node
    SList(T data){
     head = new Link(data);
    }

   SListIterator iterator(){
      return new SListIteratorImplementor();
    }


    private class SListIteratorImplementor implements SListIterator<T> {
       Link curr, prev;

       SListIteratorImplementor(){
        curr = head;
        prev = null;
       }

        @Override
        public T next() {
           T currData = null;
            if(curr!=null){
               currData =  curr.data;
               this.prev = curr;
               this.curr = curr.next;
            }
         return  currData;
        }

        @Override
        public boolean hasNext() {
            if(curr!=null)
            {
                return true;
            }
            return false;

        }

        @Override
        public void remove() {
            try {
                if (curr==null) {
                    throw new Exception("no element at current position");
                }
                //removal of first node
                if (prev == null) {
                    head = curr.next;
                    curr=head;
                }

                else {

                    prev.next=curr.next;
                    curr=prev.next;
                }
            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());
            }

        }

        @Override
        public void insert(T data) {
           Link newLink = new Link(data);
           //when no node exists
       if(curr == prev){
           head = newLink;
           curr = newLink;
       }
       //curr node is first node
       else if(prev==null){
           head= newLink;
           head.next=curr;
           curr=head;
       }
       else {
           prev.next=newLink;
           newLink.next=curr;
           curr=newLink;

       }
        }
    }

    @Override
    public String toString() {
            Link node=head;
            String str;
            str="[ ";
            while (node!=null)
            {
                str+=node.data+" ";
                node=node.next;
            }
            str+="]";
            return str;
        }
}
