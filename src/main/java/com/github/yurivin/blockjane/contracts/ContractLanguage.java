package com.github.yurivin.blockjane.contracts;

public enum ContractLanguage {
    Groovy("Groovy", 1),
    Kotlin("Kotlin", 2);

    public String title;
    public int code;

    ContractLanguage(String title, int code) {
        this.title = title;
        this.code = code;
    }
}