package workoutbuddy.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class WorkoutBuddyController implements Initializable{

    @FXML
    private VBox workoutBuddyController;
    @FXML
    private VBox contentController;

    @FXML
    private Button workoutsButton;
    @FXML
    private Button exercisesButton;
    @FXML
    private Button bodyStatsButton;
    @FXML
    private Button logsButton;

    @FXML
    private Button settingsIcon;
    @FXML
    private Button plusIcon;
    @FXML
    private Button homeIcon;


    @FXML
    public void openWorkouts() {
        int indexOfContent = workoutBuddyController.getChildren().indexOf(contentController);
        workoutBuddyController.getChildren().remove(indexOfContent);

        try {
            contentController = FXMLLoader.load(getClass().getResource("workouts.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        contentController.setMaxHeight(Double.MAX_VALUE);
        contentController.setPrefHeight(Region.USE_COMPUTED_SIZE);
        contentController.setVgrow(contentController, Priority.ALWAYS);
        workoutBuddyController.getChildren().add(indexOfContent, contentController);

        displayPlusIcon();
        displayHomeIcon();
    }

    @FXML
    public void openExercises() {
        int indexOfContent = workoutBuddyController.getChildren().indexOf(contentController);
        workoutBuddyController.getChildren().remove(indexOfContent);

        try {
            contentController = FXMLLoader.load(getClass().getResource("exercises.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        contentController.setMaxHeight(Double.MAX_VALUE);
        contentController.setPrefHeight(Region.USE_COMPUTED_SIZE);
        contentController.setVgrow(contentController, Priority.ALWAYS);
        workoutBuddyController.getChildren().add(indexOfContent, contentController);

        displayPlusIcon();
        displayHomeIcon();
    }

    @FXML
    public void openBodyStats() {

    }

    @FXML
    public void openLogs() {

    }

    @FXML
    public void openSettings() {

    }

    @FXML
    public void addItem() {

    }

    @FXML
    public void openHome() {
        int indexOfContent = workoutBuddyController.getChildren().indexOf(contentController);
        workoutBuddyController.getChildren().remove(indexOfContent);

        try {
            contentController = FXMLLoader.load(getClass().getResource("inspiration.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        contentController.setMaxHeight(Double.MAX_VALUE);
        contentController.setPrefHeight(Region.USE_COMPUTED_SIZE);
        contentController.setVgrow(contentController, Priority.ALWAYS);
        workoutBuddyController.getChildren().add(indexOfContent, contentController);


        displaySettingsIcon();
        hideHomeIcon();
    }

    private void displayHomeIcon() {
        homeIcon.setVisible(true);
    }

    private void hideHomeIcon() {
        homeIcon.setVisible(false);
    }

    private void displayPlusIcon() {
        settingsIcon.setVisible(false);
        plusIcon.setVisible(true);
    }

    private void displaySettingsIcon() {
        settingsIcon.setVisible(true);
        plusIcon.setVisible(false);
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
