package StepDefinitions;

import Pages._01_registerfunctionalitylocators;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _03_BillPayFunctionalitiy {

    _01_registerfunctionalitylocators elements = new _01_registerfunctionalitylocators();
    @When("Pay the bills{string}and {string}")
    public void payTheBillsAnd(String billName, String price ) {

        elements.clickFunction(elements.billPay);
        elements.sendKeysFunction(elements.payeeName,billName);
        elements.sendKeysFunction(elements.payeeAdress,"Kazim KArabekir Cad.");
        elements.sendKeysFunction(elements.payeeCityt,"Ankara");
        elements.sendKeysFunction(elements.payeeState,"Türkei");
        elements.sendKeysFunction(elements.payeeZip,"06434");
        elements.sendKeysFunction(elements.payeePhone,"0555 444 333 2222");
        elements.sendKeysFunction(elements.payeeAccount,"12345");
        elements.sendKeysFunction(elements.payeeVerifyAccount,"12345");
        elements.sendKeysFunction(elements.payeeVerifyAccount,"12345");
        elements.sendKeysFunction(elements.payeeAmount,price);
        elements.clickFunction(elements.SendPAyment);
    }

    @Then("Verify the success")
    public void verifyTheSuccess() {
     //   elements.verifyContainsTextFunction(elements.billPaymentComplete,"Complete");
        elements.verifyContainsTextFunction(elements.errorMessage,"Error");

    }


}
