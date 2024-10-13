package app.user;

import app.audio.Collections.Notification;
import app.pages.Page;
import app.utils.MyObserver;
import app.utils.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Content creator.
 */
public abstract class ContentCreator extends UserAbstract implements Subject {
    private String description;
    private Page page;
    private List<MyObserver> observerList;

    /**
     * Instantiates a new Content creator.
     *
     * @param username the username
     * @param age      the age
     * @param city     the city
     */
    public ContentCreator(final String username, final int age, final String city) {
        super(username, age, city);
        observerList = new ArrayList<>();
    }

    /**
     * Gets description.
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets description.
     *
     * @param description the description
     */
    public void setDescription(final String description) {
        this.description = description;
    }

    /**
     * Gets page.
     *
     * @return the page
     */
    public Page getPage() {
        return page;
    }

    /**
     * Sets page.
     *
     * @param page the page
     */
    public void setPage(final Page page) {
        this.page = page;
    }

    @Override
    public void registerObserver(MyObserver o) {
        observerList.add(o);
    }

    @Override
    public void unregisterObserver(MyObserver o) {
        observerList.remove(o);
    }

    @Override
    public void notifyObservers(Notification notification) {
        for(MyObserver observer : observerList) {
            observer.update(notification);
        }
    }

    public boolean observerExists(MyObserver o) {
        return observerList.contains(o);
    }
}
