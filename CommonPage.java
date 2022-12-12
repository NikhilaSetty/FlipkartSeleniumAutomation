package PageObjects;

import org.openqa.selenium.By;

public class CommonPage {
	
	//Advertise
	public static By Advertiselink = By.xpath("//span[contains(text(),'Advertise')]");
	public static By ContactUs = By.xpath("/html/body/app-root/flipscore-ext/app-header-home/header/div[3]/nav/span/a");
	
	//Become a seller
	public static By StartSelling = By.xpath("//div[contains(text(),'Start Selling')]");
	
	//Cart
	public static By PriceDetails = By.xpath("//span[contains(text(),'Price details')]");
	
	//Coupons
	public static By MyAccount = By.xpath("//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]");
	public static By Coupon = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]");
	public static By AvailableCoupons =By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[1]/div");
	
	//Fashion
	public static By Fashionlink = By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[4]/a");
	public static By ViewAll = By.xpath("//*[@id=\"container\"]/div/div[3]/div[5]/div/div[1]/div/div/a");
	
	//My account
	public static By Myaccount = By.xpath("//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]");
	public static By PlusZone = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]");
	public static By CoinBalance =By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[1]/div");

	public static By GiftCards = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]");
	public static By MyCoinBalance = By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[1]/div");

	public static By logOut = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]");
	public static By logIn =By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[1]/div");
	
	public static By MobilesTablets = By.xpath("//div[contains(text(),'Mobiles & Tablets')]");
	public static By BigSale = By.xpath("//h1[contains(text(),'Mobile Phones Big Dussehra Sale')]");
	
	public static By MyProfile = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]");
	public static By HelloText = By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[1]/div");
	
	public static By Orders = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]");
	
	public static By ReturnPolicy =By.xpath("//*[@id=\"container\"]/div/footer/div/div[3]/div[1]/div[3]/a[1]");
	public static By ReturnPolicyText = By.xpath("//*[@id=\"returns-policy\"]");
	
	public static By SearchLink = By.xpath("//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/input[1]");
	public static By SortBy = By.xpath("//span[contains(text(),'Sort By')]");
	
	public static By SuperCoinZone = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]");
	public static By ViewCoinActivity = By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[1]/div");
	
	public static By TopOffers =By.xpath("//div[contains(text(),'Top Offers')]");
	public static By Viewall = By.xpath("/html/body/div/div/div[3]/div[2]/div/div[1]/div/div/a");
	
	public static By Mywishlist = By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[1]/div");
	public static By Wishlistlink = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]");
	
	public static By Invalidlogintext = By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/span[3]/span");
	
	public static By Notifications=By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]");
	public static By AllNotifications=By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/div/div/div/div[1]");
}
