package midterm.prep;

public abstract class TestOver {
    abstract int test();
}


class TestOver2 extends TestOver {
    public static void main(String[] args) {
        TestOver2 n = new TestOver2();
        System.out.println(n.test());
    }

    @Override
    int test() {
        return 0;
    }
}