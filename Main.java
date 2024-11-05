public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 20);
        System.out.println("Initial Rectangle: " + rectangle);

        rectangle.resizeWidth(30);
        rectangle.resizeHeight(40);
        System.out.println("Resized Rectangle: " + rectangle);
    }
}
