package arrays;

public class ArraysLoops {
    public static void main(String[] args) {
        //int haytararum enq masiv em arjeq chenq talis uxaki
        // chap te qani hatanoc sarke tpeluc iran index ov mez
        //mez talis e 0 vorovhetev ira difolte arjeqy 0 e
        //isk ete sarkenq boolean nneri masiv mez kveradarcni false difolt arjeqn e

        int[] a = new int[5];
        System.out.println("int: " + a[1]);
        System.out.println("------------------------------");

        boolean[] b = new boolean[5];
        System.out.println("boolean: " + b[4]);
        System.out.println("------------------------------");

//        menq asypes karox enq mer masivin tal arjeqner
//        ev nayev tpeluc gumeranq irar arjeqnery oreinak c[0] + c[4]
//        isk ete tveluc tanq aynpisi masiv vory menq chunenq orinak ays depkum
//        tpeluc tanq [6] indexovy tpe menq kuneneanq exception arraysindexofbaunt
        int[] c = new int[5];
        c[0] = 4;
        c[1] = 41;
        c[2] = 1;
        c[3] = -8;
        c[4] = 8;
        System.out.println("araji u verji elementi gumary ete gitenq verji elementi indexy: " + c[0] + c[4]);
        System.out.println("------------------------------");

//        ete uzum enq imananq mer masivy qani elemenq uni karox enq tpel d.lenght
//        ev kimananq qani hatanov e mer masivy
//        ete menq uzumenq gumarel irar mer araji ev verji elementnery ev chgitenq mer masivi erkarutyuny karox enq anelel hetevyal dzev
//        d[0] + d[d.length-1]
        int[] d = new int[5];
        System.out.println("massivi qanaky: " + d.length);
        System.out.println("------------------------------");
        d[0] = 4;
        d[1] = 41;
        d[2] = 1;
        d[3] = -8;
        d[4] = 8;
        System.out.println("araji u verji elementneri gumary ete chgitenq massivi erkarutyuny: " + d[0] + d[d.length - 1]);
        System.out.println("------------------------------");

//        karoxenq ayskany grelu poxaren anenq hetevyal kerp
//        sa nuyne vonc vor ananeq naxkin dzevov orinak
//        int[] array = new int[5];
//        array[0] = 4;
//        array[1] = 41;
//        array[2] = 1;
//        array[3] = -8;
//        array[4] = 8;
        int[] array = {4, 41, 1, -8, 8};
        System.out.println(array[0]);
        System.out.println(array[array.length - 1]);
        System.out.println("------------------------------");

//      xndir` ete mer tvac elementy drakan e tox tpi Positive ete bacasakan tox tpe Non Positive ays depkum ktpe Positive
        int x = 4;
        if (x > 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Non Positive");
        }
        System.out.println("------------------------------");

//      ay kodi graci karj dezvy ogtagorcum enq ternar
//        nuyne drakani depkum ktpe 1 bacasakani depkum 0
//        int x = 4;
//        if (x > 0) {
//            System.out.println("Positive");
//        } else {
//            System.out.println("Non Positive");
//        }
//        y in veragri x>0 ete true e arjeqy ture mek hakarak depkum 0 (y = x > 0 ? 1 : 0;)
        x = x > 0 ? 1 : 0;
        System.out.println(x);
        System.out.println("------------------------------");

        x = 2;
        switch (x) {
            case 1:
                System.out.println("One");
                break; //breaki imasty nranum e vor ete gtav mer tvac arjeqy tox kagni
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default://ete chka tox default arjeqy tpe
                System.out.println("Bigger");
        }
        System.out.println("------------------------------");

//        if while ic tarbervum e nranov vor ifov grac ays kody menak ktpe arjeqy counteri
//        isk whileov inqy kvra enqan minchev hasni < nshani avartin
        int counter = 1;
        if (counter < 11) {
            System.out.println(counter + " ");
            counter++;
        }
        System.out.println("------------------------------");

        int counterI = 1;
        while (counterI < 11) {
            System.out.print(counterI + " ");
            counterI++;
        }
        System.out.println();
        System.out.println("------------------------------");

        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("------------------------------");

        String[] names = {"hayk", "annn", "valod", "poxos", "petros"};
//        menq ays arjeqnery tpelu hamar petke aneynq hetevyal kerp
//        System.out.println(names[0]);
//        System.out.println(names[1]);
//        System.out.println(names[2]);
//        System.out.println(names[3]);
//        System.out.println(names[4]);
//        bayc ka forache cikyl vori haytarareluc kunenaq es nuyn arjeqnery inch vor sout ov anntat tpeluc
//        foreachi greladzevy for (String name : names) { }
//        System.out.println(names[0]);
//        System.out.println(names[1]);
//        System.out.println(names[2]);
//        System.out.println(names[3]);
//        System.out.println(names[4]);
        System.out.println("------------------------------");

        for (String name : names) {
            System.out.print(name + " ");
        }
        System.out.println();
        System.out.println("------------------------------");

//        kareox enq nayev fori ov annenq
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " ");
        }
        System.out.println();
        System.out.println("------------------------------");

//        tpel zuygery
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("------------------------------");

//        tpel kentery
        for (int i = 0; i <= 10; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }

        }
        System.out.println();
        System.out.println("------------------------------");

        String[] name = {"hayk", "annn", "valod", "poxos", "petros"};
//        ete uzumenq tpel bolor elementnery petke anenq hetevyal dzev ev kunenanq patasxany es ardyunqy
//    ---> hayk annn valod poxos petros <---
        for (int i = 0; i < name.length; i++) {
            System.out.print(name[i] + " ");
        }
        System.out.println();
        System.out.println("------------------------------");

//        isk ete uzum enq Stringi arjeqnery hakarak tpenq petke fori in grenq hetevyal kerp ev kunenq patasxany es ardyunqy
//       -----> petros poxos valod annn <-----
        for (int i = name.length - 1; i > 0; i--) {
            System.out.print(name[i] + " ");
        }
        System.out.println();
        System.out.println("------------------------------");

//        xndir unenq masiv ev uzum enq imananq bacasakan tiv ka mer masivum ete ka tox tpe ayo ev kap chuni qani hat ka tox mek ankam tpe
//        ay depkum ete unenq mekic avel bacasakan tiv mez ognutyan e galis ayt depkum (break;) orianky hetavyalne
//        ete chdnenq (break;) ktpi 3 hat ayo
        int[] array1 = {10, 5, 2, 3, 5, -8, 7, -5, 1, -10};
        for (int element : array1) {
            if (element < 0) {
                System.out.println("Ayo");
                break;
            }
        }
        System.out.println("------------------------------");

//        unenq hetevyal xndiry uneneq 10 hat tiv ev petka tpenq 1 ic minchev 4 5 tivy bac toxnenq 6 ic minchev 10 tpeq aysinkn
//        1 2 3 4 6 7 8 9 10 piti stananq hetevyal patasxany
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.print(i + " ");

        }


    }
}
