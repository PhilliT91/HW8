package source;

public class Collection {
   private String[] arr;

    int capacity;
    int size=0;
Collection() {
    capacity = 20;
    arr = new String[capacity];
}

    Collection(int capacity){
        this.capacity=capacity;
        arr=new String[capacity];
    }
    public int getSize(){
    int i=0;
    for(;i<capacity;i++){
        if(arr[i]!=null){
            continue;
        }

        return i;
    }

return capacity;
    }


    void add(String str){
    if(size==capacity-1){
        capacity+=20;
        String[] temp=new String[capacity];
        for(int i=0;i<capacity;i++){
            temp[i]=arr[i];

        }


    }

    arr[size]=str;
size++;

    }

    void delete(String str){
        for(int i=0;i<size;i++){
            if(arr[i]==str){
                for(int j=i;j<size-1;j++){
                    arr[j]=arr[j+1];
                }
                arr[size-1]=null;
                size--;
            }
        }

    }
String get(int index){
        return arr[index];


}



    void display(){
        for(int i=0;i<size;i++) {
            System.out.print(this.get(i) + ", ");
        }
        System.out.println("");


    }





}











