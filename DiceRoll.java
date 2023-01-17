//This is for Programming Challenge 6 in chapter 12
//Demostrates GUI programming
//Rachael Blank

import java.util.Random; //import random numbers

//imports for JavaFX
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DiceRoll {

   //six sides to a die, so don't want more than 6
   int sides = 6;
   int DiceNumber;

   //constructor
   public DiceRoll() {

   //set initial value for the roll
   roll(); 
   }

   public void roll() {

      Random rand = new Random();
      DiceNumber = rand.nextInt(sides) + 1;
       }

   public int getRollNumber() {
      return DiceNumber;
}
}

public class Dice extends Application {

   //add in images from image folder within Chapter 12 folder
   private Image images[] = {new Image("images/Die1.bmp"), new Image("images/Die2.bmp"), new Image("images/Die3.bmp"),
                             new Image("images/Die4.bmp"), new Image("images/Die5.bmp"), new Image("images/Die6.bmp")};
                             
   private ImageView viewDie1;
   private ImageView viewDie2;
   private Dice dice1;
   private Dice dice2;

   @Override
   public void start(Stage primaryStage) {

      //dice and image views
      dice1 = new Dice();
      dice2 = new Dice();
      viewDie1 = new ImageView(images[dice1.getRollNumber() - 1]);
      viewDie2 = new ImageView(images[dice2.getRollNumber() - 1]);
      
      //add button
      Button rollDiceButton = new Button("Play");
     
      //stylize 
      HBox hbox = new HBox(10, viewDie1, viewDie2);
      hbox.setAlignment(Pos.CENTER);
      VBox vbox = new VBox(10,hbox, rollDiceButton);
      vbox.setAlignment(Pos.CENTER); 
      rollDiceButton.setOnAction(e -> {
      
      //roll dice 
      dice1.roll(); 
      dice2.roll();
      
      //use new image that matches new number rolled 
      viewDie1.setImage(images[dice1.getRollNumber() - 1]); 
      viewDie2.setImage(images[dice2.getRollNumber() - 1]);
      });

   Scene scene = new Scene(vbox, 300, 300);
   primaryStage.setScene(scene);
   primaryStage.show();
}

   public static void main(String[] args) {
      launch(args);
      }
}