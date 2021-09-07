package geekbrains;

public class Triangle {
    public static double triangleArea(double a, double b, double c) {
        if(a<=0 || b<=0||c<=0||a >= (b + c) || c >= (b + a) || b >= (a + c)){
            System.out.println(TriangleType.INVALID.getType());
        }
        double p = (a + b + c)/2;
        return (Math.sqrt(p*(p-a)*(p-b)*(p-c)));
    }
    public static String determineType(int a, int b, int c) {

        if (a >= (b + c) || c >= (b + a) || b >= (a + c)) {
            return TriangleType.INVALID.getType();
        } else if (a == b && b == c) {
            return TriangleType.EQUILATERAL.getType();
        } else if (((a * a) + (b * b)) == (c * c) || ((a * a) + (c * c)) == (b * b) || ((c * c) + (b * b)) == (a * a)) {
            return TriangleType.RIGHT.getType();
        } else if (a != b && b != c && c != a) {
            return TriangleType.SCALENE.getType();
        } else if ((a == b && b != c) || (a != b && c == a) || (c == b && c != a)) {
            return TriangleType.ISOSCELES.getType();
        }

        return null;
    }

}
