import java.util.Random;

//backend
public class RockPaperScissor {
    //all the choices that computer can do
    private static final String[] computerChoices = {"Rock", "Paper", "Scissor"};

    // store the computer choice so that we can retrieve the value and display it to the frontend
    private String computerChoice;

    public String getComputerChoice() {
        return computerChoice;
    }

    public void setComputerChoice(String computerChoice) {
        this.computerChoice = computerChoice;
    }

    public int getComputerScore() {
        return computerScore;
    }

    public void setComputerScore(int computerScore) {
        this.computerScore = computerScore;
    }

    public int getPlayerScore() {
        return playerScore;
    }

    public void setPlayerScore(int playerScore) {
        this.playerScore = playerScore;
    }

    // store the scores so that we can retrieve the value and display it to the frontend
    private int computerScore, playerScore;

    // use to create a random number to randomly choose an option for the computer
    private Random random;

    public RockPaperScissor() {
        random = new Random();
    }

    // begin playing rock paper scissor
    // this method will return the result of the game (i.e. computer win, player win, draw)
    public String playRockPaperScissor(String playerChoice) {
        //generate computerChoice
        computerChoice = computerChoices[random.nextInt(computerChoices.length)];

        // will contain the returning message indicating the result of the game
        String result;

        // evaluate the winner
        if (computerChoice.equals("Rock")) {
            if (playerChoice.equals("Paper")) {
                result = "Player win!";
                playerScore++;
            } else if (playerChoice.equals("Scissor")) {
                result = "Computer win!";
                computerScore++;
            } else {
                result = "Draw!";
            }
        } else if (computerChoice.equals("Paper")) {
            if (playerChoice.equals("Scissor")) {
                result = "Player win!";
                playerScore++;
            } else if (playerChoice.equals("Rock")) {
                result = "Computer win!";
                computerScore++;
            } else {
                result = "Draw!";
            }
        } else {
            if (playerChoice.equals("Rock")) {
                result = "Player win!";
                playerScore++;
            } else if (playerChoice.equals("Paper")) {
                result = "Computer win!";
                computerScore++;
            } else {
                result = "Draw!";
            }
        }
        return result;
    }
}
