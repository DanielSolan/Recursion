public class Main {

    public static void main(String[] args) {


        System.out.println(fibbonaci(5));
    }

    public static int fibbonaci(int n){
        if(n<2){
            return n;
        }

        return fibbonaci(n-1) + fibbonaci(n-2);
    }
}
