
public class Main {

    public static void main(String args[])
    {
        PlayTicTaeToe play= new PlayTicTaeToe();
        play.initialise();
        System.out.println("Winner is: " + play.startGame() );
    }
}
