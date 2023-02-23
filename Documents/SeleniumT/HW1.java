package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");

        driver.findElement(By.id("customer.firstName")).sendKeys("Natalia");
        driver.findElement(By.id("customer.lastName")).sendKeys("Gusina");
        driver.findElement(By.name("customer.address.street")).sendKeys("15 Barncroft Road ");
        driver.findElement(By.name("customer.address.city")).sendKeys("Loughton");
        driver.findElement(By.id("customer.address.state")).sendKeys("Essex");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("IG103EY");
        driver.findElement(By.name("customer.phoneNumber")).sendKeys("7881378381");
        driver.findElement(By.id("customer.ssn")).sendKeys("108904");
        driver.findElement(By.id("customer.username")).sendKeys("natal1s");
        driver.findElement(By.id("customer.password")).sendKeys("abracadabra");
        driver.findElement(By.id("repeatedPassword")).sendKeys("abracadabra");
        driver.findElement(By.className("button")).click();
        driver.close();

    }
}
