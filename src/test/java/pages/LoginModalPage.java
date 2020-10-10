package pages;

            import control.Button;
            import control.CheckBox;
            import control.TextBox;
            import org.openqa.selenium.By;

/**
 * @autor : eynar.pari
 * @date : 02/10/2020.
 **/
public class LoginModalPage {

    public TextBox fullNameTextBox= new TextBox(By.id("ctl00_MainContent_SignupControl1_TextBoxFullName"),"[fullname] textbox on Login Modal Page");
    public TextBox emailTextBox= new TextBox(By.id("ctl00_MainContent_SignupControl1_TextBoxEmail"),"[email] textbox on Login Modal Page");
    public TextBox passwordTextBox= new TextBox(By.id("ctl00_MainContent_SignupControl1_TextBoxPassword"),"[password] textbox on Login Modal Page");
    public CheckBox agreeTermsCheckBox= new CheckBox(By.id("ctl00_MainContent_SignupControl1_CheckBoxTerms"),"[agree terms] checkbox on Login Modal Page");
    public Button signupButton= new Button(By.id("ctl00_MainContent_SignupControl1_ButtonSignup"),"[signup] button on Login Modal Page");

    public LoginModalPage(){}

}

