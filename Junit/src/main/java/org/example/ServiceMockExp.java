package org.example;

public class ServiceMockExp {
    private ExtApiMockExp api;
    public ServiceMockExp(ExtApiMockExp api){
        this.api=api;
    }
    public String fetchData(){
        return api.getData();
    }
}
