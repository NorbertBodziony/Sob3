public class Test {
    Functions f1 = new Functions();
    Functions f2 = new Functions();
    Functions f3 = new Functions();

    // f2
    //f3
    public int checkFib(int x) throws Exception {
        int x1 = f1.fib(x);
        int x2 = f2.fib(x);
        int x3 = f3.fib(x);
//check all ==
        if (x1 == x2 && x2 == x3) {
            return x2;
        }
        //check x1==x2
        if (x1 == x2 && x2 != x3) {
            return x2;
        }
        //check x1==x3
        if (x1 == x3 && x2 != x3) {
            return x1;
        }
        //check x2==x3
        if (x2 == x3 && x1 != x3) {
            return x2;
        }
        throw new Exception("all values are different ");
    }

    public int checkSil(int x) throws Exception {
        int x1 = f1.sil(x);
        int x2 = f2.sil(x);
        int x3 = f3.sil(x);
        //check all ==
        if (x1 == x2 && x2 == x3) {
            return x2;
        }
        //check x1==x2
        if (x1 == x2 && x2 != x3) {
            return x2;
        }
        //check x1==x3
        if (x1 == x3 && x2 != x3) {
            return x1;
        }
        //check x2==x3
        if (x2 == x3 && x1 != x3) {
            return x2;
        }
        throw new Exception("all values are different ");
    }

    public static void main(String[] args) {
     Test test=new Test();
        try {
            System.out.println(test.checkFib(6));
        } catch (Exception e) {
            e.getMessage();
        }


    }
}
