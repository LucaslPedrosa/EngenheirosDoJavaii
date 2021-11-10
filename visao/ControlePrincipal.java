package visao;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class ControlePrincipal implements Initializable{

    @FXML
    private ImageView exitButton;

    @FXML
    private AnchorPane AnchorPai;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // TODO Auto-generated method stub

        exitButton.setOnMouseClicked(Event ->{
            Stage stage;
            stage = (Stage)AnchorPai.getScene().getWindow();
            stage.close();
        });

        exitButton.setOnMouseEntered(Event ->{
            
        });
        
    }


}
