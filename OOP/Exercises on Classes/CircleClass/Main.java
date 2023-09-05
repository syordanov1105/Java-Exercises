public class Main {
    public static void main(String[] args) {

        Circle circle1 = new Circle();
        System.out.println("The circle has radius of " + circle1.getRadius() + " and area of " + circle1.getArea());

        Circle circle2 = new Circle(2.5);
        System.out.println("The circle has radius of " + circle2.getRadius() + " and area of " + circle2.getArea());

        Circle circle3 = new Circle();
        circle3.setRadius(6);
        System.out.println("radius is: " + circle3.getRadius());
        circle3.setColor("blue");
        System.out.println("radius is: " + circle3.getColor());

        Circle circle4 = new Circle(4.5, "yellow");
        System.out.println(circle4.toString());
        System.out.println(circle4);
        System.out.println("toString() invoked by '+' :" + circle4);
    }
}