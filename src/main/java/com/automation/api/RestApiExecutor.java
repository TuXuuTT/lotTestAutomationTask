package com.automation.api;

public class RestApiExecutor {

    private static volatile RestApiExecutor restApiExecutor;


    private RestApiExecutor() {

    }

    public static RestApiExecutor getInstance() {

        RestApiExecutor sysProps = restApiExecutor;
        if (sysProps == null) {
            synchronized (RestApiExecutor.class) {
                sysProps = restApiExecutor;
                if (sysProps == null) {
                    restApiExecutor = sysProps = new RestApiExecutor();
                }
            }
        }
        return sysProps;
    }

}
