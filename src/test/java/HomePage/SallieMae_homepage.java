package HomePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class SallieMae_homepage extends BaseClass {

    @FindBy(xpath = "//a[@class='h1 svg_click']")
    WebElement smlogo;


    void  checksmlogo(){
        smlogo.click();
    }



    public static void main(String[] args) {
        BaseClass baseClass = new BaseClass();
        SallieMae_homepage homepage = new SallieMae_homepage();


      baseClass.setup();
      homepage.checksmlogo();


    }
}