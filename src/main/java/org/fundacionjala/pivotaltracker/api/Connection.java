package org.fundacionjala.pivotaltracker.api;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

/**
 * Class to manage the connection to pivotal tracker.
 */
public final class Connection {

    private static final String X_TRACKER_TOKEN_HEADER = "X-TrackerToken";
    private static final Environment ENVIRONMENT = Environment.getInstance();
    private static Connection connection;
    private RequestSpecification requestSpecification;

    /**
     * This method is in charge to initialize the connection.
     */
    private Connection() {
        RestAssured.baseURI = ENVIRONMENT.getBaseUri();
        requestSpecification = new RequestSpecBuilder()
                .addHeader(X_TRACKER_TOKEN_HEADER, ENVIRONMENT.getToken())
                .setRelaxedHTTPSValidation().build();
        if (!ENVIRONMENT.getProxy().isEmpty()) {
            requestSpecification.proxy(ENVIRONMENT.getProxy());
        }
    }

    /**
     * Get the request specification.
     *
     * @return Request Specification.
     */
    public RequestSpecification getRequestSpecification() {
        return requestSpecification;
    }

    /**
     * this method Instance the connection if this does not exist.
     *
     * @return a connection.
     */
    public static Connection getInstance() {
        if (connection == null) {
            connection = new Connection();
        }
        return connection;
    }
}
