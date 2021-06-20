package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        dateDate.setValue(LocalDate.now());
    }

    //entering all the id's
    @FXML
    Button btnAdd;
    @FXML
    Button btnDel;
    @FXML
    TextField tfEvent;
    @FXML
    TextField tfHours;
    @FXML
    TextField tfMins;
    @FXML
    DatePicker dateDate;
    @FXML
    ListView<EventSettings> lvEvent;


    //create and populate a list view
    ObservableList<EventSettings> list = FXCollections.observableArrayList();

    //to add event to the listview.
    @FXML
    private void addEvent(Event a) {
        list.add(new EventSettings(dateDate.getValue(), tfHours.getText(), tfMins.getText(), tfEvent.getText()));
        lvEvent.setItems(list);
        clean();
    }

    //cleans the whole display after adding an event.
    private void clean() {
        dateDate.setValue(LocalDate.now());
        tfEvent.setText(null);
        tfHours.setText(null);
        tfMins.setText(null);
    }

    //to delete selected event from the listview.
    @FXML
    private void delEvent(Event a) {
        int selectedID = lvEvent.getSelectionModel().getSelectedIndex();
        lvEvent.getItems().remove(selectedID);


    }
}