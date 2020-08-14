public class arrayDemo {
    public static void main(String[] args) {

        int[] a = new int[5];

        a[0] = 45;
        a[1] = 56;
        a[2] = 67;
        a[3] = 56;
        a[4] = 67;


        for(int i=0; i<a.length ;i++)
        {

            System.out.println(a[i]);
        }


        System.out.println();

        int[] b = {34,56,23,212,21,43,67,32,23};

        for(int i=0; i<b.length ;i++)
        {

            System.out.println(b[i]);
        }

// for each loop .....
        System.out.println("---using for each loop .....");
        for(int x : b)
        {
            System.out.println(x);
        }


    }

}
