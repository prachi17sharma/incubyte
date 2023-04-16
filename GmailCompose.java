package firefox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class GmailCompose {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.get("https://mail.google.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.name("identifier")).sendKeys("incubytePrachi");
        driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
        driver.findElement(By.name("Passwd")).sendKeys("incubyteprachi@17");
        driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/span")).click();
        driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[2]/div[1]/div[1]/div/div")).click();
        driver.findElement(By.id(":83")).sendKeys("Incubyte Deliverables:1");
        driver.findElement(By.xpath("//*[@id=\":9c\"]")).sendKeys("Automation QA test for Incubyte");

    }
}
