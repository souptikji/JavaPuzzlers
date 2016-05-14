public class 80-Outer {
    public static void main(String[] args) throws Exception {
        new 80-Outer().greetWorld();
    }

    private void greetWorld() throws Exception {
        System.out.println(Inner.class.newInstance());
    }

    public class Inner {
        public String toString() {
            return "Hello world";
        }
    }
}
