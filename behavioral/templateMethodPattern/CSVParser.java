package behavioral.templateMethodPattern;


// Concrete classes implement only variable steps
class CSVParser extends DataParser {
    @Override
    protected void parseData() {
        System.out.println("Parsing CSV data...");
    }
}
