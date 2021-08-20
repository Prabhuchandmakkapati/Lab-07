import java.io.*;


class LinkedNode {
    public int x;
    public LinkedNode next;
    public LinkedNode(int a){
         x = a;       
    }
}
class LinkedStack {
LinkedNode front; // Reference to the first LinkedNode in the list
int count;        // Number of nodes in the list

// Constructor - initializes the front and count variables
LinkedStack() {
front = null;
count = 0;
}

// Implements the push operation
void push(int x) {
    LinkedNode newNode = new LinkedNode(x);
    newNode.next = front;
    front = newNode;
    count++;
}

// Implements the pop operation
int pop() {
int x = front.x;
front = front.next;
count--;
return x;
}

// Implements the peek operation
int peek() {
return front.x;
}

// Implements the isEmpty operation
boolean isEmpty() {
return front==null;
}

// Implements the size operation
int size() {
return count;
}

// This method returns a String containing
// a space separated representation of the underlying linked list
public String toString() {
String str = "";

LinkedNode cur = front;
while (cur!=null) {
   str += cur.x + " ";
   cur = cur.next;
}

return str;
}
void removeBottomHlf(){

   LinkedNode cur = front;
   int size = count;
  
   while (size > (count/2+1)){
       cur = cur.next;
       size--;
   }
   cur.next = null;
  
}
}

public class DemoTest3{
   public static void main(String[] args){
        LinkedStack st = new LinkedStack();
        for (int i = 0; i<10; i++)
            st.push(i);
        st.removeBottomHlf();
        System.out.println(st.toString());
        
   }

}