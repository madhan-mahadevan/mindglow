package com.salmon.test.runners.b2b;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "target/test-classes", tags = {
        "@b2b_pdp, @b2b_favourites_list_details, @b2b_plp_listView, @b2b_search, @b2b_login, @b2b_quickOrder, @b2b_department, @b2b_MyBasketPage, @b2b_FavouritesListOverlay, @b2b_orderReply, @b2b_orderconfirmation, @autouser2,@b2b_register, @b2b_site_selection, @b2b_forgotPassword, @b2b_forgotUsername, @b2b_passwordExpired",
        "~@b2b_wip", "~@b2b_failed", "~@devsmoketestplp", "~@autouser1",
        "~@b2b_blocked" }, monochrome = true, plugin = { "pretty", "html:target/cucumber-report/run2b2bjenkins",
                "json:target/cucumber-report/run2b2bjenkins/cucumber.json",
                "rerun:target/cucumber-report/run2b2bjenkins/rerun.txt" }, glue = "com.salmon.test")
public class Run2B2BJenkinsSuite extends AbstractTestNGCucumberTests {
}
