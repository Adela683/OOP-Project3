package app.utils;

import app.audio.Collections.Notification;

import java.util.Observer;

public interface Subject {

    public void registerObserver(MyObserver o);
    public void unregisterObserver(MyObserver o);
    public void notifyObservers(Notification notification);
}
