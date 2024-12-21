//MinStack using Linked List
/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
class Node
{
    int data;
    Node next;
    public Node(int data)
    {
        this.data = data;
        next = null;
    }
}
class MinStack
{
    public Node head;
    public MinStack()
    {
        head = null;
    }
    public void push(int val)
    {
        Node newNode = new Node(val);
        if(head == null)
            head = newNode;
        else
        {
            newNode.next = head;
            head = newNode;
        }
    }
    public void pop()
    {
        if(head == null)
            return;
        head = head.next;
    }
    public int top()
    {
        if(head == null)
            return -1;
        return head.data;
    }
    public int getMin()
    {
        if (head == null)
            return -1;
        Node temp = head;
        int min = temp.data;
        while(temp != null)
        {
            if(temp.data < min)
                min = temp.data;
            temp = temp.next;
        }
        return min;
    }
}