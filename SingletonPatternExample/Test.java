public class Test {
    public static void main(String[] args) {
        Logger log1=Logger.getLogger();
        Logger log2=Logger.getLogger();
        System.out.println(log1.hashCode());
        System.out.println(log2.hashCode());
    }
}
