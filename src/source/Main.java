package source;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Collection test= new Collection();
        test.add("123");
        test.add("181");
        test.add("191");
        test.add("121");
        test.add("161");
        test.add("128");
        test.add("111");
        test.add("191");
        test.add("171");
        test.add("123");

test.display();
        System.out.println(test.getSize());
test.delete("123");

test.display();
        System.out.println(test.getSize());
    }
}
