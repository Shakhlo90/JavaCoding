package ClassProject2;

 class ChromeDriver implements RemoteWebDriver{

     @Override
     public void open() {
         System.out.println("ChromeDriver is opened");

     }

     @Override
     public void close() { System.out.println("ChromeDriver is closed");


     }

     @Override
     public void  getTitle() { System.out.println("Title is displayed");


     }

     @Override
     public void navigate() {
         System.out.println("WebPage is navigated to FeceBookWebSite");

     }

     @Override
     public void getScreenshot() {
         System.out.println("WebPageScreenshot  is taken ");

     }
 }

