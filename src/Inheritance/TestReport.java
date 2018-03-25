package Inheritance;

public class TestReport {
    public static void main(String[] args) {
        TestDesign td = new TestDesign();
        /**
         *  Inherit fields from Test Plan Supper Class(parent class)
         */
        td.setTestID(101);
        td.setTestTitle("Sign up form authentication");
        td.setTestType("Automation");
        td.setTestEnv("Selenium driver");
        td.setDesingID(001);
        td.setTestCase("An user is able to sign up on this web app who has a valid email address.");
        td.setPriority("High");

        System.out.println("Test id: "+td.getTestID());
        System.out.println("Test title: "+td.getTestTitle());
        System.out.println("Test type: "+td.getTestType());
        System.out.println("Test environment: "+td.getTestEnv());
        System.out.println("Test design id: "+td.getDesingID());
        System.out.println("Test case: "+td.getTestCase());
        System.out.println("Test priority: "+td.getPriority());
    }
}
