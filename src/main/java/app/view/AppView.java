package app.view;


import app.converter.TimeConverter;

public class AppView {

    public void runAppView() {
        String formattedDuration = TimeConverter.formatDurationInSeconds();
        System.out.println("Formatted Duration: " + formattedDuration);


    }
}
