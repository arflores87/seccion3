package testUI;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.junit4.DisplayName;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pages.LoginModalPage;
import pages.MainPage;
import session.Session;

/**
 * @autor : eynar.pari
 * @date : 02/10/2020.
 **/
public class LoginTodoLyTest {

    LoginModalPage loginModalPage = new LoginModalPage();
    MainPage mainPage = new MainPage();

    @Before
    public void before(){
        Session.getInstance().getDriver().get("http://todo.ly/");
    }

    @DisplayName("verify The Login Using User And Password")
    @Description("This test case is to verify verify The Login Using User And Password")
    @Owner("Eynar Pari")
    @Test
    public void verifyTheLoginUsingUserAndPassword() throws InterruptedException {
        mainPage.singUpFreeButton.click();
        loginModalPage.emailTextBox.type("ucb100@ucb.com");
        loginModalPage.passwordTextBox.type("ucb123");
        loginModalPage.signupButton.click();
        loginModalPage.addIniProject.click();
        loginModalPage.nameProject.type("PROYECTO NUEVO 2");
        loginModalPage.addProject.click();
        //Verification
        Thread.sleep(2000);
        Assert.assertFalse("ERROR , no se pudo realizar el login!",loginModalPage.signupButton.isDisplayedOnPage());
    }

    @After
    public void after(){
       Session.getInstance().closeBrowser();
    }

}
