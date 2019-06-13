public class Functions {

    public int fib(int x) {
        if( x>20)
        {
            return -99;
        }
        if (x < 0) {
            return -1;
        }
        if (x == 0) {
            return 0;
        }
        if (x == 1) {
            return 1;

        }
        return fib(x - 1) + fib(x - 2);
    }

    public int sil(int x) {
        if( x>20)
        {
            return -99;
        }
        if (x < 0) {
            return -1;
        }
        if (x == 0) {
            return -1;
        }
        if (x == 1) {
            return 1;
        }
        return x * sil(x - 1);
    }

    public static void main(String[] args) {
        Functions f = new Functions();
        System.out.println();
        System.out.println(String.valueOf(f.sil(3)));
        System.out.println(String.valueOf(f.fib(10)));
    }
}
