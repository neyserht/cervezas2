package neyser.cervezas2;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.LinkedHashMap;
import java.util.Map;

public class HelloController {

    // Declaracion de mapas o diccionarios
    private Map<String, Double> cervezasRubias1 = new LinkedHashMap<>();
    private Map<String, Double> cervezasTostadas1 = new LinkedHashMap<>();
    private Map<String, Double> cervezasNegras1 = new LinkedHashMap<>();
    private int selector = 0;

    @FXML
    private Label label1;
    @FXML
    private Button button1;
    @FXML
    private ComboBox comboBox1, comboBox2;
    @FXML
    private RadioButton radioButton1, radioButton2;
    @FXML
    private CheckBox checkBox1;

    @FXML
    protected void f1()
    {
        // Establecer Cervezas Rubias:
        cervezasRubias1.put("mahou", 1.0);
        cervezasRubias1.put("amstel", 1.5);
        cervezasRubias1.put("alhambra", 1.7);

        // Establecer Cervezas Rubias:
        cervezasTostadas1.put("mahou maestra", 2.0);
        cervezasTostadas1.put("amstel oro", 2.5);
        cervezasTostadas1.put("alhambra roja", 2.7);

        // Establecer Cervezas Negras:
        cervezasNegras1.put("guinness", 3.0);
        cervezasNegras1.put("leffe negra", 3.5);
        cervezasNegras1.put("1906 black", 3.7);

        // Si el elemento de la lisa seleccionada es iual al primer elemento de la lista
        if (comboBox1.getValue().toString().equals(comboBox1.getItems().get(0).toString()))
        {
            // Añadir un grupo de elemento, eliminando los anteriores
            comboBox2.setItems(FXCollections.observableArrayList(cervezasRubias1.keySet()));
            selector = 0;

            // Establecer el primer elemeno como el valor por defecto
            comboBox2.getSelectionModel().selectFirst();
        } else if(comboBox1.getValue().toString().equals(comboBox1.getItems().get(1).toString()))
        {
            // Añadir un grupo de elemento, eliminando los anteriores
            comboBox2.setItems(FXCollections.observableArrayList(cervezasTostadas1.keySet()));
            selector = 1;

            // Establecer el primer elemeno como el valor por defecto
            comboBox2.getSelectionModel().selectFirst();
        } else if(comboBox1.getValue().toString().equals(comboBox1.getItems().get(2).toString()))
        {
            // Añadir un grupo de elemento, eliminando los anteriores
            comboBox2.setItems(FXCollections.observableArrayList(cervezasNegras1.keySet()));
            selector = 2;

            // Establecer el primer elemeno como el valor por defecto
            comboBox2.getSelectionModel().selectFirst();
        }

    }

    @FXML
    protected void f2()
    {
        switch (selector)
        {
            case 0:
                label1.setText(cervezasRubias1.get(comboBox2.getValue()).toString());
                break;
            case 1:
                label1.setText(cervezasTostadas1.get(comboBox2.getValue()).toString());
                break;
            case 2:
                label1.setText(cervezasNegras1.get(comboBox2.getValue()).toString());
                break;
            default:
                break;
        }
    }
}