public class GCDemo {

    protected void finalize() {
        System.out.println("Garbage collected");
    }

    public static void main(String[] args) {
        GCDemo obj1 = new GCDemo();
        obj1 = null;

        System.gc();
        System.out.println("End of main");
    }
}
