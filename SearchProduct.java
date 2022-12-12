package PageObjects;
import org.openqa.selenium.By;

public class SearchProduct {
    public static By crossButton = By.xpath("/html/body/div[2]/div/div/button");
    public static By searchBar = By.name("q");
    public static By searchButton = By.xpath("//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/button[1]/*[1]");
}