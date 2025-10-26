package google_Form.Medius_Technologies_Private_Limited;
import java.io.File;
import java.io.IOException;
import java.util.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import org.openqa.selenium.TakesScreenshot;

public class App {
    public static void main(String[] args) throws InterruptedException, IOException   {
        WebDriver driver = new ChromeDriver();
        Thread.sleep(1000);
        driver.navigate().to("https://forms.gle/WT68aV5UnPajeoSc8");
        WebElement name = driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/div[2]/div/div[2]/div[1]/div/div/div[2]/div/div[1]/div/div[1]/input"));
        //  user_name
        name.sendKeys("Srinivasa Rao");
        WebElement number = driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div/div[1]/input"));
        // user_contact
        number.sendKeys("8919065048");
        WebElement email = driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/div[2]/div/div[2]/div[3]/div/div/div[2]/div/div[1]/div/div[1]/input"));
        // user_Email
        email.sendKeys("srinivas158.sc@gmail.com");
        WebElement address = driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/div[2]/div/div[2]/div[4]/div/div/div[2]/div/div[1]/div[2]/textarea"));
        // user_address
        address.sendKeys("Vijayawada Ap");
        WebElement pin = driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/div[2]/div/div[2]/div[5]/div/div/div[2]/div/div[1]/div/div[1]/input"));
        // user_PIN
        pin.sendKeys("520004");
        WebElement dob = driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/div[2]/div/div[2]/div[6]/div/div/div[2]/div/div/div[2]/div[1]/div/div[1]/input"));
        // user_date_of_birth
        dob.sendKeys("04051998");
        WebElement gender = driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/div[2]/div/div[2]/div[7]/div/div/div[2]/div/div[1]/div/div[1]/input"));
        // user_gender
        gender.sendKeys("Male");
        WebElement text = driver.findElement(By.xpath("//*[@id=\"i37\"]/span[1]/b"));
        
        String texts = text.getText();
        WebElement textVerify = driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/div[2]/div/div[2]/div[8]/div/div/div[2]/div/div[1]/div/div[1]/input"));
        // text verifying
        textVerify.sendKeys(texts);
        WebElement btn = driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/div[2]/div/div[3]/div[1]/div[1]/div/span"));
        // screen short 
        Thread.sleep(1000);
        File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        Files.copy(f,new File("C:\\Users\\srini\\Downloads\\sample\\Screenshort.jpg"));
        // submit button
        btn.click();
        
       driver.quit();
    }
}
