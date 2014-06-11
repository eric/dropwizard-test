package us.b3k.test.core;

public class TestThing {
    private String value;

    public TestThing() {}

    public TestThing(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        return obj.getClass() == getClass() && value.equals(((TestThing)obj).value);
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public String toString() {
        return value;
    }
}
