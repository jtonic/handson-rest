package ro.jtonic.handsonrest.api;

import org.testng.collections.Objects;

/**
 * Created by jtonic on 9/9/13.
 */
public class Criteria {
    public String name;
    public String duration;


    @Override
    public String toString() {
        return Objects.toStringHelper(this.getClass())
                .add("duration", duration)
                .add("name", name)
                .toString();
    }
}
