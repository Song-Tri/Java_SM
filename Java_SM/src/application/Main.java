package application;
	

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;



public class Main extends Application {
	
	 private double x=0;
	 private double y=0;
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root =FXMLLoader.load(getClass().getResource("login/login.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

			scene.getStylesheets().add(getClass().getResource("login/loginDesign.css").toExternalForm());
//			this.primaryStage = primaryStage;
			
			root.setOnMousePressed((MouseEvent event)->{
				x= event.getSceneX();
				y= event.getSceneY();
			});
			
			root.setOnMouseDragged((MouseEvent event)->{
				primaryStage.setX(event.getSceneX() - x);
				primaryStage.setY(event.getSceneY() - y);
				
				primaryStage.setOpacity(.8);
			});
			
			root.setOnMouseReleased((MouseEvent event)->{
				primaryStage.setOpacity(1);
			});
			
			primaryStage.initStyle(StageStyle.TRANSPARENT);
			
			
			primaryStage.setScene(scene);
			primaryStage.show();
//			showMainItems();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
//	private void showMainItems() throws IOException {
//		FXMLLoader loader = new FXMLLoader();
//		loader.setLocation(Main.class.getResource("client/client.fxml"));//xem các nội dung giữa các bố cục chính
//		BorderPane mainItems = loader.load();//tạo 1 biến chùm tia khác để nó bằng với các mục chính nên tạo biến từMainItems gansnos vào main 
		//mainLayout.setCenter(mainItems);
//	s}
	public static void main(String[] args) {
		launch(args);
	}
}
