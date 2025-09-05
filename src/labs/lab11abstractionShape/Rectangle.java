package labs.lab11abstractionShape;

public class Rectangle extends Shape{
    private float width, height;

    Rectangle(float w, float h){
        this.width = w;
        this.height = h;
    }

    @Override
    public float calculateArea() {
        return width * height;
    }

    @Override
    public float calculatePerimeter() {
        return width*2 + height*2;
    }

    @Override
    public void draw() {
        System.out.printf("Drawing a Rectangle with width = %.2f and height = %.2f...\n", width, height);

    }

    @Override
    public String lineColor(String color) {
        return color;
    }
}
