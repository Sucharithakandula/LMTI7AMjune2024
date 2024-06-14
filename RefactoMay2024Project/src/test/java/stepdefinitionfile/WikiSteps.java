package stepdefinitionfile;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;
import utils.TestContext;

public class WikiSteps {
    TestContext Context;
    public WikiSteps(TestContext Context){
        this.Context=Context;
    }
    
    @Given("User Extracts the column one value")
    public void extractColOneValue(){
boolean flag = false;
for(String k : Context.pageObjectManager.getWikiPage().getColumnOneValues()){
    if(k.equals("Company type")){
        flag = true;
    }

}
        Assert.assertTrue(flag);
        
    }

    @When("User Extracts the column two value")
    public void userExtractsTheColumnTwoValue() {
        Context.pageObjectManager.getWikiPage().getColumnTwoValues();
        
    }

    @Then("Validate the mapping")
    public void validateTheMapping() {

        Assert.assertEquals("Trade name", Context.pageObjectManager.getWikiPage().getColumnOneValues().get(0));
        Assert.assertEquals("Infosys",Context.pageObjectManager.getWikiPage().getColumnTwoValues().get(0));
    }

    @Given("User validate the key and value pair relation of ShareHolders and ShareHoldings")
    public void userValidateTheKeyAndValuePairRelation() {
        System.out.println(Context.pageObjectManager.getWikiPage().gethareholdingstakeholdersValues().get("Others"));
    Assert.assertEquals(" 0.32%",Context.pageObjectManager.getWikiPage().gethareholdingstakeholdersValues().get("Others"));

    }
}
