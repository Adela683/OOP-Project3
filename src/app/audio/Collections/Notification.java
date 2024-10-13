package app.audio.Collections;

import lombok.Getter;
import lombok.Setter;

import java.util.Observable;

public class Notification extends Observable {

    @Getter
    @Setter
    private String name;

    @Setter
    @Getter
    private String description;

    public Notification(String name, String description) {
        this.name = name;
        this.description = description;
    }
}