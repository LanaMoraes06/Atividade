module LAnalytics {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	requires javafx.base;
	
	opens LA to javafx.graphics, javafx.fxml;
}
