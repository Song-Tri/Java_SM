package application.login;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class controllerLogin {

    
	 @FXML
	    private Button admin_btn_login;

	    @FXML
	    private AnchorPane admin_form;

	    @FXML
	    private Hyperlink admin_hypelink;

	    @FXML
	    private PasswordField admin_password;

	    @FXML
	    private TextField admin_username;

	    @FXML
	    private Button btn_close;

	    @FXML
	    private Button employee_btn_login;

	    @FXML
	    private AnchorPane employee_form;

	    @FXML
	    private Hyperlink employee_hypelink;

	    @FXML
	    private PasswordField employee_password;

	    @FXML
	    private TextField employee_username;

	    public void switchForm(ActionEvent event) {
			
	    	if (event.getSource()== admin_hypelink) {
	    		admin_form.setVisible(false);
	    		employee_form.setVisible(true);
	    		}
	    	else if (event.getSource()== employee_hypelink) {
				admin_form.setVisible(true);
	    		employee_form.setVisible(false);
			}
		}
	    public void close() {
	    	System.exit(0);
	    }
   
    void initialize(URL url, ResourceBundle rb) {

    }

}
