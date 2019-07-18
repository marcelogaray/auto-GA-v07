package testingui.diplomadoumss.org.core;

import testingui.diplomadoumss.org.managepage.dashboard.Dashboard;
import testingui.diplomadoumss.org.managepage.login.Login;

import java.util.HashMap;
import java.util.Map;

public class FirstExample {
    public static void main(String[] args) {
        Login login = new Login();
        login.initBrowser();
        login.setCredentials();
        Dashboard dashboard = new Dashboard();
    }

    public static void exampleMap(){
        Map<String, String> students = new HashMap<>();
        students.put("101", "nombre 1");
        students.put("102", "nombre 2");
        students.put("103", "nombre 3");

        System.out.println(students.get("102"));
    }
}
