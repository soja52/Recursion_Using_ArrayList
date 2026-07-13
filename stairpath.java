public class stairpath {

    static void printStairPaths(int n, String path) {

        // Base case: reached the destination
        if (n == 0) {
            System.out.println(path);
            return;
        }

        // Invalid path
        if (n < 0) {
            return;
        }

        // Take 1 step
        printStairPaths(n - 1, path + "1");

        // Take 2 steps
        printStairPaths(n - 2, path + "2");

        // Take 3 steps
        printStairPaths(n - 3, path + "3");
    }

    public static void main(String[] args) {
        int n = 3;
        printStairPaths(n, "");
    }
}