package visao;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.css.PseudoClass;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class ControlePrincipal implements Initializable{

    @FXML
    private AnchorPane AnchorPai;

    @FXML
    private TextField CadastrarVacinaDoseTextField;

    @FXML
    private TextField CadastrarVacinaLoteTextField;

    @FXML
    private TextField CadastrarVacinaMarcaTextField;

    @FXML
    private TextField CadastrarVacinaTipoTextField;

    @FXML
    private AnchorPane anchorGerador;

    @FXML
    private AnchorPane cadastrarProfissionalAnchorPane;

    @FXML
    private Button cadastrarProfissionalButton;

    @FXML
    private AnchorPane cadastrarUsuarioAnchorPane;

    @FXML
    private Button cadastrarUsuarioButton;

    @FXML
    private AnchorPane cadastrarVacinaAnchorPane;

    @FXML
    private Button cadastrarVacinaButton;

    @FXML
    private ImageView exitButton;

    @FXML
    private AnchorPane pesquisarAnchorPane;

    @FXML
    private Button pesquisarUsuarioButton;

    @FXML
    private AnchorPane usuarioPesquisadoAnchorPane;

    public static final PseudoClass CLASSE = PseudoClass.getPseudoClass("STYLE.css");


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // TODO Auto-generated method stub




        // BOTOES BOTOES BOTOES BOTOES BOTOES BOTOES
        exitButton.setOnMouseClicked(Event ->{
            Stage stage;
            stage = (Stage)AnchorPai.getScene().getWindow();
            stage.close();
        });

        pesquisarUsuarioButton.setOnMouseEntered(Event ->{
            pesquisarUsuarioButton.setStyle("-fx-Background-Color: #582fc8;");
        });

        pesquisarUsuarioButton.setOnMouseExited(Event ->{
            pesquisarUsuarioButton.setStyle("-fx-Background-Color: #2C1764;");
        });

        pesquisarUsuarioButton.setOnMouseClicked(Event -> {
            pesquisarAnchorPane.setVisible(true);
            cadastrarUsuarioAnchorPane.setVisible(false);
            cadastrarProfissionalAnchorPane.setVisible(false);
            cadastrarVacinaAnchorPane.setVisible(false);
        });

        cadastrarUsuarioButton.setOnMouseEntered(Event ->{
            cadastrarUsuarioButton.setStyle("-fx-Background-Color: #582fc8;");
        });

        cadastrarUsuarioButton.setOnMouseExited(Event ->{
            cadastrarUsuarioButton.setStyle("-fx-Background-Color: #2C1764;");
        });

        cadastrarUsuarioButton.setOnMouseClicked(Event -> {
            cadastrarUsuarioAnchorPane.setVisible(true);
            pesquisarAnchorPane.setVisible(false);
            cadastrarProfissionalAnchorPane.setVisible(false);
            cadastrarVacinaAnchorPane.setVisible(false);
        });

        cadastrarProfissionalButton.setOnMouseEntered(Event ->{
            cadastrarProfissionalButton.setStyle("-fx-Background-Color: #582fc8;");
        });

        cadastrarProfissionalButton.setOnMouseExited(Event ->{
            cadastrarProfissionalButton.setStyle("-fx-Background-Color: #2C1764;");
        });

        cadastrarProfissionalButton.setOnMouseClicked(Event -> {
            pesquisarAnchorPane.setVisible(false);
            cadastrarUsuarioAnchorPane.setVisible(false);
            cadastrarProfissionalAnchorPane.setVisible(true);
            cadastrarVacinaAnchorPane.setVisible(false);
        });

        cadastrarVacinaButton.setOnMouseEntered(Event ->{
            cadastrarVacinaButton.setStyle("-fx-Background-Color: #582fc8;");
        });

        cadastrarVacinaButton.setOnMouseExited(Event ->{
            cadastrarVacinaButton.setStyle("-fx-Background-Color: #2C1764;");
        });

        cadastrarVacinaButton.setOnMouseClicked(Event -> {
            pesquisarAnchorPane.setVisible(false);
            cadastrarUsuarioAnchorPane.setVisible(false);
            cadastrarProfissionalAnchorPane.setVisible(false);
            cadastrarVacinaAnchorPane.setVisible(true);
        });


        
    }


}
