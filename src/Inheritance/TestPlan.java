package Inheritance;

public class TestPlan
{
    public int testID = 0;
    public String testTitle = "default name";
    public String testType = "default type";
    public String testEnv = "default env";

    /**
     ************* All fields setter methods
     *
     */
    public void setTestID(int testID) {
        this.testID = testID;
    }

    public void setTestTitle(String testTitle) {
        this.testTitle = testTitle;
    }

    public void setTestType(String testType) {
        this.testType = testType;
    }

    public void setTestEnv(String testEnv) {
        this.testEnv = testEnv;
    }

    /**
     ************* All fields getter methods
     *
     */

    public int getTestID() {
        return testID;
    }

    public String getTestTitle() {
        return testTitle;
    }

    public String getTestType() {
        return testType;
    }

    public String getTestEnv() {
        return testEnv;
    }


    public void regressionTest()
    {
        System.out.println("After executing all features test, perform regression test.");
    }
}
