import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleCaculatorTest {
    @Test
    public void testTriangleWithEdgeAIsZero() {
        int a = 0;
        int b = 3;
        int c = 4;
        String exprected = "Gia tri dau vao khong thoa man";
        String actual = TriangleCaculator.checkTriangle(a, b, c);
        assert exprected.equals(actual);
    }

    @Test
    public void testTriangleWithEdgeBIsZero() {
        int a = 1;
        int b = 0;
        int c = 4;
        String exprected = "Gia tri dau vao khong thoa man";
        String actual = TriangleCaculator.checkTriangle(a, b, c);
        assert exprected.equals(actual);
    }

    @Test
    public void testTriangleWithEdgeCIsZero() {
        int a = 2;
        int b = 3;
        int c = 0;
        String exprected = "Gia tri dau vao khong thoa man";
        String actual = TriangleCaculator.checkTriangle(a, b, c);
        assert exprected.equals(actual);
    }

    @Test
    public void testNoteIsTriangleA() {
        int a = 1;
        int b = 2;
        int c = 3;
        String exprected = "Khong phai la tam giac";
        String actual = TriangleCaculator.checkTriangle(a, b, c);
        assert exprected.equals(actual);
    }

    @Test
    public void testNoteIsTriangleB() {
        int a = 2;
        int b = 1;
        int c = 3;
        String exprected = "Khong phai la tam giac";
        String actual = TriangleCaculator.checkTriangle(a, b, c);
        assert exprected.equals(actual);
    }

    @Test
    public void testNoteIsTriangleC() {
        int a = 3;
        int b = 2;
        int c = 1;
        String exprected = "Khong phai la tam giac";
        String actual = TriangleCaculator.checkTriangle(a, b, c);
        assert exprected.equals(actual);
    }

    @Test
    public void testIsoscelesTriangleA() {
        int a = 3;
        int b = 2;
        int c = 2;
        String exprected = "La tam giac can";
        String actual = TriangleCaculator.checkTriangle(a, b, c);
        assert exprected.equals(actual);
    }

    @Test
    public void testIsoscelesTriangleB() {
        int a = 2;
        int b = 1;
        int c = 2;
        String exprected = "La tam giac can";
        String actual = TriangleCaculator.checkTriangle(a, b, c);
        assert exprected.equals(actual);
    }

    @Test
    public void testIsoscelesTriangleC() {
        int a = 2;
        int b = 4;
        int c = 2;
        String exprected = "La tam giac can";
        String actual = TriangleCaculator.checkTriangle(a, b, c);
        assert exprected.equals(actual);
    }

    @Test
    public void testEquilateralTriangle() {
        int a = 4;
        int b = 4;
        int c = 4;
        String exprected = "la tam giac deu";
        String actual = TriangleCaculator.checkTriangle(a, b, c);
        assert exprected.equals(actual);
    }
}