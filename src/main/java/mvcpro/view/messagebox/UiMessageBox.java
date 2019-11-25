package mvcpro.view.messagebox;

import javafx.application.Application;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class UiMessageBox{

    private static String title;
    private static String text;
    private static UiMessageBox uiMessageBox=null;
    private double lastx_distance,lasty_distance;

    private  UiMessageBox(){
        uiMessageBox=new UiMessageBox();
    }


    public static UiMessageBox getUiMessageBox(){

        if(uiMessageBox==null)
            uiMessageBox=new UiMessageBox();
        return uiMessageBox;
    }

}
