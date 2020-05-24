package registration;

import javax.xml.ws.Endpoint;

import service.endpoint.*;

public class PublicWS {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/ws02/ActionService", new ActionService());
        Endpoint.publish("http://localhost:8080/ws02/BranchService", new BranchService());
        Endpoint.publish("http://localhost:8080/ws02/MaterialService", new MaterialService());
        Endpoint.publish("http://localhost:8080/ws02/ProviderService", new ProviderService());
        Endpoint.publish("http://localhost:8080/ws02/StaffService", new StaffService());
    }
}