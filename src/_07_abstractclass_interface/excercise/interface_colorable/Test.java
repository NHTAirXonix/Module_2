package _07_abstractclass_interface.excercise.interface_colorable;

public class Test {
    public static <arr> void main(String[] args) {
        Shape[] array = new Shape[2];
        array[0] = new Square(2.5);
        array[1] = new Rectangle(5.5,6.5);

        for (Shape arr : array) {
            System.out.println(arr.toString());
        }
        System.out.println("\n");
        for (Shape arr : array) {
            System.out.println(arr.toString());
            arr.howToColor();
        }
    }
}
