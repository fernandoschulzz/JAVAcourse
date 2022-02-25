package fernando.methods;

public class Main {

    public static void main(String[] args) {
	calculateScore(true,8000, 5,100);
    calculateScore(true, 10000, 8, 200);

    int highScorePosition = calculateHighScorePosition(1500);
    displayHighScorePosition("fernando", highScorePosition);
    }
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus ) {
        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score is " + finalScore);
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into position " + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {
        int position = 4;
        if(playerScore >= 1000) {
            position = 1;
        }
        else if(playerScore >= 500) {
            position = 2;
        } else if(playerScore>= 100) {
            position = 1;
        }
            return position;
    }
}
