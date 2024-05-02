package org.example.prototype.shallow_deep_copy;

public class UserTest {
    public static void main(String[] args) throws InterruptedException, CloneNotSupportedException {

        System.out.println("-----------------------------SHALLOW COPY-----------------------------------------");

        NetworkConnection1 connection1 = new NetworkConnection1();


        connection1.setIp("196.126.4.5");
        connection1.setImportantDataWithTimeTaking("Network Credentials");
        connection1.setDomains();

        NetworkConnection1 connection2 = (NetworkConnection1) connection1.clone();

        connection1.getDomains().remove(0);
        System.out.println("Here We remove domain in connection 1 but it will reflect on connection 2");
        System.out.println(connection1);
        System.out.println(connection2);

        System.out.println("-------------------------------DEEP COPY---------------------------------------");

        NetworkConnection2 connection3 = new NetworkConnection2();


        connection3.setIp("196.126.4.5");
        connection3.setImportantDataWithTimeTaking("Network Credentials");
        connection3.setDomains();

        NetworkConnection2 connection4 = (NetworkConnection2) connection3.clone();

        connection3.getDomains().remove(0);
        System.out.println("Here We remove domain in connection 3 but No changes on connection 4");
        System.out.println(connection3);
        System.out.println(connection4);


    }
}
