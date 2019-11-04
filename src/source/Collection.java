package source;

public class Collection {
    private String[] arr;

    int capacity;
    private int size = 0;

    Collection() {
        capacity = 20;
        arr = new String[capacity];
    }

    Collection(int capacity) {
        this.capacity = capacity;
        arr = new String[capacity];
    }

    public int getSize() {
        int i = 0;
        for (; i < capacity; i++) {
            if (arr[i] != null) {
                continue;
            }

            return i;
        }

        return capacity;
    }


    void add(String str) {
        if (size == capacity - 1) {
            capacity += 20;
            String[] temp = new String[capacity];
            for (int i = 0; i < capacity; i++) {
                temp[i] = arr[i];

            }


        }

        arr[size] = str;
        size++;

    }

    void delete(String str) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == str) {
                for (int j = i; j < size - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[size - 1] = null;
                size--;
            }
        }

    }

    String get(int index) {
        return arr[index];


    }

    boolean contains(String str) {
        for (int i = 0; i < size; i++) {
            if (arr[i].equals(str)) {
                return true;
            }
        }

        return false;

    }


    void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println("");


    }

    boolean equals(Collection eColl) {
        int counter = 0;
        if (this.size > eColl.size) {
            counter = this.size;
        } else {
            counter = eColl.size;
        }


        if (this == eColl) {
            return true;
        } else {

            for (int i = 0; i < counter; i++) {
                if (this.arr[i].equals(eColl.arr[i]) == false) {
                    return false;
                }
            }
            return true;


        }

    }

    void clear(){
        for(int i=0;i<size;i++)
        {
            this.arr[i]=null;
        }
        size=0;
    }

    int indexOf(String str){
        for(int i=0; i<size;i++){
            if (arr[i].equals(str)) {
                return i;
            }
            }
        System.out.println("no matches");
        return -1;

        }



    }














