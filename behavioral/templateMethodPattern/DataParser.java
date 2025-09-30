package behavioral.templateMethodPattern;

// Abstract Class: Defines template (skeleton)
abstract class DataParser {
    // Template method (final → can’t be overridden)
    public final void parse() {
        readFile();
        parseData();
        processData();
    }

    // Common steps
    private void readFile() {
        System.out.println("Reading file...");
    }

    private void processData() {
        System.out.println("Processing data...");
    }

    // Step to be customized by subclasses
    protected abstract void parseData();
}