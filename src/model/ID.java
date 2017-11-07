package model;

public class ID {
    private Integer value;
    private String stringValue;

    public ID(Integer value) {
        this.value = value;
        this.stringValue = value.toString();
    }

    public Integer getValue() {
        return value;
    }

    public String getStringValue() {
        return stringValue;
    }

    @Override
    public String toString() {
        return "" + value;
    }
}
