import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

Actions actionList;
actionList = new Actions(driver);
WebElement webElement;
webElement = driver.findElement(By.cssSelector("[id="img_slideboard"]"));
