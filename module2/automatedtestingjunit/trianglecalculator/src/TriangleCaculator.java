public class TriangleCaculator {
    public static String checkTriangle(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return "Gia tri dau vao khong thoa man";
        }
        if (a + b <= c || b + c <= b || b + c <= a) {
            return "Khong phai la tam giac";
        }
        if (a == b || a == c || b == c) {
            return "La tam giac can";
        }
        if (a == b && b==c) {
            return "la tam giac deu";
        }
        return "la tam giac";
    }
}
