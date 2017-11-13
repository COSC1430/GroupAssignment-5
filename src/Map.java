public class Map {

    public char[][] map = new char[9][9];
    private Chicken chicken;
    private Player player;
   public Map(){
        for(int i=0;i <9;i++){
            for(int j=0;j<9;j++){
               map[i][j]='-';
            }
        }
    }
    public void upDateMap(int row,int col,char data){

    }
}
