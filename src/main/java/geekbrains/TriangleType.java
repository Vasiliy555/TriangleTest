package geekbrains;

public enum TriangleType {
        EQUILATERAL("Equilateral Triangle"),
        ISOSCELES("Isosceles Triangle"),
        SCALENE("Scalene Triangle"),
        INVALID("Not a Triangle"),
        RIGHT("Right Triangle");

private String type;

    TriangleType(String type) {
        this.type = type;
    }
    public String getType(){
        return type;
    }
}
