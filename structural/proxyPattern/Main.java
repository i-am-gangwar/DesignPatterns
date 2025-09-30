package structural.proxyPattern;

public class Main {

    public static void main(String[] arg){
        System.out.println("Proxy Design pattern");

        Image image1 = new ProxyImage("image1.jpg");
        Image image2 = new ProxyImage("image2.jpg");

        // Image not loaded yet
        System.out.println("\nFirst display of image1:");
        image1.display(); // loads + displays

        System.out.println("\nSecond display of image1:");
        image1.display(); // only displays (no load)

        System.out.println("\nFirst display of image2:");
        image2.display(); // loads + displays

        System.out.println("\nSecond display of image2:");
        image2.display(); // only displays (no load)
        System.out.println("\nThird display of image2:");
        image2.display(); // only displays (no load)

    }

}
