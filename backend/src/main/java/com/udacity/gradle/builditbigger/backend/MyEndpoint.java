package com.udacity.gradle.builditbigger.backend;

import com.app.android.javajokes.Jokes;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.builditbigger.gradle.udacity.com",
                ownerName = "backend.builditbigger.gradle.udacity.com",
                packagePath = ""
        )
)
public class MyEndpoint {

    /** A simple endpoint method that returns a joke as response */
    @ApiMethod(name = "joke")
    public MyBean joke() {
        MyBean response = new MyBean();
        String joke= Jokes.joke();      // supplying joke from java lib
        response.setData(joke);
        return response;
    }

}
