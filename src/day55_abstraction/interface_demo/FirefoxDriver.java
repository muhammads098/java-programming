package day55_abstraction.interface_demo;

public class FirefoxDriver implements WebDriver {

    @Override
    public void get(String url) {
        System.out.println("Firefox driver - navigating to "+url);
    }

    @Override
    public void findElement(String locator) {
        System.out.println("Firefox Driver - locating element "+locator);

    }

    @Override
    public void quit() {
        System.out.println("firefox driver -  quiting the driver");

    }

    @Override
    public String getTitle() {
        return "wooden spoon title";
    }
}
