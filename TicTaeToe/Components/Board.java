package Components;
import java.util.*;

public class Board {
    int size;
    PlayingPiece[][] board;

    public Board(int size)
    {
        this.size = size;
        board = new PlayingPiece[size][size];
    }

    public void printBoard()
    {
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                if(board[i][j]==null)
                    System.out.print(" | ");
                else
                    System.out.print(board[i][j].pieceType.name() + "| ");
            }
            System.out.println();
        }
    }

    public List<Pair<Integer,Integer>> freeCells()
    {
        List<Pair<Integer,Integer>> x = new ArrayList<>();
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                if(board[i][j]==null)
                {
                    Pair<Integer,Integer> k = new Pair<>(i,j);
                    x.add(k);
                }
            }
        }

        return x;
    }

    public boolean addPiece(Integer row, Integer col, PlayingPiece piece)
    {
        if(board[row][col] != null)
            return false;

        board[row][col] = piece;
        return true;
    }

    public boolean checkWinner(Integer row, Integer col, PieceType piece)
    {
        boolean checkRow=true,checkCol=true,checkDiagonal=true,checkAnti=true;

        for(int i=0;i<size;i++)
        {
            if(board[row][i]==null || board[row][i].pieceType!=piece)
            {
                checkRow=false;
            }
        }

        for(int i=0;i<size;i++)
        {
            if(board[i][col]==null || board[i][col].pieceType!=piece)
            {
                checkCol=false;
            }
        }

        for(int i=0,j=0;i<size;i++,j++)
        {
            if(board[i][j]==null || board[i][j].pieceType!=piece)
            {
                checkDiagonal=false;
            }
        }

        for(int i=0,j=size-1;i<size;i++,j--)
        {
            if(board[i][j]==null || board[i][j].pieceType!=piece)
            {
                checkAnti=false;
            }
        }

        return checkDiagonal || checkAnti || checkCol || checkRow;
    }

}
