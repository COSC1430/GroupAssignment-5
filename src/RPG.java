public class RPG{
    public static void main(String[] args) {
        Player player = new Player();
        Chicken chicken = new Chicken();
        Map map = new Map();
        map.update(player.currRow,player.currCol,player.data);
        map.update(chicken.currRow,chicken.currCol,chicken.data);
        map.printMap();
        int input = player.move();
        while(input!=-1){
            if(input==1){
                map.update(player.currRow,player.currCol,player.data);
                if(chicken.currRow==player.currRow && chicken.currCol==player.currCol){
                    map.printMap();
                    System.out.println("Chicken captured!");
                    System.out.println("Game over!");
                    break;
                }
                chicken.move();
                if(chicken.currRow==player.currRow && chicken.currCol==player.currCol){
                    map.update(chicken.currRow,chicken.currCol,chicken.data);
                    map.update(player.currRow,player.currCol,player.data);
                    map.printMap();
                    System.out.println("Chicken captured!");
                    System.out.println("Game over!");
                    break;
                }
                map.update(chicken.currRow,chicken.currCol,chicken.data);
                map.printMap();
            }else{
                System.out.println("Invalid Move");
            }
            input = player.move();
        }
    }
}