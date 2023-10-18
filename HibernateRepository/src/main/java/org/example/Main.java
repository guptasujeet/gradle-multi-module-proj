package org.example;

import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {
        if(StringUtils.isBlank("")){
            System.out.println("Blank");
        }
        System.out.println("Hello world!");
    }
}