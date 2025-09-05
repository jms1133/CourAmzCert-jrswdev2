package labs.lab11abstractionShape;

public class Circle extends Shape{
    private float radius;

    Circle(float r){
        this.radius = r;
    }

    @Override
    public float calculateArea() {
        return (float) Math.PI * radius * radius;
    }

    @Override
    public float calculatePerimeter() {
        return (float) (Math.PI * radius * 2);
    }

    @Override
    public void draw() {
        System.out.printf("Drawing a Circle with radius %.2f...\n", radius);

    }

    @Override
    public String lineColor(String color) {
        return color;
    }
}
