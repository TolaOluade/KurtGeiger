package pageObject;

import utilities.AllDrivers;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DolceAndGabbanaPO extends AllDrivers {



    String baseUrl = "https://www.kurtgeiger.es/";
    By brandCategoryTab = By.xpath("//a[@href='/shop-by-brand']");
    By listOfBrands = By.name("");
    By dolceAndGabbanaTab = By.xpath("//a[@href='https://www.kurtgeiger.es/brands/dolce-gabbana']");
    By dolceAndGabbana_page = By.name("");


public void launchUrl(){
    driver.get(baseUrl);
}
    public void confirmHomepage() throws InterruptedException {
        String expectedText = "Shoes, Boots & Bags | Kurt Geiger";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText);
    }
    public void brandCategory(){
        driver.findElement(brandCategoryTab).click();
    }
    public void brandList(){
        WebDriverWait wait = new WebDriverWait(driver,10);
        boolean element = wait.until(ExpectedConditions.titleIs("Shop By Brand | Kurt Geiger"));
        boolean actualText = true;
        Assert.assertEquals(element, actualText);
    }
    public void dandGtab(){
        driver.findElement(dolceAndGabbanaTab).click();
    }
    public void dandGpage(){
        WebDriverWait wait = new WebDriverWait(driver,10);
        boolean element = wait.until(ExpectedConditions.titleIs("Dolce & Gabbana | Kids Shoes | Kurt Geiger"));
        boolean actualText = true;
        Assert.assertEquals(element, actualText);
    }

}
