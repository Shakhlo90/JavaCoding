package ClassProject2;

public class TestWebDriver {
    public static void main(String[] args) {


RemoteWebDriver [] arr={new FireFoxDriver(),new SafariDriver(), new ChromeDriver()};
for(RemoteWebDriver arr1: arr){
    arr1.open();
    arr1.navigate();
    arr1.getTitle();
    arr1.close();

}

    }
}
