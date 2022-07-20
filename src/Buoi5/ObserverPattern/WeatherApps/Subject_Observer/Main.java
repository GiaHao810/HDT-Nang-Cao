package Buoi5.ObserverPattern.WeatherApps.Subject_Observer;

public class Main {
    public static void main(String[] args) {

        SimpleSubject simpleSubject = new SimpleSubject();

        SimpleObserver simpleObserver = new SimpleObserver(simpleSubject);

        simpleSubject.registerObsever(simpleObserver);

        simpleSubject.setValue(10);

        simpleSubject.removeObserver(simpleObserver);
    }
}
