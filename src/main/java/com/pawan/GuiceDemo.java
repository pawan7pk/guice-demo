package com.pawan;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.pawan.modules.AppModule;
import com.pawan.requests.SquareRequest;

public class GuiceDemo {

    private static final String SQUARE_REQ = "SQUARE";

    private static void sendRequest(String request) {

        if (request.equalsIgnoreCase(SQUARE_REQ)) {
            Injector injector = Guice.createInjector(new AppModule());
            SquareRequest squareRequest = injector.getInstance(SquareRequest.class);
            squareRequest.makeRequest();
        }
    }

    public static void main(String[] args) {

        sendRequest(SQUARE_REQ);
    }
}
