package day34_void_methods;

public class EtsySearchTest {
    public static void main(String[] args) {
openBrowser();
navigateToEtsyUrl();
searchForWoodenSpoon();
verifyResultsAreDisplayed();
        System.out.println("------ Etsy Search Smoke Test Completed ------Pass--------");

    }
    public static void openBrowser(){
        System.out.println(" Launching Chrome Browser");
    }
    public static void navigateToEtsyUrl(){
        System.out.println(" Navigate to https://www.etsy.com");
    }
    public static void searchForWoodenSpoon(){
        System.out.println(" PASS: verify Etsy homepage is being displayed");
        System.out.println(" Type 'Wooden Spoon' in search field and click search");
    }
    public static void verifyResultsAreDisplayed(){
        System.out.println(" PASS: Search Results are being displayed");
    }
}
