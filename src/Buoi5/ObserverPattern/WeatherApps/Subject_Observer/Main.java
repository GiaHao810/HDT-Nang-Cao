package Buoi5.ObserverPattern.WeatherApps.Subject_Observer;

public class Main {
    public static void main(String[] args) {
        SimpleSubject simpleSubject = new SimpleSubject();

        SimpleObserver simpleObserver = new SimpleObserver(simpleSubject);

        System.out.println("Lan 01");
        simpleSubject.setValue(10);
        simpleSubject.removeObserver(simpleObserver);

        System.out.println("Lan 02");
        SimpleObserver simpleObserver_1 = new SimpleObserver(simpleSubject);
        simpleSubject.setValue(20);
        simpleSubject.removeObserver(simpleObserver_1);

        System.out.println("Lan 03");
        SimpleObserver simpleObserver_2 = new SimpleObserver(simpleSubject);
        simpleSubject.setValue(30);
        simpleSubject.removeObserver(simpleObserver_2);
    }
}
