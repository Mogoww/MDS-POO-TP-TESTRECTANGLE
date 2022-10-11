public class Test {
    // this class is used to test the Rectangle class
    public static void main(String[] args) {
        Rectangle box = new Rectangle(5, 10, 20, 30);
        // Déplacer le rectangle
        box.translate(15, 25);
        // Afficher les informations concernant le rectangle
        System.out.print("x: ");
        System.out.println(box.getX());
        System.out.println("Expected: 20");
        System.out.print("y: ");
        System.out.println(box.getY());
        System.out.println("Expected: 35");


    }
}
