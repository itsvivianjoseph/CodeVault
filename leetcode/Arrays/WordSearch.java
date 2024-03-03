// not completed
package Arrays;

public class WordSearch {
    static void traverse(char[][] board,String word){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                DFS(board,word,"",i,j,0);
            }
        }
    }
    
    static void DFS(char[][] board,String word,String output,int row,int col,int idx){
        if(isIndexValid(board, row, col, word.charAt(idx)));
    }

    static boolean isIndexValid(char[][] board,int i,int j,char input){
        if(i < board.length && j < board[i].length && board[i][j] == input) return true;
        else return false;
    }
    public static void main(String[] args) {
        WordSearch ws = new WordSearch();
    }
}