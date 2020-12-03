package com.piyush.creational.abstractfactory;

public class Application {
    public void createWidget(WidgetFactory widgetFactory){
        widgetFactory.createButton();
        widgetFactory.createWindow();
    }

    public static void main(String[] args) {
        Application application = new Application();
        WidgetFactory darkWidgetFactory = DarkWidgetFactory.INSTANCE;
        WidgetFactory brightWidgetFactory = BrightWidgetFactory.INSTANCE;

        application.createWidget(darkWidgetFactory);
        application.createWidget(brightWidgetFactory);
    }
}
