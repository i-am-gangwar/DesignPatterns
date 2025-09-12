package behavioral.observerPattern.withObserver;


class TVDisplay implements Observer {
    @Override
    public void update(int temperature) {
        System.out.println("TV Display: Current Temp = " + temperature);
    }
}