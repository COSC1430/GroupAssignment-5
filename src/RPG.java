public class RPG{
    public static void main(String[] args) {
        Player player = new Player();
        Chicken chicken = new Chicken();
        Map M = new Map();
        M.update(player.currRow,player.currCol,player.data);
        M.update(chicken.currRow,chicken.currCol,chicken.data);
        M.printMap();
        int input = player.move();
        while(input!=-1){
            if(input==1){
                M.update(player.currRow,player.currCol,player.data);
                if(chicken.currRow==player.currRow && chicken.currCol==player.currCol){
                    M.printMap();
                    System.out.println("Chicken captured!\nGame over!");
                    break;
                }
                chicken.move();
                if(chicken.currRow==player.currRow && chicken.currCol==player.currCol){
                    M.update(chicken.currRow,chicken.currCol,chicken.data);
                    M.update(player.currRow,player.currCol,player.data);
                    M.printMap();
                    System.out.println("Chicken captured!\nGame over!");
                    break;
                }
                M.update(chicken.currRow,chicken.currCol,chicken.data);
                M.printMap();
            }else{
                System.out.println("Invalid Move");
            }
            input = player.move();
        }
    }
}