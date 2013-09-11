##This project is intended to learn in depth the REST architectural styles.

###The project is based on CXF-JAXRS/Spring/Gradle.

In order to start using it you need not to install gradle because the gradle wrapper, configured for this project will take care to download and install it.

**In order to test simple greeting REST service:**

1. run jetty server and deploy the war artifact

    $ ./gradlew jettyRunWar

1. test the REST greeting service

    Simple example:
    $ curl -v http://localhost:9090/handson-rest/hello

1. test multipart with text/plain parts

    $ curl -v -X POST http://localhost:9090/handson-rest/multipart/one -H 'Content-Type: multipart/form-data' -F username=antonel -F role=admin


1. test multipart with 2 text/plain parts and a file

    $ curl -v -X POST http://localhost:9090/handson-rest/multipart/two -H 'Content-Type: multipart/form-data' -F username=antonel -F role=admin -F "image=@/home/jtonic/github/jtonic/handson-rest/src/test/resources/avatar.jpg"


1. stop jetty server

    $ ./gradlew jettyStop

What aspects I would like to implement in near future:

TODO:
=====

1. upload byte array (picture) and text with multipart/form-data
    - [V] Create resource
    - [V] Create curl
    - From Multipart to Spring resource
    - Save locally

1. [V] custom media type support and multiple supported media type
    
    $ curl -v http://localhost:9090/handson-rest/hello_again -H "Accept: application/json" | json_pp

    $ curl -v http://localhost:9090/handson-rest/hello_again -H "Accept: application/vnd.ro.jtonic.hello+json;version=1" | json_pp

    $ curl -v http://localhost:9090/handson-rest/hello_again -H "Accept: text/plain" => HTTP/1.1 406 Not Acceptable

1. [V] List/array @QueryParams

    $ curl -v "http://localhost:9000/handson-rest/courses?name=math&name=history"

1. [V] @PathParam with PathSegment

    $ curl -v "http://localhost:9000/handson-rest/courses/matrix/audi;color=white;year=2010"

1. [V] @MatrixParams

    $ curl -v "http://localhost:9000/handson-rest/courses/math;name=math;duration=2h/apazargic"

1. [V] QueryParams deserialized in a bean

    $ curl -v "http://localhost:9000/handson-rest/courses/query?name=math&duration=2h"

1. @Context UriInfo

    $ curl -v "http://localhost:9000/handson-rest/courses/criteria?name=math&duration=2h"

1. security - authentication

1. security - authorization

1. caching

1. HATEOAS

1. Generate REST docs with swagger. Also use Swagger UI to have a executable REST documentation.

**How to edit markdown?** http://daringfireball.net/projects/markdown/dingus
