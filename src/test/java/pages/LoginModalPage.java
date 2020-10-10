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

    public TextBox emailTextBox= new TextBox(By.id("ctl00_MainContent_LoginControl1_TextBoxEmail"),"[email] textbox on Login Modal Page");
    public TextBox passwordTextBox= new TextBox(By.id("ctl00_MainContent_LoginControl1_TextBoxPassword"),"[password] textbox on Login Modal Page");
    public Button signupButton= new Button(By.id("ctl00_MainContent_LoginControl1_ButtonLogin"),"[signup] button on Login Modal Page");
    public Button addIniProject= new Button(By.xpath("//*[@id=\"Div2\"]"),"[Intro] Intro add project");
    public TextBox nameProject= new TextBox(By.id("NewProjNameInput"), "[add] name project");
    public Button addProject= new Button(By.id("NewProjNameButton"), "[add button] button add project");



    public LoginModalPage(){}

}

