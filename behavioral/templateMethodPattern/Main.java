package behavioral.templateMethodPattern;

// Client code
public class Main {
    public static void main(String[] args) {
        DataParser csv = new CSVParser();
        csv.parse();

        DataParser xml = new XMLParser();
        xml.parse();

        DataParser json = new JSONParser();
        json.parse();
    }
}