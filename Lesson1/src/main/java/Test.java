public class Test {
    public static void main(String[] args) {
        int count = 0;
        for (String arg : args) {
            int parseInt = Integer.parseInt(arg);
            if (parseInt > 0) {
                count = count + 1;
            }
        }
        System.out.println("Kolichestvo polozitelnih chisel = " + count);
    }
}