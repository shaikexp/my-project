package com.example;

public class DataService {
    private ExternalService externalService;

    public DataService(ExternalService externalService) {
        this.externalService = externalService;
    }

    public String fetchData() {
        
        return externalService.getData();
    }

    public static String staticMethod() {
        return "Static method result";
    }
}
