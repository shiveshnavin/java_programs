package in.hoptec;

public class InterfacesSample {
    public static void main(String[] args) {
        Test t = new TestImpl();
        t.a();
        t.c();
        Test.b();
        TestImpl.b();
        System.out.println(new TestImplChild().get());
    }
    public interface Test2 {
        static void b() {
            System.out.println("interface static b");
        }
        default void a() {
            System.out.println("interface AA 22");
        }
        private void c() {
            System.out.println("Interface cc");
        }
    }
    public interface Test {
        static void b() {
            System.out.println("interface static b");
        }
        default void a() {
            System.out.println("interface AA 11");
        }
        private void c() {
            System.out.println("Interface cc");
        }
    }
    public static class TestImpl implements Test,Test2 {
        static void b() {
            System.out.println("object b");
        }
        public void a() {
            System.out.println("object a");
        }
        private void c() {
            System.out.println("object a");
        }
        public Object get(){
            System.out.println("TestImpl get");
            return this;
        }
    }

    public static class TestImplChild extends TestImpl{
        public String get(){
            ThreadGroup tg1 = new ThreadGroup("Parent ThreadGroup");
            new Thread().interrupt();

            return super.get().getClass().toString();
        }
    }
}
