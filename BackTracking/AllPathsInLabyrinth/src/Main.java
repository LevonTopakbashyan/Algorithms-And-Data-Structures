import java.util.LinkedList;
import java.util.List;

public class Main {

    static char[][] labyrinth = {
            {'-', '-', '-', '*', '-', '-', '-'},
            {'*', '*', '-', '*', '-', '*', '-'},
            {'-', '-', '-', '-', '-', '-', '-'},
            {'-', '*', '*', '*', '*', '*', '-'},
            {'-', '-', '-', '-', '-', '-', 'e'},
    };

    static List list = new LinkedList();

    public static boolean IsInBounds(int row, int col){
        boolean isRowExisting = row >=0 && row < labyrinth.length;
        boolean isColExisting = col >=0 && col < labyrinth[0].length;

        return isColExisting && isRowExisting;
    }

    public static boolean isFree(int row, int col){
        return labyrinth[row][col] == '-';
    }

    public static boolean isExit(int row, int col){
        return labyrinth[row][col] == 'e';
    }

    public static void Mark(int row, int col){
        labyrinth[row][col] = 'V';
    }

    public static void Unmark(int row, int col){
        labyrinth[row][col] = '-';
    }

    public static void FindPath(int row, int col, char direction){
        if (!(IsInBounds(row, col))){
            return;
        }
        list.add(direction);

        if (isExit(row,col)){
            System.out.println("Path is founded");
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i) + ",");
            }
            System.out.println();
        }
        else if (isFree(row, col)){
            Mark(row, col);
            FindPath(row, col+1, 'R');
            FindPath(row, col-1, 'L');
            FindPath(row-1, col, 'U');
            FindPath(row+1, col, 'D');
            Unmark(row, col);
        }

        list.remove(list.size() - 1);
    }

    public static void main(String[] args) {

        FindPath(0,0,'S');

        //System.out.println(list.size());

    }
}
