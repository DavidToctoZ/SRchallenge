import org.openqa.selenium.WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Website {
    WebDriver driver;

    public Website() {
       
    }

    

    public void sendText(String label, String selectorType, String selector, String value){
       
        WebElement e;
        switch (selectorType){
            case "css":
                System.out.println("css");
                e = driver.findElement(By.cssSelector(selector));
                e.sendKeys(value);
                break;
            case "name":
                System.out.println("name");
                e = driver.findElement(By.name(selector));
                e.sendKeys(value);
                break;
            case "xpath":
                e = driver.findElement(By.xpath(selector));
                e.sendKeys(value);
                System.out.println("xpath");
                break;

        }
    }



	public WebDriver getDriver() {
		return driver;
	}



	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
    
}
