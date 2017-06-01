package com.cleo.data.transform;

import com.cleo.data.transform.resources.VLTransferConnectorResource;
import io.dropwizard.Application;
import io.dropwizard.Bundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import uk.co.deloittedigital.dropwizard.hikari.HikariBundle;

public class DataTransformRESTApplication extends Application<DataTransformRESTConfiguration> {

    public static void main(final String[] args) throws Exception {
        new DataTransformRESTApplication().run(args);
    }

    @Override
    public String getName() {
        return "DataTransformREST";
    }

    @Override
    public void initialize(final Bootstrap<DataTransformRESTConfiguration> bootstrap) {
        //bootstrap.addBundle((Bundle) new HikariBundle());
    }

    @Override
    public void run(final DataTransformRESTConfiguration configuration,
                    final Environment environment) {
        environment.jersey().register(new VLTransferConnectorResource());
    }

}
