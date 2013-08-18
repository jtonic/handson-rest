##This project is intended to learn in depth the REST architectural styles.

###The project is based on CXF-JAXRS/Spring/Gradle.

In order to start using it you need not to install gradle because the gradle wrapper, configured for this project will take care to download and install it.

**In order to test simple greeting REST service:**

1. run jetty server and deploy the war artefact

    $ ./gradlew jettyRunWar

1. test the REST greeting service

    $ curl -v http://localhost:9090/handson-rest/hello

1. stop jetty server

    $ ./gradlew jettyStop

What aspects I would like to implement in near future:

1. upload byte array (picture) and text with multipart/form-data
1. security - authentication
1. security - authorization
1. caching
1. HATEOAS

**How to edit markdown?** http://daringfireball.net/projects/markdown/dingus
