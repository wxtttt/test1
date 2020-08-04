package cn.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HelloWorld {

    public static <T> void out(T... args) {
        for (T t : args) {
            System.out.println(t);
        }
    }

    public static <T> void printArray(T[] inputArray){
        for(T t : inputArray){
            System.out.printf("%s", t);
        }
        System.out.println();
    }

    public static void main(String[] args){
        out(19, "asdf");
//        System.out.println(4<<1);
//        Scanner input = new Scanner(System.in);
//        String s = input.nextLine();
//        input.close();
//        Arrays.sort(intarray, 2, 6);\
        char intarray[]  = {'a','d','g','c','b'};
        Arrays.sort(intarray);
        System.out.println("Arrays.toString(intarray) = " + Arrays.toString(intarray));
        System.out.println("Arrays.binarySearch(intarray, 'c') = " + Arrays.binarySearch(intarray, 'c'));
        for(char i : intarray){
            System.out.print(i);
        }
        char [] e = {'a', 'b', 'c', 'd', 'g'};
        System.out.println("Arrays.equals(intarray, e) = " + Arrays.equals(intarray, e));
        Arrays.fill(e, 'c');
        System.out.println("Arrays.toString(e) = " + Arrays.toString(e));
        Arrays.fill(e, 0, 3, 'a');
        System.out.println("Arrays.toString(e) = " + Arrays.toString(e));
        List<String> stooges = Arrays.asList("larry","moe","curly");
        System.out.println("stooges = " + stooges);
        char copy1[] = Arrays.copyOf(e, 3);
        System.out.println("Arrays.toString(copy1) = " + Arrays.toString(copy1));
        char copy2[] = Arrays.copyOfRange(e, 1, 10);
        System.out.println("Arrays.toString(copy2) = " + Arrays.toString(copy2));
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(456);

    }
    

}
