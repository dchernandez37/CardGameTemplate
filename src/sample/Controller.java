package sample;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.ArrayList;

/**
 * Manages communication between the view and models of the
 * application.
 *
 * @author David C Hernandez
 */
public class Controller {
    // named constants ==========================================
    private static final String IMG_PATH = "images/%s.png";

    @FXML
    private SimpleDoubleProperty STAGE_WIDTH = new SimpleDoubleProperty(this, "STAGE_WIDTH", Main.STAGE_WIDTH);

    @FXML
    private SimpleDoubleProperty STAGE_HEIGHT = new SimpleDoubleProperty(this, "STAGE_HEIGHT", Main.STAGE_HEIGHT);

    // instance variables =======================================
    @FXML
    private ImageView rightCardView;

    @FXML
    private ArrayList<ImageView> cards;

    public void initialize() {
        for (int i = 1; i <= 5; i++) {
            cards.add(new ImageView());
        }
    }


    // helper methods ===========================================
    @FXML
    private void flipCard() {
        cards.get(0).setImage(new Image("images/5c.png"));
        cards.get(1).setImage(new Image("images/5c.png"));
    }

    @FXML
    private void changeBackColorBlue() {
        for(ImageView card : cards) {
            card.setImage(new Image("images/blue-back.png"));
        }
    }
}
