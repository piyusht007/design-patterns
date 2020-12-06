package com.piyush.creational.abstractfactory;

import org.junit.jupiter.api.Test;

public class AbstractFactoryTest {

    @Test
    public void testAbstractFactory(){
        final WidgetFactory darkWidgetFactory = DarkWidgetFactory.INSTANCE;
        final WidgetFactory brightWidgetFactory = BrightWidgetFactory.INSTANCE;

        createWidget(darkWidgetFactory);
        createWidget(brightWidgetFactory);
    }

    private static void createWidget(WidgetFactory widgetFactory){
        widgetFactory.createButton();
        widgetFactory.createWindow();
    }
}
