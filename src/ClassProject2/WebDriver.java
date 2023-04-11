package ClassProject2;

public interface WebDriver {
    void open();
    void close();
    void  getTitle();
}

 interface TakesScreenshot  extends WebDriver{
    void getScreenshot();
}





 interface RemoteWebDriver extends WebDriver,TakesScreenshot{



     void navigate();
}
