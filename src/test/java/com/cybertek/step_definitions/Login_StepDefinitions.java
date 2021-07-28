package com.cybertek.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepDefinitions {
    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        System.out.println("User is on the login page");
    }
    @When("user enters librarian username")
    public void user_enters_librarian_username() {
        System.out.println("User enters librarian username");

        //Assert.fail("INTENTIONAL FAILING. DELETE THIS LATER");
    }
    @When("user enters librarian password")
    public void user_enters_librarian_password() {
        System.out.println("User enters librarian password");
    }
    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        System.out.println("User sees the dashboard");
    }

    @When("user enters student username")
    public void userEntersStudentUsername() {
        System.out.println("User enters student username");
    }

    @And("user enters student password")
    public void userEntersStudentPassword() {
        System.out.println("User enters student password");
    }

    @When("user enters admin username")
    public void userEntersAdminUsername() {
        System.out.println("User enters admin username");
    }

    @And("user enters admin password")
    public void userEntersAdminPassword() {
        System.out.println("User enters admin password");
    }
}
