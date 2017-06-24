package org.dalojs;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import ru.vyarus.dropwizard.guice.GuiceBundle;

public class DalojsApplication extends Application<DalojsConfiguration> {

    public static void main(final String[] args) throws Exception {
        new DalojsApplication().run(args);
    }

    @Override
    public String getName() {
        return "Dalojs";
    }

    @Override
    public void initialize(final Bootstrap<DalojsConfiguration> bootstrap) {
        bootstrap.addBundle(GuiceBundle.builder()
                .enableAutoConfig(getClass().getPackage().getName())
                .build());
    }

    @Override
    public void run(final DalojsConfiguration configuration,
            final Environment environment) {
    }

}
