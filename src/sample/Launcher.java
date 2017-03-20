package sample;

import javafx.application.Platform;

import java.io.IOException;

/**
 * Created by lennart on 3/20/2017.
 * This class will handle launching minecraft and related functions
 */


class Launcher {

    void launchMinecraft(String location) {
        try {
            Runtime.getRuntime().exec("java -jar " + location +"launcher.jar" );
            Platform.exit();
            System.exit(0);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
