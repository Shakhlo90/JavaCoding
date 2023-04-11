package ClassProject2;

public class SafariDriver implements RemoteWebDriver {
    @Override
    public void open() {
        System.out.println("SafariWebPage is opened");

    }

    @Override
    public void close() { System.out.println("SafariWebPage is closed");


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




