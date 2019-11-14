package source;

import static java.lang.System.currentTimeMillis;

public class Main {

    public static void main(String[] args) {
        Collection test1 = new Collection();
        Collection test2 = new Collection();
        long start;
        long finish;



        start = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            test1.add("tik-tak");
        }
        finish = System.nanoTime();
        System.out.println("test 60% 100 elements: " + (finish - start));
        test1.clear();
        test1.trim();
        System.out.println();

        start = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            test1.add("tik-tak");
        }
        finish = System.nanoTime();
        System.out.println("test 60% 1000 elements: " + (finish - start));
        test1.clear();
        test1.trim();
        System.out.println();





        start = System.nanoTime();
        for (int i = 0; i < 100; i++) {
            test2.addByOne("tik-tak");
        }
        finish = System.nanoTime();
        System.out.println("test by one 100 elements: " + (finish - start));
        test2.clear();
        test2.trim();
        System.out.println();





        start = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            test2.addByOne("tik-tak");
        }
        finish = System.nanoTime();
        System.out.println("test by one 1000 elements: " + (finish - start));
        test2.clear();
        test2.trim();
        System.out.println();

        start = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            test1.add("tik-tak");
        }
        finish = System.nanoTime();
        System.out.println("test 60% 100'000 elements: " + (finish - start));
        test1.clear();
        test1.trim();
        System.out.println();


        start = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            test2.addByOne("tik-tak");
        }
        finish = System.nanoTime();
        System.out.println("test by one 100'000 elements: " + (finish - start));
        test2.clear();
        test2.trim();
        System.out.println();

        start = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            test1.add("tik-tak");
        }
        finish = System.nanoTime();
        System.out.println("test 60% 1'000'000 elements: " + (finish - start));
        test1.clear();
        test1.trim();
        System.out.println();


        start = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            test2.addByOne("tik-tak");
        }
        finish = System.nanoTime();
        System.out.println("test by one 1'000'000 elements: " + (finish - start));
        test2.clear();
        test2.trim();
        System.out.println();

    }

}
