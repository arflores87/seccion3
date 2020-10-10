package pages;

import control.Button;
import org.openqa.selenium.By;

/**
 * @autor : eynar.pari
 * @date : 02/10/2020.
 **/
public class MainPage {

    public Button singUpFreeButton= new Button(By.xpath("//img[@src='/Images/design/pagelogin.png']"),"[Login] Button on Login");

    public MainPage(){}


}
