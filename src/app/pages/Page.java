package app.pages;

import app.user.Host;
import app.user.UserAbstract;

/**
 * The interface Page.
 */
public interface Page {
    /**
     * Print current page string.
     *
     * @return the current page string
     */
    String printCurrentPage();
    UserAbstract getPerson();
}
