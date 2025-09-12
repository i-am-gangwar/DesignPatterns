package behavioral.observerPattern.withObserver;

// 2. Subject interface
interface Subject {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}

