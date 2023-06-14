module com.example.javafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;


    opens com.example.javafx to javafx.fxml;
    exports com.example.javafx.Chapter14;
    exports com.example.javafx.Chapter15;
    opens com.example.javafx.Chapter14 to javafx.fxml;
    exports com.example.javafx.Chapter14.DisplayClock;
    opens com.example.javafx.Chapter14.DisplayClock to javafx.fxml;
    opens com.example.javafx.Chapter15 to javafx.fxml;
    exports com.example.javafx.Chapter15.LoanCalculator;
    opens com.example.javafx.Chapter15.LoanCalculator to javafx.fxml;
    exports com.example.javafx.Chapter15.BouncingBall;
    opens com.example.javafx.Chapter15.BouncingBall to javafx.fxml;
    exports com.example.javafx.Chapter16;
    opens com.example.javafx.Chapter16 to javafx.fxml;
}