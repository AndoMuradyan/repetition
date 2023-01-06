package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {

        List<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a = new ArrayList<>();
        a.add(4);
        a.add(6);
        a.add(47);
        a.add(5);
        a.add(8);
        a.add(455);
        System.out.println(a);
        System.out.println("----------------------");
        a.add(0, 7);
        System.out.println(a);
        System.out.println("----------------------");
        a.remove(0);
        System.out.println(a);
        System.out.println("----------------------");
        a.remove(Integer.valueOf(45));
        System.out.println(a);
        System.out.println("----------------------");
        a.set(1, -7);
        System.out.println(a);
        System.out.println("----------------------");
        System.out.println(a.indexOf(47));
        System.out.println("----------------------");
        System.out.println(a.size());
        System.out.println("----------------------");
//        array ogtagorcelu depkum  petke taynq // // //
//        ArrayList ogtagorcelu depkum kunenanq bazmatip metodner
        for (int i = 0; i < a.size(); i++) { //a.length
            if (a.get(i) % 2 == 0) { //a[i]
                System.out.print(a.get(i) + " ");//a[i]
            }

        }
        System.out.println("----------------------");
        System.out.println(a.contains(4));
        System.out.println("----------------------");
        System.out.println("Arrays.asList");
        System.out.println("----------------------");
        List<String> s = new ArrayList<>(Arrays.asList("trt", "s"));
        System.out.println(s);
        System.out.println("----------------------");
        ArrayList<Integer> ab = new ArrayList<>() {
            {
        add(1);
        add(4);
        add(5);
            }
        };
        System.out.println(ab);
        System.out.println("----------------------");
        List<Integer> n= new ArrayList<>(Collections.nCopies(10,1));
        List<Integer> n2= new ArrayList<>(Collections.nCopies(5,2));
        n.addAll(n2);//addAll - ov menq kpcnum enq irar ays erkusy
        System.out.println(n);
        System.out.println("----------------------");
        System.out.println(a);
        System.out.println("----------------------");
        Collections.sort(a);
        System.out.println(a);
    }
}
