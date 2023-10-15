module Java_SM {
	requires javafx.controls;
	
	opens application to javafx.graphics, javafx.fxml;
}
