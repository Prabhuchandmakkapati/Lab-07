public class Driver {  

public static void main(String[] args) {

ArrayStack stack = new ArrayStack(10);

System.out.println("Stack using ArrayStack");

stack.push(1);

stack.push(7);

stack.push(3);

stack.push(4);

stack.push(9);

stack.push(2);
int val;
do {
   val = stack.pop();
   if(val == -999)break;
   System.out.println(val);
  
}while(val != -999);

LinkedStack stack1 = new LinkedStack();
System.out.println("Stack using LinkedStack");
stack1.push(1);

stack1.push(7);

stack1.push(3);

stack1.push(4);

stack1.push(9);

stack1.push(2);

val = stack1.pop();

while(val != -999) {
   System.out.println(val);
   val = stack1.pop();
}

}


}

class ArrayStack {

private int[] arr;

private int n;

private int capacity;

public ArrayStack(int cap) {

capacity = cap;

n = 0;

arr = new int[cap];

}

public int size() {

return n;

}

public void push(int item) {

if(n == capacity)

System.out.println("Stack is full");

else {

arr[n] = item;

n++;

}

}

public int pop() {

int data = -999;

if(n == 0)

System.out.println("Stack is empty");

else {

data = arr[n-1];

n--;

}

return data;

}

}

class LinkedStack {

class Node {

int data;

Node next;

Node(int item) {

data = item;

}

}

private Node top;

private int n;

public LinkedStack() {

top = null;

n = 0;

}

public void push(int item) {

Node newNode = new Node(item);

newNode.next = top;

top = newNode;

n++;

}

public int size() {

return n;

}

public int pop() {

if(n == 0) {

return -999;

}

int data = top.data;

top = top.next;

n--;

return data;

}

}