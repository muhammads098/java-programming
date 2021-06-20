package day55_abstraction.interface_demo;

public class ChromeDriver implements WebDriver{

    @Override
    public void get(String url) {
        System.out.println("ChromeDriver- navigating to "+url);
    }

    @Override
    public void findElement(String locator) {
        System.out.println("chromedriver - locating element by "+locator);

    }

    @Override
    public void quit() {
        System.out.println("chromedriver - quiting the driver");

    }

    @Override
    public String getTitle() {
        return "Wooden Spoon title";
    }
}
