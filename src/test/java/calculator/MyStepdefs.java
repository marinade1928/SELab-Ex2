package calculator;

import calculator.Calculator;
import cucumber.api.java.Before; import cucumber.api.java.en.Given; import cucumber.api.java.en.Then; import cucumber.api.java.en.When; import org.junit.Assert;
public class MyStepdefs {
    private Calculator calculator;
    private int value1;
    private int value2;
    private int value3;
    private int result;
    private float res;
    @Before public void before() {
        calculator = new Calculator();
    }
    @Given("^Two input values, (\\d+) and (\\d+)$") public void twoInputValuesAnd(int arg0, int arg1) {
        value1 = arg0;
        value2 = arg1; }
    @When("^I add the two values$") public void iAddTheTwoValues() {
        result = calculator.add(value1, value2);
        System.out.print(result); }
    @Then("^I expect the result (\\d+)$") public void iExpectTheResult(int arg0) {
        Assert.assertEquals(arg0, result); }
    @Given("^One input value, (\\d+)$") public void oneInputValue(int arg0) {
        value3 = arg0; }
    @When("^I rvs the value$") public void iRvsTheValue() {
        res = calculator.rvs(value3);
        String.format("%.1f", res);
        System.out.print(res); }
    @Then("^I expect the result (\\d+)\\.(\\d+)$") public void iExpectTheFloatResult(int arg0, int arg1) {
        res *= 10;
        int es = (int) res;
        Assert.assertEquals(arg1, es); }
}

