package app.utils;

import app.user.Artist;
import app.user.Host;
import app.user.User;
import app.user.UserAbstract;

public class UserFactory {
    private static UserFactory instance;

    private UserFactory() {}
    public static UserFactory getInstance() {
        if (instance == null) {
            synchronized (UserFactory.class) {
                if (instance == null) {
                    instance = new UserFactory();
                }
            }
        }
        return instance;
    }

    public UserAbstract getUser(String userType, String username, int age, String city) {
        if (userType == null) {
            return null;
        }

        if (userType.equals("artist")) {
            return new Artist(username, age, city);
        } else if (userType.equals("host")) {
            return new Host(username, age, city);
        } else {
            return new User(username, age, city);
        }
    }
}
