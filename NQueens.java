package assignments.module9;

public class NQueens {

        static final int N = 4;

        static void print(int board[][]) {
            for(int i=0;i<N;i++) {
                for(int j=0;j<N;j++)
                    System.out.print(board[i][j]+" ");
                System.out.println();
            }
        }

        public static void main(String[] args) {

            int board[][] = new int[N][N];

            board[0][1] = 1;
            board[1][3] = 1;
            board[2][0] = 1;
            board[3][2] = 1;

            print(board);
        }
    }

