package sample;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.*;

/**
 * Manages communication between the view and models of the
 * application.
 *
 * @author David C Hernandez
 */
public class Controller
{
    // named constants ==========================================
    private static final String IMG_PATH = "images/%s.png";
    private static final int NUMBER_OF_CARDS = 7;
    
    private static final String GRAY_BACK = "images/gray-back.png";
    private static final String BLUE_BACK = "images/blue-back.png";
    private static final String GREEN_BACK = "images/green-back.png";
    private static final String RED_BACK = "images/red-back.png";
    private static final String YELLOW_BACK = "images/yellow-back.png";
    private static final String PURPLE_BACK = "images/purple-back.png";
    
    @FXML
    private final SimpleDoubleProperty STAGE_WIDTH = new SimpleDoubleProperty(this, "STAGE_WIDTH", Main.STAGE_WIDTH);
    
    @FXML
    private final SimpleDoubleProperty STAGE_HEIGHT = new SimpleDoubleProperty(this, "STAGE_HEIGHT", Main.STAGE_HEIGHT);
    
    
    // instance variables =======================================
    
    @FXML
    private ArrayList<ImageView> cards;
    private ArrayList<Image> deck = new ArrayList<>();
    private Map<String, Image> back = new HashMap<>();
    private Random rng;
    
    /**
     * method initializes the ArrayList with card Images.
     */
    public void initialize()
    {
        // initialize the random number generator
        rng = new Random();
        
        // initialize the array list deck of cards
        for (int i = 101; i <= 152; i++)
        {
            deck.add(new Image(String.format(IMG_PATH, i)));
        }
        
        // shuffle the cards in the deck
        shuffle();
        initBacks();
    }
    
    // helper methods ===========================================
    private void initBacks()
    {
        String[] paths = {GRAY_BACK, BLUE_BACK, GREEN_BACK, RED_BACK, YELLOW_BACK, PURPLE_BACK};
        for (int i = 0; i < paths.length; i++)
        {
            back.put(paths[i], new Image(paths[i]));
        }
    }
    
    private void flipCard(int card)
    {
        cards.get(card).setImage(deck.get(card));
    }
    
    @FXML
    private void flipFirstCard()
    {
        flipCard(0);
    }
    
    @FXML
    private void flipSecondCard()
    {
        flipCard(1);
    }
    
    @FXML
    private void flipThirdCard()
    {
        flipCard(2);
    }
    
    @FXML
    private void flipFourthCard()
    {
        flipCard(3);
    }
    
    @FXML
    private void flipFifthCard()
    {
        flipCard(4);
    }
    
    @FXML
    private void flipDealer1()
    {
        flipCard(5);
    }
    
    @FXML
    private void flipDealer2()
    {
        flipCard(6);
    }
    
    private void setAllBackImages(Image image) {
        for (ImageView card : cards)
        {
            card.setImage(image);
        }
    }
    
    @FXML
    private void changeBackColorGray()
    {
        setAllBackImages(back.get(GRAY_BACK));
    }
    
    @FXML
    private void changeBackColorBlue()
    {
        setAllBackImages(back.get(BLUE_BACK));
    }
    
    @FXML
    private void changeBackColorGreen()
    {
        // TODO complete the color implementation
        
    }
    
    @FXML
    private void changeBackColorRed()
    {
        setAllBackImages(back.get(RED_BACK));
    }
    
    @FXML
    private void changeBackColorYellow()
    {
        setAllBackImages(back.get(YELLOW_BACK));
    }
    
    @FXML
    private void changeBackColorPurple()
    {
        setAllBackImages(back.get(PURPLE_BACK));
    }
    
    @FXML
    private void shuffle()
    {
        Collections.shuffle(deck);
    }
    
}
