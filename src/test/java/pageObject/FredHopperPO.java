package pageObject;

import utilities.AllDrivers;
import org.openqa.selenium.By;

public class FredHopperPO extends AllDrivers {

    By mensTab = By.xpath("//a[@href='/men/shoes']");
    By productLlist = By.name("");
    By selectTrainers = By.xpath("//a[@href='/men/shoes/trainers']");
    By trainerList = By.name("");


    public void mensCategoryTab(){
        driver.findElement(mensTab).click();
    }

    public void mensProductList(){

    }
    public void trainersTab(){
        driver.findElement(selectTrainers).click();

    }
    public void mensTrainersList(){

    }


}
