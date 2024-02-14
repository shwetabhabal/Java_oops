import java.util.*;
public class DeckOfCards {
    public static void main(String[] args) {
        String suit[] = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String rank[]= { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
        String deck[] = new String[52];
        int index=0;
        for(int i=0;i<suit.length;i++){
            for(int j=0; j< rank.length; j++){
                deck[index++] = rank[i] + "of" +suit[j];

            }
        }
        //Shuffle the cards
        Random rand = new Random();
        for(int i=0;i< deck.length;i++){
            int ind = rand.nextInt(i+1);
            String temp = deck[ind];
            deck[ind] = deck[i];
            deck[i] = temp;
        }
        // distribute 9 Cards to 4 Players
        String playersCard[][] = new String[4][9];
        index=0;
        for(int i=0;i<4 ;i++){
            for(int j=0;j<9;j++){
                playersCard[i][j] = deck[index];
                index++;
            }
        }
        //Print the Cards
        for(int i=0;i<4;i++){
            for(int j=0; j<9; j++){
                System.out.println(playersCard[i][j]);
            }
            System.out.println();
        }
    }
}
