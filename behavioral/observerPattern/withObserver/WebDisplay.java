package behavioral.observerPattern.withObserver;

class WebDisplay implements Observer {
    @Override
    public void update(int temperature) {
        System.out.println("Web Display: Current Temp = " + temperature);
    }
}
