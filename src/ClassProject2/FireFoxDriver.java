package ClassProject2;

public class FireFoxDriver implements RemoteWebDriver {
    @Override
    public void open() {
        System.out.println("FireFoxDriver is opened");

    }

    @Override
    public void close() { System.out.println("FireFoxDriver is closed");


    }

    @Override
    public void  getTitle() { System.out.println("FaceBookWebSite is  displayed");


    }

    @Override
    public void navigate() {
        System.out.println("WebPage is navigated to FaceBookWebSite");

    }

    @Override
    public void getScreenshot() {
        System.out.println("WebPageScreenshot  is taken ");

    }
}



