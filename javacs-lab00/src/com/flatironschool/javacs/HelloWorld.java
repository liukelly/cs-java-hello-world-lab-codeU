package com.flatironschool.javacs;

public class HelloWorld {
    public static Double getVersion() {
        String version_str = System.getProperty("java.specification.version");
        System.out.println(version_str);
        Double version = Double.parseDouble(version_str);
        return version;
    }

    public static void main(String[] args) {
        getVersion();
    }
}
