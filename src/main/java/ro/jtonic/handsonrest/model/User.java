package ro.jtonic.handsonrest.model;

import com.google.common.base.Objects;

/**
 * Created by jtonic on 9/17/13.
 */
public class User {

    public String name;

    public String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public User() {
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this)
                .add("name", name)
                .add("email", email)
                .toString();
    }
}
