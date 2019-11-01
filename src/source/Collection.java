package source;

public class Collection {
    String[] arr;

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

        }
        break;
    }
    return i;

    }


    void add(String str){
    if(this.getSize()==capacity-1){
        capacity+=20;
        String[] temp=new String[capacity];
        for(int i=0;i<capacity;i++){
            temp[i]=arr[i];

        }

        arr=temp;
    }
arr[thi]



    }



}











