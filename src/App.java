import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Init");
        Square s = new Square(3, "black");
        printSquare(s);

        System.out.println("Rotate to 45");
        s.rotate(45);
        printSquare(s);

        System.out.println("Grow to 3");
        s.grow(3);
        printSquare(s);

        System.out.println("Shrink to 3");
        s.shrink(3);
        printSquare(s);
        
    }

    public static void printSquare(Square s)
    {
        int[][] a = {
                    {s.getA().getA().getX(), s.getA().getA().getY()},
                    {s.getA().getB().getX(), s.getA().getB().getY()},
        };
        int[][] b = {
            {s.getB().getA().getX(), s.getB().getA().getY()},
            {s.getB().getB().getX(), s.getB().getB().getY()},
        };
        int[][] c = {
            {s.getC().getA().getX(), s.getC().getA().getY()},
            {s.getC().getB().getX(), s.getC().getB().getY()},
        };
        int[][] d = {
            {s.getD().getA().getX(), s.getD().getA().getY()},
            {s.getD().getB().getX(), s.getD().getB().getY()},
        };

        printCords("A", a);
        printCords("B", b);
        printCords("C", c);
        printCords("D", d);
    
    }
    public static void printCords(String letter, int[][] cords)
    {
        System.out.println(letter+" : "+Arrays.toString(cords[0])+Arrays.toString(cords[1]));
    }
}
