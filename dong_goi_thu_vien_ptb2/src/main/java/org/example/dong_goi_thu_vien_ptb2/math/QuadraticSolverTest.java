package org.example.dong_goi_thu_vien_ptb2.math;

import org.testng.annotations.Test;
import static org.junit.Assert.*;

public class QuadraticSolverTest {

    @Test
    public void testTwoRoots() {
        QuadraticSolver.Result result = QuadraticSolver.solve(1, -3, 2);
        assertEquals("Phương trình có hai nghiệm phân biệt", result.message);
        assertEquals(2.0, result.x1, 0.001);
        assertEquals(1.0, result.x2, 0.001);
    }

    @Test
    public void testOneRoot() {
        QuadraticSolver.Result result = QuadraticSolver.solve(1, 2, 1);
        assertEquals("Phương trình có nghiệm kép", result.message);
        assertEquals(-1.0, result.x1, 0.001);
        assertEquals(-1.0, result.x2, 0.001);
    }

    @Test
    public void testNoRoot() {
        QuadraticSolver.Result result = QuadraticSolver.solve(1, 0, 1);
        assertEquals("Phương trình vô nghiệm", result.message);
    }

    @Test
    public void testNotQuadratic() {
        QuadraticSolver.Result result = QuadraticSolver.solve(0, 2, 1);
        assertEquals("Không phải phương trình bậc hai", result.message);
    }
}
