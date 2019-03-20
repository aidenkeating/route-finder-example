package application.JavaFxControllers;

import java.awt.Button;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.ImageView;

public class MainMenuController {
	@FXML
	MenuBar menuBar;
	@FXML
	Menu helpMenu, fileMenu;
	@FXML
	MenuItem refreshMenuItem, exitMenuItem, aboutMenuItem;
	@FXML
	ImageView backgroundImageView, mapImageView;
	@FXML
	Button findRoutesButton;
	@FXML
	ChoiceBox originChoiceBox, destinationChoiceBox, waypointChoiceBox, avoidChoiceBox;

}
