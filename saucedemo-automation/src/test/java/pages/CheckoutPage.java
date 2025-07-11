package pages;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
     WebDriver driver = BasePage.getDriver();

    public void checkoutFromExcel(String path) throws IOException, InterruptedException {
        driver.findElement(By.id("checkout")).click();

        FileInputStream fis = new FileInputStream(path);
        Workbook book = WorkbookFactory.create(fis);

        String firstName = book.getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
        String lastName = book.getSheet("sheet1").getRow(0).getCell(1).getStringCellValue();
        int postalCode = (int) book.getSheet("sheet1").getRow(0).getCell(2).getNumericCellValue();

        driver.findElement(By.id("first-name")).sendKeys(firstName);
        driver.findElement(By.id("last-name")).sendKeys(lastName);
        driver.findElement(By.id("postal-code")).sendKeys(String.valueOf(postalCode));

        driver.findElement(By.id("continue")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("finish")).click();
        Thread.sleep(1000);
    }

    public void logout() throws InterruptedException {
        driver.findElement(By.id("react-burger-menu-btn")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("logout_sidebar_link")).click();
    }
}
