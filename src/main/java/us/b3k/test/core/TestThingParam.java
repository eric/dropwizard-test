package us.b3k.test.core;

import io.dropwizard.jersey.params.AbstractParam;

public class TestThingParam extends AbstractParam<TestThing> {
    /**
     * Given an input value from a client, creates a parameter wrapping its parsed value.
     *
     * @param input an input value from a client request
     */
    public TestThingParam(String input) {
        super(input);
    }

    @Override
    protected TestThing parse(String input) throws Exception {
        return new TestThing(input);
    }
}
