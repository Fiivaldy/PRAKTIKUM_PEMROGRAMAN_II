package org.example.module06;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class StudentController {
    @FXML
    private TableView<Student> studentTable;
    @FXML
    private TableColumn<Student, String> studentIdCol;
    @FXML
    private TableColumn<Student, String> nameCol;

    @FXML
    public void initialize(){
        studentIdCol.setCellValueFactory(new PropertyValueFactory<>("studentId"));
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        ObservableList<Student> studentList = FXCollections.observableArrayList(
                new Student(1, "Daffa", "251081721001"),
                new Student(2, "Ilmi", "251081721002"),
                new Student(3, "Denny","251081721003"),
                new Student(4, "Razak", "251081721004"),
                new Student(5, "Rifqi", "251081721005"),
                new Student(6, "Aufa", "251081721006"),
                new Student(7, "Riyadh", "251081721007"),
                new Student(8, "Nathan", "251081721008"),
                new Student(9, "Favian", "251081721009"),
                new Student(10, "Aziz", "2510817210010")
        );

        studentTable.setItems(studentList);
    }
}
