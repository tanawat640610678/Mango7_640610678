package separation_of_concerns;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 20);
        RightTriangle rightTriangle = new RightTriangle(10, 20);
        Calculate calculate = new Calculate();
        System.out.println(calculate.calculateArea(rectangle));
        System.out.println(calculate.calculateArea(rightTriangle));
        
    }
}

class Rectangle{
    double width;
    double height;
    Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
}

class RightTriangle{
    double base;
    double height;
    RightTriangle(double base, double height){
        this.base = base;
        this.height = height;
    }
}

class Calculate{
    double calculateArea(Rectangle rectangle){
        return rectangle.width * rectangle.height;
    }
    double calculateArea(RightTriangle rightTriangle){
        return rightTriangle.base * rightTriangle.height / 2;
    }
}