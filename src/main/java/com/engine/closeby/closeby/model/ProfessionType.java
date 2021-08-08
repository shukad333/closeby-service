package com.engine.closeby.closeby.model;

public enum ProfessionType {

    PLUMBING("Plumbing"),
    ELECTRICIAN("Electrician");

    private final String profession;

    ProfessionType(String profession) {
        this.profession = profession;
    }

    @Override
    public String toString() {
        return profession;
    }
}
