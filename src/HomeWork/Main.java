package HomeWork;

import com.sun.source.doctree.SeeTree;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String []args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(0,1,2));


        System.out.println("set1: "+set1);
        System.out.println("set2: "+set2);

        Set<Integer> notInSet1 = new HashSet<>(set2);
        notInSet1.removeAll(set1);
        Set<Integer> notInSet2 = new HashSet<>(set1);
        notInSet2.removeAll(set2);
        notInSet1.addAll(notInSet2);
        System.out.println("-----Symmetric difference-----");
        System.out.println(notInSet1);


    }
}
