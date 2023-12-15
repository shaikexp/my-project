package com.example;

public class DataService {
    private ExternalService externalService;

    public DataService(ExternalService externalService) {
        this.externalService = externalService;
    }

    public String fetchData() {
        
        return externalService.getData();
    }
    
	public String fetchStaticData() {
        
        return ExternalServiceUtil.staticMethod();
    }

}
