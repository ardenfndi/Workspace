/**
 * LinkekdList
 */
public class LinkekdList {
    private Node head;
    private int size;

    public LinkekdList() {
        head = null;
        size = 0;
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(newNode);
        }
        size++;
    }

    public void add(int data, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        Node newNode = new Node(data);
        if (index == 0) {
            newNode.setNext(head);
            head = newNode;
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.getNext();
            }
            newNode.setNext(temp.getNext());
            temp.setNext(newNode);
        }
        size++;
    }

    public int get(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.getNext();
        }
        return temp.getData();
    }

    public int remove(int index){
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException("Index is out of bounds.");
        }
        if(index == 0){
            int data = head.getData();
            head = head.getNext();
            size--;
            return data;
        } else {
            Node temp = head;
            for(int i = 0; i < index - 1; i++){
                temp = temp.getNext();
            }
            int data = temp.getNext().getData();
            temp.setNext(temp.getNext().getNext());
            size--;
            return data;
        }
           
    }

    public boolean removeData(int data) {
        if (head.getData() == data) {
            head = head.getNext();
            size--;
            return true;
        }

        Node temp = head;
        while (temp.getNext() != null && temp.getNext().getData() != data) {
            temp = temp.getNext();
        }
        if (temp.getNext() != null) {
            temp.setNext(temp.getNext().getNext());
            size--;
            return true;
        }
        return false;
    }


    public int set(int index, int data){
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }
        Node temp = head;
        for(int i = 0; i < index - 1; i++){
            temp = temp.getNext();
        }
        int oldData =  temp.getNext().getData();
        temp.getNext().setData(data);
        
        return oldData;
    }

    public boolean contains(int data){
        Node current = head;
        while(current != null){
            if(current.getData() == data){
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    public void clear(){
        head = null;
        size = 0;
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public String toString(){
        String result = "";
        Node temp = head;
        while(temp != null){
            result += temp.getData() + " -> ";
            temp = temp.getNext();
        }
        result += "NULL";
        return result;
    }
}