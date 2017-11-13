abstract class Actor{
    int currRow;
    int currCol;
    char data;

    static boolean borderCheck(int currRow, int currCol, char move) {
        return (move != 'w' || currRow != 0) && (move != 's' || currRow != 8) && (move != 'a' || currCol != 0) && (move != 'd' || currCol != 8);
    }
    abstract int move();
}