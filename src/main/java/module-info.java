module com.example.w13_team_city_calculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.w13_team_city_calculator to javafx.fxml;
    exports com.example.w13_team_city_calculator;
}