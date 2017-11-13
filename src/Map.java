class Map{
    private char grid[][];
    Map(){
        grid = new char[9][9];
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                grid[i][j] = '-';
            }
        }
    }
    void update(int row, int col, char data){
//Removing previous occurrence of data(Chicken or Player)
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(grid[i][j]==data){
                    grid[i][j] = '-';
                    break;
                }
            }
        }
        grid[row][col] = data;
    }
    void printMap(){
        System.out.println();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}