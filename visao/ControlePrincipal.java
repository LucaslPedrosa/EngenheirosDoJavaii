package visao;

import controle.*;
import modelo.*;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.css.PseudoClass;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ControlePrincipal implements Initializable {

    @FXML
    private AnchorPane AnchorPai;

    @FXML
    private AnchorPane anchorGerador;

    @FXML
    private TextField buscarPesquisarUsuarioTextField;

    @FXML
    private Button cadastrarProfissionalAction;

    @FXML
    private AnchorPane cadastrarProfissionalAnchorPane;

    @FXML
    private Button cadastrarProfissionalButton;

    @FXML
    private Button cadastrarUsuarioAction;

    @FXML
    private AnchorPane cadastrarUsuarioAnchorPane;

    @FXML
    private Button cadastrarUsuarioButton;

    @FXML
    private Button cadastrarVacinaAction;

    @FXML
    private AnchorPane cadastrarVacinaAnchorPane;

    @FXML
    private Button cadastrarVacinaButton;

    @FXML
    private TextArea comorbidadesCadastrarUsuarioTextArea;

    @FXML
    private TextField cpfCadastrarUsuarioTextField;

    @FXML
    private TextField dataCadastrarVacinaTextField;

    @FXML
    private TextField enderecoCadastrarProfissionalTextField;

    @FXML
    private ImageView exitButton;

    @FXML
    private TextField idCadastrarProfissionalTextField;

    @FXML
    private TextField loteCadastrarVacinaTextField;

    @FXML
    private TextField marcaCadastrarVacinaTextField;

    @FXML
    private DatePicker nascimentoCadastrarUsuarioTextField;

    @FXML
    private TextField nomeCadastrarProfissionalTextField;

    @FXML
    private TextField nomeCadastrarUsuarioTextField;

    @FXML
    private AnchorPane pesquisarAnchorPane;

    @FXML
    private Button pesquisarUsuarioAction;

    @FXML
    private Button pesquisarUsuarioButton;

    @FXML
    private Button pesquisarVacinaAdicionarVacinaButton;

    @FXML
    private TextField rgCadastrarUsuarioTextField;

    @FXML
    private ComboBox<String> sexoCadastrarUsuarioTextField;
    String[] sexoCadastrarUsuario = { "Masculino", "Feminino", "Outrx" };

    @FXML
    private Label nomeResultLabel;

    @FXML
    private ComboBox<String> adicionarVacinaPesquisarComboBox;

    @FXML
    private Label VacinasResultLabel;

    @FXML
    private Label cpfResultLabel;

    @FXML
    private Label rgResultLabel;

    @FXML
    private Label sexoResultLabel;

    @FXML
    private Label nascimentoResultLabel;

    @FXML
    private Label comorbidadesResultLabel;

    @FXML
    private TextField tipoCadastrarVacinaTextField;

    @FXML
    private AnchorPane usuarioPesquisadoAnchorPane;

    public static final PseudoClass CLASSE = PseudoClass.getPseudoClass("STYLE.css");

    ProfSaudeControle profSaudeControle = new ProfSaudeControle();
    VacinaControle vacinaControle = new VacinaControle();
    VacinanteControle vacinanteControle = new VacinanteControle();

    private long selectedVacinne = 0;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        sexoCadastrarUsuarioTextField.getItems().addAll(sexoCadastrarUsuario);

        adicionarVacinaPesquisarComboBox.getItems().addAll("Não há vacinas disponiveis");

        adicionarVacinaPesquisarComboBox.setOnMouseClicked(Event -> {
            try {
                // .toArray(new String[vacinaControle.listarVacina().size()])
                ArrayList<Vacina> vacinass = vacinaControle.listarVacina();
                String[] vacinasBoxString = new String[vacinass.size()];

                for (int i = 0; i < vacinass.size(); i++) {
                    vacinasBoxString[i] = vacinass.get(i).getTipo();
                }

                if (vacinass.size() != 0) {
                    adicionarVacinaPesquisarComboBox.getItems().setAll(vacinasBoxString);
                }


            } catch (Exception e) {
                System.out.println(e.toString());
            }
        });

        // BOTOES BOTOES BOTOES BOTOES BOTOES BOTOES

        pesquisarVacinaAdicionarVacinaButton.setOnMouseClicked(Event -> {
            String a = VacinasResultLabel.getText();
            a += "\n";
            a += adicionarVacinaPesquisarComboBox.getValue();
            VacinasResultLabel.setText(a);



        });


        exitButton.setOnMouseClicked(Event -> {
            Stage stage;
            stage = (Stage) AnchorPai.getScene().getWindow();
            stage.close();
        });

        pesquisarUsuarioButton.setOnMouseEntered(Event -> {
            pesquisarUsuarioButton.setStyle("-fx-Background-Color: #582fc8;");
        });

        pesquisarUsuarioButton.setOnMouseExited(Event -> {
            pesquisarUsuarioButton.setStyle("-fx-Background-Color: #2C1764;");
        });

        pesquisarUsuarioAction.setOnMouseEntered(Event -> {
            pesquisarUsuarioAction.setStyle("-fx-Background-Color: #582fc8;");
        });

        pesquisarUsuarioAction.setOnMouseExited(Event -> {
            pesquisarUsuarioAction.setStyle("-fx-Background-Color: #2C1764;");
        });

        pesquisarVacinaAdicionarVacinaButton.setOnMouseEntered(Event -> {
            pesquisarVacinaAdicionarVacinaButton.setStyle("-fx-Background-Color: #582fc8;");
        });

        pesquisarVacinaAdicionarVacinaButton.setOnMouseExited(Event -> {
            pesquisarVacinaAdicionarVacinaButton.setStyle("-fx-Background-Color: #2C1764;");
        });

        cadastrarUsuarioAction.setOnMouseExited(Event -> {
            cadastrarUsuarioAction.setStyle("-fx-Background-Color: #2C1764;");
        });

        cadastrarUsuarioAction.setOnMouseEntered(Event -> {
            cadastrarUsuarioAction.setStyle("-fx-Background-Color: #582fc8;");
        });

        cadastrarProfissionalAction.setOnMouseEntered(Event -> {
            cadastrarProfissionalAction.setStyle("-fx-Background-Color: #582fc8;");
        });

        cadastrarProfissionalAction.setOnMouseExited(Event -> {
            cadastrarProfissionalAction.setStyle("-fx-Background-Color: #2C1764;");
        });

        cadastrarVacinaAction.setOnMouseExited(Event -> {
            cadastrarVacinaAction.setStyle("-fx-Background-Color: #2C1764;");
        });

        cadastrarVacinaAction.setOnMouseEntered(Event -> {
            cadastrarVacinaAction.setStyle("-fx-Background-Color: #582fc8;");
        });

        pesquisarUsuarioButton.setOnMouseClicked(Event -> {
            pesquisarAnchorPane.setVisible(true);
            cadastrarUsuarioAnchorPane.setVisible(false);
            cadastrarProfissionalAnchorPane.setVisible(false);
            cadastrarVacinaAnchorPane.setVisible(false);

        });

        cadastrarUsuarioButton.setOnMouseEntered(Event -> {
            cadastrarUsuarioButton.setStyle("-fx-Background-Color: #582fc8;");
        });

        cadastrarUsuarioButton.setOnMouseExited(Event -> {
            cadastrarUsuarioButton.setStyle("-fx-Background-Color: #2C1764;");
        });

        cadastrarUsuarioButton.setOnMouseClicked(Event -> {
            cadastrarUsuarioAnchorPane.setVisible(true);
            pesquisarAnchorPane.setVisible(false);
            cadastrarProfissionalAnchorPane.setVisible(false);
            cadastrarVacinaAnchorPane.setVisible(false);
        });

        cadastrarProfissionalButton.setOnMouseEntered(Event -> {
            cadastrarProfissionalButton.setStyle("-fx-Background-Color: #582fc8;");
        });

        cadastrarProfissionalButton.setOnMouseExited(Event -> {
            cadastrarProfissionalButton.setStyle("-fx-Background-Color: #2C1764;");
        });

        cadastrarProfissionalButton.setOnMouseClicked(Event -> {
            pesquisarAnchorPane.setVisible(false);
            cadastrarUsuarioAnchorPane.setVisible(false);
            cadastrarProfissionalAnchorPane.setVisible(true);
            cadastrarVacinaAnchorPane.setVisible(false);
        });

        cadastrarVacinaButton.setOnMouseEntered(Event -> {
            cadastrarVacinaButton.setStyle("-fx-Background-Color: #582fc8;");
        });

        cadastrarVacinaButton.setOnMouseExited(Event -> {
            cadastrarVacinaButton.setStyle("-fx-Background-Color: #2C1764;");
        });

        cadastrarVacinaButton.setOnMouseClicked(Event -> {
            pesquisarAnchorPane.setVisible(false);
            cadastrarUsuarioAnchorPane.setVisible(false);
            cadastrarProfissionalAnchorPane.setVisible(false);
            cadastrarVacinaAnchorPane.setVisible(true);

        });
    }

    public void cadastrarUsuario(ActionEvent event) throws Exception {
        String nome = nomeCadastrarUsuarioTextField.getText();
        long cpf = Long.parseLong(cpfCadastrarUsuarioTextField.getText());
        String sexu = sexoCadastrarUsuarioTextField.getValue();
        String nascimento = nascimentoCadastrarUsuarioTextField.getValue().toString();
        String comorbidades = comorbidadesCadastrarUsuarioTextArea.getText();

        vacinanteControle.cadastrarVacinante(nome, sexu, nascimento, comorbidades, cpf);
    }

    public void cadastrarProfissional(ActionEvent event) throws Exception {
        String nome = nomeCadastrarProfissionalTextField.getText();
        long id = Long.parseLong(idCadastrarProfissionalTextField.getText());
        String endereco = enderecoCadastrarProfissionalTextField.getText();

        profSaudeControle.cadastrar(nome, endereco, id);
    }

    public void pesquisarUsuario(ActionEvent event) throws Exception {
        long cpf = Long.parseLong(buscarPesquisarUsuarioTextField.getText());
        usuarioPesquisadoAnchorPane.setVisible(true);
        Vacinante vacinante = vacinanteControle.pesquisarVacinante(cpf);
        nomeResultLabel.setText(vacinante.getNome());
        cpfResultLabel.setText(String.valueOf(vacinante.getCPF()));
        rgResultLabel.setText(String.valueOf(vacinante.getRG()));
        sexoResultLabel.setText(vacinante.getSexo());
        nascimentoResultLabel.setText(vacinante.getNascimento());
        comorbidadesResultLabel.setText(vacinante.getProblemasDeSaude());
        VacinasResultLabel.setText("");
    }

    public void cadastrarVacina(ActionEvent event) throws Exception {
        String tipo = tipoCadastrarVacinaTextField.getText();
        String marca = marcaCadastrarVacinaTextField.getText();
        long lote = Long.parseLong(loteCadastrarVacinaTextField.getText());
        String data = dataCadastrarVacinaTextField.getText();

        vacinaControle.cadastrarVacina(tipo, data, marca, lote);
    }
}