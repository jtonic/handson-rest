package ro.jtonic.handsonrest.api;

import com.google.common.base.Objects;

import javax.ws.rs.core.PathSegment;
import java.util.List;

/**
 * Created by jtonic on 9/9/13.
 */
public class CourseResource implements ICourseResource {
    @Override
    public String getCourses(List<Integer> ids) {
        System.out.println("topics no = " + ids.size());
        return Integer.toString(ids.size());
    }

    @Override
    public String getCourses(Criteria criteria) {
        return criteria.toString();
    }

    @Override
    public String getCoursesThroughMatrix(PathSegment model) {
        final String mod = model.getPath();
        final String year = model.getMatrixParameters().getFirst("year");
        final String color = model.getMatrixParameters().getFirst("color");
        final String str = Objects.toStringHelper(this).add("model", mod).add("year", year).add("color", color).toString();
        return str;
    }
}
