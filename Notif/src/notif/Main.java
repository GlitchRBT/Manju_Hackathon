
package notif;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Manju
 */
public class Main extends Application{
    
    
            Stage window;
            Button button;
        
        
    public static void main(String[] args) {
            launch(args);  
    }

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        window.setTitle("Alert!!!");
        
        //XXX name of the patient
        button = new Button("Motion has been detected for patient xxx!!");
        
        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 300, 100);
        window.setScene(scene);
        window.show();
    }
    
}
