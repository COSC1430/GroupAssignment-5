public abstract class Actor {
    private int currRow, currCol;
    private char data;

    Map map;
    public Actor(int currRow, int currCol,char data){
        this.data=data;
        this.currRow=currRow;
        this.currCol=currCol;
    }

  /*  public int getCurrRow() {
        return currRow;
    }

    public void setCurrRow(int currRow) {
        this.currRow = currRow;
    }

    public int getCurrCol(int i) {
        return currCol;
    }

    public void setCurrCol(int currCol) {
        this.currCol = currCol;
    }

    public char getData() {
        return data;
    }

    public void setData(char data) {
        this.data = data;
    }
*/
    public boolean borderCheck(){
        for (int i = 0; i < map.map.length; i++)
        {
            for (int j = 0; j < map.map[i].length; j++)
            {
                if (i == 0 || j == 0 || i == map.map.length - 1 || j == map.map[i].length - 1)
                {
                   return true;
                }
            }
        }
        return false;
    }
    abstract void move(int row,int col, char data);
}
