package behavioral.observerPattern.withObserver;

// 4. Concrete Observers
class PhoneDisplay implements Observer {
    @Override
    public void update(int temperature) {
        System.out.println("Phone Display: Current Temp = " + temperature);
    }
}
