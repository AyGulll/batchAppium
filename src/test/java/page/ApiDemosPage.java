package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Hooks;

public class ApiDemosPage extends Hooks {
    public ApiDemosPage() {
        PageFactory.initElements(androidDriver, this);

    }
        @FindBy(xpath = "")
        public WebElement accessibilityButton;

       public WebElement findelementByAccesibilityId(String id){
           return androidDriver.findElementByAccessibilityId(id);
       }
       public WebElement accessbilityId=
       androidDriver.findElementByAccessibilityId("Acces' ibility");
       public WebElement getAccessibilityButton(){
           return findelementByAccesibilityId("Acces'ibility");

       }

       public void clickElement(WebElement element){
            element.click();


        }

    }



