package Inheritance;

public class TestDesign extends TestPlan
{
    int desingID = 0;
    String testCase = "default test case";
    String priority = "default priority";

    public int getDesingID() {
        return desingID;
    }

    public void setDesingID(int desingID) {
        this.desingID = desingID;
    }

    public String getTestCase() {
        return testCase;
    }

    public void setTestCase(String testCase) {
        this.testCase = testCase;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public void runnTest()
    {
        System.out.println("Test is executed");
    }



}
