public class RectangleRunner {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(10, 20);
        int area = rect1.calculateArea();
        System.out.println("This rectangle has an area of " + area + " and a volume of " + rect1.calculateBoxVolume(25));
    }
}
