package day44_custom_classes;

public class MyApps {
    public static void main(String[] args) {
        App app=new App();
        app.name="Uber,";
        app.version=2.2;
        app.open();

        app.version=6.3;
        app.open();

        app.name="Facebook";
        app.version=35.5;
        app.open();

    }
}


