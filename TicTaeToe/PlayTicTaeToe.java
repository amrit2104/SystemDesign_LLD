import Components.*;

import java.util.*;

public class PlayTicTaeToe {
//    List<Player> playerList;
    public Board board;
    public Deque<Player> players;

    public void initialise()
    {
        players = new LinkedList<>();
        PlayingPieceX x = new PlayingPieceX();
        PlayingPieceO o = new PlayingPieceO();

        Player p1 = new Player("p1",x);
        Player p2 = new Player("p2",o);

        players.add(p1);
        players.add(p2);

        board = new Board(3);
    }
    public String startGame()
    {
        boolean isWinner = false;

        while(!isWinner)
        {
            Player pTurn = players.removeFirst();

            board.printBoard();

            List<Pair<Integer, Integer>> free = board.freeCells();

            if(free.isEmpty())
            {
                isWinner = true;
                continue;
            }

            System.out.println("Player: " + pTurn.getName());
            System.out.println("Enter row,column: ");
            Scanner x = new Scanner(System.in);
            Integer row = x.nextInt();
            Integer col = x.nextInt();

            boolean canAddPiece = board.addPiece(row,col, pTurn.getPiece());
            if(!canAddPiece)
            {
                System.out.println("Already Occupied, try again!!");
                players.addFirst(pTurn);
                continue;
            }
            players.addLast(pTurn);

            boolean winner = board.checkWinner(row,col, pTurn.piece.pieceType);
            if(winner)
            {
                return pTurn.getName();
            }
        }

        return "tie";
    }
}
