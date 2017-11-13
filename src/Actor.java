abstract class Actor{
    int currRow;
    int currCol;
    char data;

    public static boolean borderCheck(char move, int currRow, int currCol){
        if(move=='w' && currRow==0){
            return false;
        }
        if(move=='s' && currRow==8){
            return false;
        }
        if(move=='a' && currCol==0){
            return false;
        }
        if(move=='d' && currCol==8){
            return false;
        }
        return true;
    }
    abstract int move();
}