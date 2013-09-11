package ro.jtonic.handsonrest.api;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;

import javax.ws.rs.MatrixParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.PathSegment;
import javax.ws.rs.core.UriInfo;
import java.util.Arrays;
import java.util.List;

/**
 * Created by jtonic on 9/9/13.
 */
public class CourseResource implements ICourseResource {
    @Override
    public String getCourses(String[] courseNames) {
        return "Courses " + Arrays.deepToString(courseNames);
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

    @Override
    public String getCourse(String course, String teacher, String name, String duration) {
        final String ret = String.format("Course= %s, name = %s, duration = %s, teacher = %s", course, name, duration, teacher);
        return ret;
    }

    @Override
    public String getByCriteria(UriInfo uriInfo) {
        final MultivaluedMap<String, String> queryParameters = uriInfo.getQueryParameters();
        for (String name : queryParameters.keySet()) {
            System.out.println("name = " + name);
            System.out.println("value = " + queryParameters.getFirst(name));
        }
        final List<PathSegment> pathSegments = uriInfo.getPathSegments();
        for (PathSegment pathSegment : pathSegments) {
            System.out.println("pathSegment.getPath() = " + pathSegment.getPath());
            final MultivaluedMap<String, String> matrixParameters = pathSegment.getMatrixParameters();
            for (String matrixName : matrixParameters.keySet()) {
                System.out.println("matrixName = " + matrixName);
                System.out.println("matrixParameters.getFirst(matrixName) = " + matrixParameters.getFirst(matrixName));
            }
        }
        return "The uriInfo info is logged on server.";
    }
}
