public class CheckTheTriangle {

    public void checkTheTriangle(int a, int b, int c) throws IllegalTriangleException {
        if (a < 0 || b < 0 || c < 0 || !(a + b > c) || a + c < b || b + c < a) {
            throw new IllegalTriangleException("hello Kitty");
        }
    }
}
