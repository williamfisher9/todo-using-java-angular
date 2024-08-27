package com.apps.backend.enums;

import java.util.HashMap;
import java.util.Map;

public enum Status {
    COMPLETED("Completed", 1), PENDING("Pending", 2);

    private final String name;
    private final int code;

    private final Map<Integer, String> codeNamePair = new HashMap<>();

    private Status(String name, int code){
        this.code = code;
        this.name = name;
        codeNamePair.put(code, name);
    }

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }

    public String getNameByCode(int code){
        return codeNamePair.get(code);
    }
}
