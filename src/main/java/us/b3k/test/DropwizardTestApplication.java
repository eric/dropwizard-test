package us.b3k.test;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import us.b3k.test.resources.TestResource;

public class DropwizardTestApplication extends Application<DropwizardTestConfiguration> {
    public static void main(String[] args) throws Exception {
        new DropwizardTestApplication().run(args);
    }

    @Override
    public void initialize(Bootstrap<DropwizardTestConfiguration> bootstrap) {

    }

    @Override
    public void run(DropwizardTestConfiguration configuration, Environment environment) throws Exception {
        environment.jersey().register(new TestResource());
    }
}
