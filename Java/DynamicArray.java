public class DynamicArray {
    int size;
    int capacity = 10; //default capacity
    Object[] array; //declare without instantiating 

    //Overload constructors
    public DynamicArray(){
        this.array = new Object[capacity];
    }
    
    public DynamicArray(int capacity){ //if user wants to pass their own capacity
        this.capacity = capacity;
        this.array = new Object[capacity];
    }

    public Object get(int index) {
        return array[index];
    }
    
    public void add(Object data){
        if(size >= capacity){ //first check if we are out or at capacity 
            grow();
        } 
        array[size] = data;
        size++;
    }

    public void insert(int index, Object data){
        if(size >= capacity){
            grow();
        }
        for(int i = size; i > index; i--){ //shift all elements to the right to make room to the insertion 
            array[i] = array [i - 1];
        }
        array[index] = data;
        size++;
    }

    public void delete(Object data){
        for(int i = 0; i < size; i++){
            if(array[i] == data){ //then shift the elements to the left 
                for(int j = 0; j < (size - i - 1); j++){
                    array[i+j] = array[i+j+1];
                }
                array[size - 1] = null;
                size --;
                if(size <= (int)(capacity/3)){
                    shrink();
                }
                break;
            }
        }
    }

    public int search(Object data){
        for(int i = 0; i < size ; i++){
            if(array[i]==data){
                return i;
            }
        }
        return -1;
    }
    
    public void grow(){
        int newCapacity = (int)(capacity * 2);
        Object[] newArray = new Object[newCapacity];

        for(int i = 0; i< size; i++){
            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;
    }

    public void shrink(){
        int newCapacity = (int)(capacity / 2);
        Object[] newArray = new Object[newCapacity];

        for(int i = 0; i< size; i++){
            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;
    }
   
    public boolean isEmpty(){
        return size == 0;
    }

    public String toString(){
        String string = "";
        for(int i = 0; i < capacity; i++){ //we are displaying full capacity 
            string += array[i] + ", ";
        }
        if(string!= ""){
            string = "[" + string.substring(0,string.length() - 2) +"]";
        }
        else {
            string = "[]";
        }
        return string;
    }
}
