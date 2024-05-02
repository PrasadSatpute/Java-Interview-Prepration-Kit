package org.example.prototype.shallow_deep_copy;

import java.util.ArrayList;
import java.util.List;

public class NetworkConnection2 implements Cloneable{
    private String ip;
    private String importantData;
    private List<String> domains = new ArrayList<>();

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getImportantData() {
        return importantData;
    }

    public void setImportantData(String importantData){
        this.importantData = importantData;
    }
    public void setImportantDataWithTimeTaking(String importantData) throws InterruptedException {
        System.out.println("This Data take Time to set");
        Thread.sleep(5000);
        this.importantData = "Set Data = "+importantData;
    }

    public List<String> getDomains() {
        return domains;
    }

    public void setDomains() {
        this.domains.add("WWW.GOOGLE.COM");
        this.domains.add("WWW.WWE.COM");
        this.domains.add("WWW.MAP.COM");
        this.domains.add("WWW.APP.COM");
    }

    @Override
    public String toString() {
        return "NetworkConnection2{" +
                "ip='" + ip + '\'' +
                ", importantData='" + importantData + '\'' +
                ", domains=" + domains +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // logic for cloning
        NetworkConnection2 networkConnection2 = new NetworkConnection2();
        networkConnection2.setIp(this.getIp());
        networkConnection2.setImportantData(this.getImportantData());

        for (String d : this.getDomains())
        {
            networkConnection2.getDomains().add(d);
        }

        return networkConnection2;
    }
}
