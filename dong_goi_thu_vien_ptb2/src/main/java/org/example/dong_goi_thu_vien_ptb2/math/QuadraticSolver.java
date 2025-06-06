package org.example.dong_goi_thu_vien_ptb2.math;

public class QuadraticSolver {

    public static class Result {
        public final double x1;
        public final double x2;
        public final String message;

        public Result(double x1, double x2, String message) {
            this.x1 = x1;
            this.x2 = x2;
            this.message = message;
        }
    }

    public static Result solve(double a, double b, double c) {
        if (a == 0) {
            return new Result(0, 0, "Không phải phương trình bậc hai");
        }

        double delta = b * b - 4 * a * c;
        if (delta < 0) {
            return new Result(0, 0, "Phương trình vô nghiệm");
        } else if (delta == 0) {
            double x = -b / (2 * a);
            return new Result(x, x, "Phương trình có nghiệm kép");
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new Result(x1, x2, "Phương trình có hai nghiệm phân biệt");
        }
    }
}
