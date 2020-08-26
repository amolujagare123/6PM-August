package MethodsReturning;

public class Sample {

    // return type :

    void display()
    {
        // void means nothing - it doesnot return anything

        System.out.println("this is display");
    }

    int somemethod()
    {
        // if you have return type other than void
        // it can be a data type , string, date , array (single / 2d)
        int a = 45;

        return a; // return 78;
    }


    public static void main(String[] args) {

        Sample ob = new Sample();

        ob.somemethod();
        // the method which retuns some value ,
        // actually hold the same value

        int x = 10;

        System.out.println(x);

        System.out.println(ob.somemethod());

        int y =ob.somemethod();

        System.out.println(y);


    }

}
