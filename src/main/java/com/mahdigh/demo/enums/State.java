package com.mahdigh.demo.enums;

/**
 * @author Mahdi Ghazimoradi
 * @since 4/10/2021
 */

public enum State {

    NOT_APPROVED("na", 1),
    APPROVED("a", 2),
    REJECTED("r", 3);

    private String label;
    private int value;

    State(String label, int value) {
        this.label = label;
        this.value = value;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public static boolean containsValueByLabel(String label) {
        for (State state : State.values()) {
            if (state.getLabel().equalsIgnoreCase(label)) {
                return true;
            }
        }
        return false;
    }

    public static State stateValueByLabel(String label) {
        for (State state : State.values()) {
            if (state.getLabel().equalsIgnoreCase(label)) {
                return state;
            }
        }
        return null;
    }

    public static boolean containsValueByValue(int value) {
        for (State state : State.values()) {
            if (state.getValue() == value) {
                return true;
            }
        }
        return false;
    }

    public static State stateValueByValue(int value) {
        for (State state : State.values()) {
            if (state.getValue() == value) {
                return state;
            }
        }
        return null;
    }
}
