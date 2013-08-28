package ro.jtonic.handsonrest.resources;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.springframework.stereotype.Service;
import ro.jtonic.handsonrest.api.IMultipartResource;

/**
 * Created by jtonic on 8/28/13.
 */
@Service
public class MultipartResource implements IMultipartResource {
    @Override
    public void postMultipartData1(String username, String role) {
        System.out.println("username = " + username);
        System.out.println("role = " + role);
    }

    @Override
    public void postMultipartData2(final String username, final String role, final Attachment image) {
        System.out.println("username = " + username);
        System.out.println("role = " + role);
        System.out.println("image.getContentType() = " + image.getContentType());
        System.out.println("filename = " + image.getContentDisposition().getParameter("filename"));
    }
}
