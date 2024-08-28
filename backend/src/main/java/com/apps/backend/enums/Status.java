package com.apps.backend.enums;

import java.util.HashMap;
import java.util.Map;

public enum Status {
    COMPLETED("Completed", 1), PENDING("Pending", 2);

    private final String name;
    private final int code;

    private static final Map<Integer, String> codeNamePair = new HashMap<>();

    static {
        for(Status x : values()){
            codeNamePair.put(x.code, x.name);
        }
    }

    private Status(String name, int code){
        this.code = code;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }

    public static String getNameByCode(int code){
        return codeNamePair.get(code);
    }
}
