
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class App {
    public static void main(String[] args) throws Exception {
        //Indicar la ruta donde se encuentra el chromedriver
        String path = "C:/Users/dtoct/OneDrive/Escritorio/chromedriver.exe";
        
        System.setProperty("webdriver.chrome.driver", path);
        WebDriver driver = new ChromeDriver();

        Website website = new Website();
        //Maximiza la pantalla
        //driver.manage().window().maximize();

        //Se incializa el driver en la clase Website
        website.setDriver(driver);

        driver.get("https://apprater.net/add/");
        
        //Llenado de los campos pedidos
        
        website.sendText("myName", "name", "user-submitted-name", "Lucas Ocampo");
        website.sendText("myEmail", "name", "user-submitted-email", "lucasO@gmail.com");
        website.sendText("myProductTitle", "xpath", "//*[@id='usp_form']/fieldset[1]/input", "AppHi");
        website.sendText("myProductURL", "css", "#usp_form > div.input_fields_wrap > fieldset > input", "www.apphi.com");
        website.sendText("myProductDescription", "xpath", "//*[@id='usp_form']/fieldset[2]/textarea", "An app to chat with your friends");

    }

   
}
