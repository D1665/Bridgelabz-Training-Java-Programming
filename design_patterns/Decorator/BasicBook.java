package design_patterns.Decorator;

class BasicBook implements Book {

    @Override
    public String getDescription() {
        return "Basic Book";
    }

    @Override
    public int getPrice() {
        return 100;
    }
}
