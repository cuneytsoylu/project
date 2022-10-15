package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SpendinGoodPage {

    public SpendinGoodPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }




  /* US_01 (20 satır) */




















    /*US_02(20 satır)*/




















    /*US_03(20 satır)*/





















    /*US_04(20 satır)*/




















    /*US_05(20 satır)*/
    @FindBy (xpath ="//*[text()='Store Manager']")
    public WebElement storeManager;

    @FindBy (xpath ="(//*[@class='text'])[4]")
    public WebElement storeManagerProducts;

    @FindBy (xpath ="(//*[@style='width: 98px;']")
    public WebElement status;

    @FindBy (xpath ="(//*[@style='width: 59px;']")
    public WebElement stock;

    @FindBy (xpath ="(//*[@style='width: 51px;']")
    public WebElement price;

    @FindBy (xpath ="(//*[@class='sorting_desc']")
    public WebElement date;

    @FindBy (xpath ="(//*[text()='Add New']")
    public WebElement addNew;

    @FindBy (xpath ="(//*[text()='Virtual']")
    public WebElement virtual;

    @FindBy (xpath ="(//*[text()='Downloadable']")
    public WebElement downloadable;

    @FindBy (xpath ="(//*[@id='pro_title']")
    public WebElement productTitle;

    @FindBy (xpath ="(//*[text()='Price ($)']")
    public WebElement priceMiktar;

    @FindBy (xpath ="(//*[@id='featured_img_display']")
    public WebElement urunIlkResimEkleme;

    @FindBy (xpath ="(//*[@id='gallery_img_gimage_0_display']")
    public WebElement urunIkinciResimEkleme;

    @FindBy (xpath ="(//*[text()='Short Description']")
    public WebElement shortDescrip;

    @FindBy (xpath ="(//*[text()='Description']")
    public WebElement description;

























    /*US_06(20 satır)*/




















    /*US_07(20 satır)*/




















    /*US_08(20 satır)*/




















    /*US_09(20 satır)*/




















    /*US_10(20 satır)*/




















    /*US_11(20 satır)*/




















    /*US_12(20 satır)*/




















    /*US_13(20 satır)*/




















    /*US_14(20 satır)*/




















    /*US_15(20 satır)*/




















    /*US_16(20 satır)*/




















    /*US_17(20 satır)*/




















    /*US_18(20 satır)*/




















    /*US_19(20 satır)*/




















    /*US_20(20 satır)*/




















    /*US_21(20 satır)*/




















    /*US_22(20 satır)*/

























}
