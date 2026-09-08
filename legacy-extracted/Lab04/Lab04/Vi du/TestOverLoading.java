public class TestOverLoading{
    public static int foo(int a, int b){
        return a+b;
    }

    public static int foo(int a, int b, int c){
        return a + b + c;
    }

    public static float foo(float a, float b){
        return a+b;
    }

    public static float foo(float a, float b, float c){
        return a+b+c;
    }


    public static void main(String [] args){
        System.out.println(foo(5, 6));
        System.out.println(foo(5,6,7));
        System.out.println(foo(5.0f, 6.0f));
        System.out.println(foo(5.0f, 6.0f, 7.0f));
    }
}