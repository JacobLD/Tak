class test{
    public static void main(String[] args){

        final int SIZE = 6;
        Board board = new board(SIZE);
        BOGOAI player1 = new BOGOAI(board, true);
        BOGOAI player2 = new BOGOAI(board, false);

        while(!board.determineWinner()){
            player1.makeMove();
            player2.makeMove();
        }
    }
}