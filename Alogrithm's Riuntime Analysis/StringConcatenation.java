public class StringConcatenation {
    public static void main(String[] args) {
        int[] sizes = {1000, 10000, 100000, 1000000};

        for (int N : sizes) {
            long start = System.nanoTime();
            String s = "";
            for (int i = 0; i < N; i++) {
                s += "a";
            }
            long stringTime = System.nanoTime() - start;

            start = System.nanoTime();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < N; i++) {
                sb.append("a");
            }
            long stringBuilderTime = System.nanoTime() - start;

            start = System.nanoTime();
            StringBuffer sbf = new StringBuffer();
            for (int i = 0; i < N; i++) {
                sbf.append("a");
            }
            long stringBufferTime = System.nanoTime() - start;

            System.out.println("Operations: " + N);
            System.out.println("String: " + stringTime / 1_000_000.0 + " ms");
            System.out.println("StringBuilder: " + stringBuilderTime / 1_000_000.0 + " ms");
            System.out.println("StringBuffer: " + stringBufferTime / 1_000_000.0 + " ms");
            System.out.println("--------------------------------------");
        }
    }
}
