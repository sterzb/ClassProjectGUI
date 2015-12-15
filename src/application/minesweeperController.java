/**
 * Sample Skeleton for 'GUIClassProject.fxml' Controller Class
 */

package application;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class minesweeperController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="score"
    private Text score; // Value injected by FXMLLoader

    @FXML // fx:id="mainMenu"
    private MenuButton mainMenu; // Value injected by FXMLLoader

    @FXML // fx:id="players"
    private MenuItem players; // Value injected by FXMLLoader

    @FXML // fx:id="newGame"
    private MenuItem newGame; // Value injected by FXMLLoader

    @FXML // fx:id="name"
    private Text name; // Value injected by FXMLLoader

    @FXML // fx:id="tileChecker"
    private Button tileChecker; // Value injected by FXMLLoader

    @FXML // fx:id="HeaderText"
    private Text HeaderText; // Value injected by FXMLLoader

    @FXML // fx:id="ColEntryTF"
    private TextField ColEntryTF; // Value injected by FXMLLoader

    @FXML // fx:id="scoreboxTF"
    private TextArea scoreboxTF; // Value injected by FXMLLoader

    @FXML // fx:id="rowEntryTF"
    private TextField rowEntryTF; // Value injected by FXMLLoader

    @FXML // fx:id="board"
    private Label board; // Value injected by FXMLLoader

	private int points;

    @FXML
    void drawboard(ActionEvent event) {
    ((application.board) board).drawBoard();
    }

    @FXML
    void tileChecker(ActionEvent event) {
     tileMaker.tileChecker(rowEntryTF, ColEntryTF);
    }

    @FXML
    void tileChecker11(ActionEvent event) {
    	tileMaker.tileChecker(rowEntryTF, ColEntryTF);
    }

    @FXML
    void tileChecker1(ActionEvent event) {
    	tileMaker.tileChecker(rowEntryTF, ColEntryTF);
    }

    @FXML
    void score1(ActionEvent event) {
    statistics.totalScore(points);
    }

    @FXML
    void score(ActionEvent event) {

    }

    @FXML
    void d72109(ActionEvent event) {

    }

    @FXML
    void 2e33void c7(ActionEvent event) {

    }

    @FXML
    void gamemain(ActionEvent event) {
    	((application.label) board).startBoard();
    }

    @FXML
    void Players(ActionEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert score != null : "fx:id=\"score\" was not injected: check your FXML file 'GUIClassProject.fxml'.";
        assert mainMenu != null : "fx:id=\"mainMenu\" was not injected: check your FXML file 'GUIClassProject.fxml'.";
        assert players != null : "fx:id=\"players\" was not injected: check your FXML file 'GUIClassProject.fxml'.";
        assert newGame != null : "fx:id=\"newGame\" was not injected: check your FXML file 'GUIClassProject.fxml'.";
        assert name != null : "fx:id=\"name\" was not injected: check your FXML file 'GUIClassProject.fxml'.";
        assert tileChecker != null : "fx:id=\"tileChecker\" was not injected: check your FXML file 'GUIClassProject.fxml'.";
        assert HeaderText != null : "fx:id=\"HeaderText\" was not injected: check your FXML file 'GUIClassProject.fxml'.";
        assert ColEntryTF != null : "fx:id=\"ColEntryTF\" was not injected: check your FXML file 'GUIClassProject.fxml'.";
        assert scoreboxTF != null : "fx:id=\"scoreboxTF\" was not injected: check your FXML file 'GUIClassProject.fxml'.";
        assert rowEntryTF != null : "fx:id=\"rowEntryTF\" was not injected: check your FXML file 'GUIClassProject.fxml'.";
        assert board != null : "fx:id=\"board\" was not injected: check your FXML file 'GUIClassProject.fxml'.";

    }
}
