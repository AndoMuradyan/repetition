package example;

public class ArraysLab {
    public static void main(String[] args) {
//        xndirner
// 1)   tpel 1 ic 15 tvery
        for (int i = 1; i <= 15; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("1)<--------------------------------------------->");

// 2)   tpel  -10 ic 20 ynkac zuyg elementnery
        for (int i = -10; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        System.out.println("2)<--------------------------------------------->");

//        ekrort lucum -10 ic 20 ynkac tveri zuygery
        for (int i = -10; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("3)<--------------------------------------------->");

// 3)   tpel *-nerov hetevyal patkery
//        *
//        * *
//        * * *
//        * * * *
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("4)<--------------------------------------------->");

// 4)        tpel *-nerov hetevyal patkery
//        * * * *
//        * * *
//        * *
//        *
        int x = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("5)<--------------------------------------------->");
// 5)  tpel -10 ic 10 yngac zuyg tvery array ov

        int[] array = new int[11];
        for (int i = 0, j = -10; i < array.length; i++, j += 2) {
            array[i] = j;

        }
        for (int i : array) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("6)<--------------------------------------------->");
// 6)   trvace masiv petke tpenq kent tvery
        int[] array1 = {4, 0, 5, 87, 9, 4, 1, 2, 3, 56, 4};
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 != 0) {
                System.out.print(array1[i] + " ");
            }
        }

        System.out.println();
        System.out.println("7)<--------------------------------------------->");
// 7)    tpel masivi meji  ayn elementnery voronq ynkac en -10 ic 5 yngac hatvacum
        int[] array2 = {4, 0, 5, 87, 9, 4, 1, 2, 3, 56, 4};
        for (int a : array2) {
            if (a >= -10 && a <= 5) {
                System.out.print(a + " ");
            }
        }

        System.out.println();
        System.out.println("8)<--------------------------------------------->");
// 8)    tpel masivi meji  ayn elementnery voronq bajanvum en 3 i ev 4 i
        int[] array3 = {4, 0, 5, 87, 9, 4, 1, 2, 3, 56, 4};
        for (int a : array3) {
            if (a % 3 == 0 || a % 4 == 0) {
                System.out.print(a + " ");
            }
        }

        System.out.println();
        System.out.println("9)<--------------------------------------------->");
// 9)    tpel masivi mej qani hat zuyg tiv ka
        int[] array4 = {4, 0, 5, 87, 9, 4, 1, 2, 3, 56, 4};
        int count = 0;
        for (int i = 0; i < array4.length; i++) {
            if (array4[i] % 2 == 0) {
                count++;
            }
        }
        System.out.print(count + " ");

        System.out.println();
        System.out.println("10)<--------------------------------------------->");
// 10)    tpel masivi meji bolor elementneri gumary
        int[] array5 = {4, 1, 9, -4, 0, 3};
        int sum = 0;
        for (int i = 0; i < array5.length; i++) {
            sum = sum + array5[i];
        }
        System.out.println(sum);

        System.out.println();
        System.out.println("11)<--------------------------------------------->");
// 11)    tpel masivi meji ayn elementneri gumary voronq drakan en
        int[] array6 = {4, 1, 9, -4, 0, 3};
        int sum1 = 0;
        for (int i = 0; i < array6.length; i++) {
            if (array6[i] > 0) {
                sum1 += array6[i];
            }
        }
        System.out.println(sum1);

        System.out.println();
        System.out.println("12)<--------------------------------------------->");
// 12)    masivi meji elementnery bazmapatkel irar
        int[] array7 = {4, 1, 9, -4, 3};
        int sum2 = array7[0];
        for (int i = 1; i < array7.length; i++) {
            sum2 = sum2 * array7[i];
        }
        System.out.println(sum2);

        System.out.println();
        System.out.println("13)<--------------------------------------------->");
// 13)    gtnel masivi meji amenamec arjeqy
        int[] array8 = {4, 1, 9, -4, 3};
        int max = array8[0];
        for (int i = 0; i < array8.length; i++) {
            if (array8[i] > max) {
                max = array8[i];
            }
        }
        System.out.println(max);

        System.out.println();
        System.out.println("14)<--------------------------------------------->");
// 14)    gtnel masivi meji amenapoqr arjeqy
        int[] array9 = {4, 1, 9, -4, 3};
        int min = array8[0];
        for (int i = 0; i < array9.length; i++) {
            if (array9[i] < min) {
                min = array9[i];
            }
        }
        System.out.println(min);

        System.out.println();
        System.out.println("15)<--------------------------------------------->");
// 15)    gtnel masivi meji ayn elementy vory irar zuygy chuni {4, 2, 1, 9, 2, 1, 4}; 9 tivy chuni ira zuygy
        int[] array10 = {4, 2, 1, 9, 2, 1, 4};
        int result = array10[0];
        for (int i = 1; i < array10.length; i++) {
            result = result ^ array10[i];
        }
        System.out.println(result);

        System.out.println();
        System.out.println("16)<--------------------------------------------->");
// 16)    masivi elementnery dasavorel ajman karkov bubble sortov
        int[] array11 = {4, 10, -9, 2, 11, 0, -748, 12, 1, 445};
        for (int j = 0; j < array11.length; j++) {
            for (int i = 0; i < array11.length - 1; i++) {
                if (array11[i] > array11[i + 1]) {
                    int number = array11[i];
                    array11[i] = array11[i + 1];
                    array11[i + 1] = number;
                }
            }

        }
        for (int i : array11) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("17)<--------------------------------------------->");
// 17)    masivi elementnery dasavorel nvazman karkov bubble sortov
        int[] array12 = {4, 10, -9, 2, 11, 0, -748, 12, 1, 445};
        for (int j = 0; j < array12.length; j++) {
            for (int i = 0; i < array12.length - 1; i++) {
                if (array12[i] < array12[i + 1]) {
                    int number = array12[i];
                    array12[i] = array12[i + 1];
                    array12[i + 1] = number;
                }
            }

        }
        for (int i : array12) {
            System.out.print(i + " ");
        }
    }
}
