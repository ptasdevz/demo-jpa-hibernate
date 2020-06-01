package com.ptasdevz.demojpahibernate.entites;

public enum Action {

    INSERTED("INSERTED"),
    UPDATED("UPDATED");

    private final String name;

    Action(String name) {
        this.name = name;
    }
    public String value() {
        return this.name;
    }

    @Override
    public String toString() {
        return name;
    }
}
