package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {
    /*
    HW2
navigate to fb.com
click on create new account
fill up all the text boxes
click on sign up button
close the pop up
close the browser

TIP for HW2:
just fill in text boxes or button, no need to deal with other webElements



also u will need a Thread.sleep after clicking on create new account
we will discuss "WHY" in future
*/
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");

        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(5000);
        driver.findElement(By.name("firstname")).sendKeys("Nata");
        driver.findElement(By.name("lastname")).sendKeys("Gusina");
        driver.findElement(By.name("reg_email__")).sendKeys("natagusina@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("abracadabra");
        driver.findElement(By.id("u_9_9_Fm")).click();
        driver.quit();






    }
}
