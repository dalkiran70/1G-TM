package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ChooseFactionMenuController extends CreateGameMenuController implements Initializable {

    @FXML
    Button backButton, playerQueue;

    @FXML
    ImageView wastelandFaction, forestFaction, lakesFaction, desertFaction, mountainsFaction, swampFaction, plainsFaction;

    @FXML
    ImageView wastelandFactionSelected, forestFactionSelected, lakesFactionSelected, desertFactionSelected, mountainsFactionSelected, swampFactionSelected, plainsFactionSelected;

    @FXML
    Button chooseVladTheImpaler, chooseGilgamesh, chooseMorganLeFay, chooseHelenOfTroy, chooseErikTheRed, chooseAmerigoVespucci, chooseDariusTheGreat, chooseRamessesII,
           chooseLeonardoDaVinci, chooseStPatrick, chooseMarieCurie, chooseAleisterCrowley, chooseBuddha, chooseHusseinTheTeaMaker;

    Image imProfile;

    public int numbersOfPlayer = 0;



    @FXML
    public void backButtonClicked( MouseEvent event) throws IOException {
        Stage stage;


        stage = (Stage) backButton.getScene().getWindow();
        Parent root = (Parent) FXMLLoader.load(getClass().getResource("/View/MenuViews/MainMenuView.fxml"));

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    public void vladTheImpalerSelected( MouseEvent event) throws IOException {
        wastelandFactionSelected.setVisible(true);
        chooseVladTheImpaler.setVisible(false);
        chooseGilgamesh.setVisible(false);
    }

    @FXML
    public void gilgameshSelected( MouseEvent event) throws IOException {
        wastelandFactionSelected.setVisible(true);
        chooseVladTheImpaler.setVisible(false);
        chooseGilgamesh.setVisible(false);
    }

    @FXML
    public void morganLeFaySelected( MouseEvent event) throws IOException {
        forestFactionSelected.setVisible(true);
        chooseMorganLeFay.setVisible(false);
        chooseHelenOfTroy.setVisible(false);
    }

    @FXML
    public void helenOfTroySelected( MouseEvent event) throws IOException {
        forestFactionSelected.setVisible(true);
        chooseMorganLeFay.setVisible(false);
        chooseHelenOfTroy.setVisible(false);
    }

    @FXML
    public void erikTheRedSelected( MouseEvent event) throws IOException {
        lakesFactionSelected.setVisible(true);
        chooseErikTheRed.setVisible(false);
        chooseAmerigoVespucci.setVisible(false);
    }

    @FXML
    public void amerigoVespucciSelected( MouseEvent event) throws IOException {
        lakesFactionSelected.setVisible(true);
        chooseErikTheRed.setVisible(false);
        chooseAmerigoVespucci.setVisible(false);
    }

    @FXML
    public void dariusTheGreatSelected( MouseEvent event) throws IOException {
        desertFactionSelected.setVisible(true);
        chooseDariusTheGreat.setVisible(false);
        chooseRamessesII.setVisible(false);
    }

    @FXML
    public void ramessesIISelected( MouseEvent event) throws IOException {
        desertFactionSelected.setVisible(true);
        chooseDariusTheGreat.setVisible(false);
        chooseRamessesII.setVisible(false);
    }

    @FXML
    public void leonardoDaVinciSelected( MouseEvent event) throws IOException {
        mountainsFactionSelected.setVisible(true);
        chooseLeonardoDaVinci.setVisible(false);
        chooseStPatrick.setVisible(false);
    }

    @FXML
    public void stPatrickSelected( MouseEvent event) throws IOException {
        mountainsFactionSelected.setVisible(true);
        chooseLeonardoDaVinci.setVisible(false);
        chooseStPatrick.setVisible(false);
    }

    @FXML
    public void marieCurieSelected( MouseEvent event) throws IOException {
        swampFactionSelected.setVisible(true);
        chooseMarieCurie.setVisible(false);
        chooseAleisterCrowley.setVisible(false);
    }

    @FXML
    public void aleisterCrowleySelected( MouseEvent event) throws IOException {
        swampFactionSelected.setVisible(true);
        chooseMarieCurie.setVisible(false);
        chooseAleisterCrowley.setVisible(false);
    }

    @FXML
    public void buddhaSelected( MouseEvent event) throws IOException {
        plainsFactionSelected.setVisible(true);
        chooseBuddha.setVisible(false);
        chooseHusseinTheTeaMaker.setVisible(false);
    }

    @FXML
    public void husseinTheTeaMakerSelected( MouseEvent event) throws IOException {
        plainsFactionSelected.setVisible(true);
        chooseBuddha.setVisible(false);
        chooseHusseinTheTeaMaker.setVisible(false);
    }

    @FXML
    public void onVladTheImpaler( MouseEvent event) throws IOException {
        chooseVladTheImpaler.setOpacity(100);
    }

    @FXML
    public void offVladTheImpaler( MouseEvent event) throws IOException {
        chooseVladTheImpaler.setOpacity(0);
    }

    @FXML
    public void onGilgamesh( MouseEvent event) throws IOException {
        chooseGilgamesh.setOpacity(100);
    }

    @FXML
    public void offGilgamesh( MouseEvent event) throws IOException {
        chooseGilgamesh.setOpacity(0);
    }

    @FXML
    public void onMorganLeFay( MouseEvent event) throws IOException {
        chooseMorganLeFay.setOpacity(100);
    }

    @FXML
    public void offMorganLeFay( MouseEvent event) throws IOException {
        chooseMorganLeFay.setOpacity(0);
    }

    @FXML
    public void onHelenOfTroy( MouseEvent event) throws IOException {
        chooseHelenOfTroy.setOpacity(100);
    }

    @FXML
    public void offHelenOfTroy( MouseEvent event) throws IOException {
        chooseHelenOfTroy.setOpacity(0);
    }

    @FXML
    public void onErikTheRed( MouseEvent event) throws IOException {
        chooseErikTheRed.setOpacity(100);
    }

    @FXML
    public void offErikTheRed( MouseEvent event) throws IOException {
        chooseErikTheRed.setOpacity(0);
    }

    @FXML
    public void onAmerigoVespucci( MouseEvent event) throws IOException {
        chooseAmerigoVespucci.setOpacity(100);
    }

    @FXML
    public void offAmerigoVespucci( MouseEvent event) throws IOException {
        chooseAmerigoVespucci.setOpacity(0);
    }

    @FXML
    public void onDariusTheGreat( MouseEvent event) throws IOException {
        chooseDariusTheGreat.setOpacity(100);
    }

    @FXML
    public void offDariusTheGreat( MouseEvent event) throws IOException {
        chooseDariusTheGreat.setOpacity(0);
    }

    @FXML
    public void onRamessesII( MouseEvent event) throws IOException {
        chooseRamessesII.setOpacity(100);
    }

    @FXML
    public void offRamessesII( MouseEvent event) throws IOException {
        chooseRamessesII.setOpacity(0);
    }

    @FXML
    public void onLeonardoDaVinci( MouseEvent event) throws IOException {
        chooseLeonardoDaVinci.setOpacity(100);
    }

    @FXML
    public void offLeonardoDaVinci( MouseEvent event) throws IOException {
        chooseLeonardoDaVinci.setOpacity(0);
    }

    @FXML
    public void onStPatrick( MouseEvent event) throws IOException {
        chooseStPatrick.setOpacity(100);
    }

    @FXML
    public void offStPatrick( MouseEvent event) throws IOException {
        chooseStPatrick.setOpacity(0);
    }

    @FXML
    public void onMarieCurie( MouseEvent event) throws IOException {
        chooseMarieCurie.setOpacity(100);
    }

    @FXML
    public void offMarieCurie( MouseEvent event) throws IOException {
        chooseMarieCurie.setOpacity(0);
    }

    @FXML
    public void onAleisterCrowley( MouseEvent event) throws IOException {
        chooseAleisterCrowley.setOpacity(100);
    }

    @FXML
    public void offAleisterCrowley( MouseEvent event) throws IOException {
        chooseAleisterCrowley.setOpacity(0);
    }

    @FXML
    public void onBuddha( MouseEvent event) throws IOException {
        chooseBuddha.setOpacity(100);
    }

    @FXML
    public void offBuddha( MouseEvent event) throws IOException {
        chooseBuddha.setOpacity(0);
    }

    @FXML
    public void onHusseinTheTeaMaker( MouseEvent event) throws IOException {
        chooseHusseinTheTeaMaker.setOpacity(100);
    }

    @FXML
    public void offHusseinTheTeaMaker( MouseEvent event) throws IOException {
        chooseHusseinTheTeaMaker.setOpacity(0);
    }





    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {



        imProfile = new Image(getClass().getResourceAsStream("/Images/ChooseFactionImages/wasteland.png"));
        wastelandFaction.setImage(imProfile);

        imProfile = new Image(getClass().getResourceAsStream("/Images/ChooseFactionImages/forest.png"));
        forestFaction.setImage(imProfile);

        imProfile = new Image(getClass().getResourceAsStream("/Images/ChooseFactionImages/lakes.png"));
        lakesFaction.setImage(imProfile);

        imProfile = new Image(getClass().getResourceAsStream("/Images/ChooseFactionImages/desert.png"));
        desertFaction.setImage(imProfile);

        imProfile = new Image(getClass().getResourceAsStream("/Images/ChooseFactionImages/mountains.png"));
        mountainsFaction.setImage(imProfile);

        imProfile = new Image(getClass().getResourceAsStream("/Images/ChooseFactionImages/swamp.png"));
        swampFaction.setImage(imProfile);

        imProfile = new Image(getClass().getResourceAsStream("/Images/ChooseFactionImages/plains.png"));
        plainsFaction.setImage(imProfile);

        //Selected views

        imProfile = new Image(getClass().getResourceAsStream("/Images/ChooseFactionImages/wastelandSelected.png"));
        wastelandFactionSelected.setImage(imProfile);

        imProfile = new Image(getClass().getResourceAsStream("/Images/ChooseFactionImages/forestSelected.png"));
        forestFactionSelected.setImage(imProfile);

        imProfile = new Image(getClass().getResourceAsStream("/Images/ChooseFactionImages/lakesSelected.png"));
        lakesFactionSelected.setImage(imProfile);

        imProfile = new Image(getClass().getResourceAsStream("/Images/ChooseFactionImages/desertSelected.png"));
        desertFactionSelected.setImage(imProfile);

        imProfile = new Image(getClass().getResourceAsStream("/Images/ChooseFactionImages/mountainsSelected.png"));
        mountainsFactionSelected.setImage(imProfile);

        imProfile = new Image(getClass().getResourceAsStream("/Images/ChooseFactionImages/swampSelected.png"));
        swampFactionSelected.setImage(imProfile);

        imProfile = new Image(getClass().getResourceAsStream("/Images/ChooseFactionImages/plainsSelected.png"));
        plainsFactionSelected.setImage(imProfile);




    }


}
