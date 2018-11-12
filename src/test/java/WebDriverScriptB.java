import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class WebDriverScriptB {
    public static void main(String[] args) throws InterruptedException {

      WebDriver driver = getDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

      driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");
      WebElement loginEmail = driver.findElement(By.id("email"));
      loginEmail.sendKeys("webinar.test@gmail.com");

      WebElement loginPassword = driver.findElement(By.id("passwd"));
      loginPassword.sendKeys("Xcg7299bnSmMuRLp9ITw");

      WebElement submitButton = driver.findElement(By.name("submitLogin"));
      submitButton.click();

      WebElement nmenuDash = driver.findElement(By.id("tab-AdminDashboard"));
      nmenuDash.click();
      sleep(5000);
      CheckTitle(driver);
      sleep(5000);

      WebElement nmenuOrders = driver.findElement(By.id("subtab-AdminParentOrders"));
      nmenuOrders.click();
      sleep(5000);
      CheckTitle(driver);
      sleep(5000);

      WebElement nmenuCatalog = driver.findElement(By.id("subtab-AdminCatalog"));
      nmenuCatalog.click();
      sleep(5000);
      CheckTitle(driver);
      sleep(5000);
/*
      WebElement nmenuCustomer = driver.findElement(By.id("subtab-AdminParentCustomer"));
      nmenuCustomer.click(); - При поиске по id для данного элемента выдает ошибку*/
      WebElement nmenuCustomer = driver.findElement(By.xpath("/html/body/nav/ul/li[5]"));
      nmenuCustomer.click();
      sleep(5000);
      CheckTitle(driver);
      sleep(5000);

      sleep(5000);

      WebElement nmenuServiceDesk = driver.findElement(By.id("subtab-AdminParentCustomerThreads"));
      nmenuServiceDesk.click();
      sleep(5000);
      CheckTitle(driver);
      sleep(5000);

      WebElement nmenuStats = driver.findElement(By.id("subtab-AdminStats"));
      nmenuStats.click();
      sleep(5000);
      CheckTitle(driver);
      sleep(5000);
      WebElement nmenuModules = driver.findElement(By.id("subtab-AdminParentModulesSf"));
      nmenuModules.click();
      sleep(5000);
      CheckTitle(driver);
      sleep(5000);

      WebElement nmenuDesign = driver.findElement(By.xpath("/html/body/nav/ul/li[10]"));
      nmenuDesign.click();
      sleep(5000);
      CheckTitle(driver);
      sleep(5000);

      WebElement nmenuShipping = driver.findElement(By.id("subtab-AdminParentShipping"));
      nmenuShipping.click();
      sleep(5000);
      CheckTitle(driver);
      sleep(5000);

      WebElement nmenuPayment = driver.findElement(By.id("subtab-AdminParentPayment"));
      nmenuPayment.click();
      sleep(5000);
      CheckTitle(driver);
      sleep(5000);

      WebElement nmenuInter = driver.findElement(By.id("subtab-AdminInternational")); // html/body/nav/ul/li[13]"));
      nmenuInter.click();
      sleep(5000);
      CheckTitle(driver);
      sleep(5000);

      WebElement nmenuShopParam = driver.findElement(By.id("subtab-ShopParameters"));
      nmenuShopParam.click();
      sleep(5000);
      CheckTitle(driver);
      sleep(5000);

      WebElement nmenuConfig = driver.findElement(By.id("subtab-AdminAdvancedParameters"));
      nmenuConfig.click();
      sleep(5000);
      CheckTitle(driver);
      sleep(5000);

      WebElement dropdownImage = driver.findElement(By.id("employee_infos"));
      dropdownImage.click();

      WebElement logoutBtn = driver.findElement(By.id("header_logout"));
      logoutBtn.click();

      driver.quit();


    }
    public static void CheckTitle(WebDriver m)   {
      String currentTitle = m.getTitle();
      System.out.println(currentTitle);
      m.navigate().refresh();
      String newTitle = m.getTitle();
      if (currentTitle.compareTo(newTitle) != 0)
        System.out.println("Titles is not identical");
      else
        System.out.println("Titles is identical");
  }

    public static WebDriver getDriver() {
      System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "//resources//chromedriver.exe");
      return new ChromeDriver();
    }

  }

