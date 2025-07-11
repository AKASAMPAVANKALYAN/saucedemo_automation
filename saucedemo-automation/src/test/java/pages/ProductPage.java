package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
     WebDriver driver = BasePage.getDriver();

    public void selectProduct(int productNumber) throws InterruptedException {
        String[] productNames = {
            "Sauce Labs Backpack",
            "Sauce Labs Bike Light",
            "Sauce Labs Bolt T-Shirt",
            "Sauce Labs Fleece Jacket",
            "Sauce Labs Onesie",
            "Test.allTheThings() T-Shirt (Red)"
        };

        if (productNumber < 1 || productNumber > 6) {
            throw new IllegalArgumentException("Invalid product number");
        }

        driver.findElement(By.xpath("//div[text()='" + productNames[productNumber - 1] + "']")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("add-to-cart")).click();
        driver.findElement(By.className("shopping_cart_link")).click();
    }
}
