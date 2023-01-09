package lesson;

public class Lesson1 {
    public static void main(String[] args) {
        int[] a = new int[6];
        System.out.println(a[4]);
        a[0] = 4;
        a[1] = 74;
        a[2] = 0;
        a[3] = -7;
        a[4] = 1;
        a[5] = 1;
        System.out.println("----------------------------------");
        System.out.println(a[0] + a[4]);
        System.out.println("----------------------------------");
        System.out.println(a.length);
        System.out.println("----------------------------------");
        System.out.println(a[0] + a[a.length - 1]);
        System.out.println("----------------------------------");
        int[] array = {4, 1, -8, 0, 3, 4, 6};
        System.out.println(array[0]);
        System.out.println(array[array.length - 1]);
        System.out.println("----------------------------------");
        int x = 4;
        if (x > 0) {
            System.out.println("Positive");
        } else
            System.out.println("Non Positive");
        System.out.println("----------------------------------");
        int b = -4;
        int k;
        k = b > 0 ? 1 : 0;
        System.out.println(k);
        System.out.println("----------------------------------");

    }
}
