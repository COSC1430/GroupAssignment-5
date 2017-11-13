public class RPG{
    public static void main(String[] args) {
        Player P = new Player();
        Chicken C = new Chicken();
        Map M = new Map();
        M.update(P.currRow,P.currCol,P.data);
        M.update(C.currRow,C.currCol,C.data);
        M.printMap();
        int in = P.move();
        while(in!=-1){
            if(in==1){
                M.update(P.currRow,P.currCol,P.data);
                if(C.currRow==P.currRow && C.currCol==P.currCol){
                    M.printMap();
                    System.out.println("Chicken captured!\nGame over!");
                    break;
                }
                C.move();
                if(C.currRow==P.currRow && C.currCol==P.currCol){
                    M.update(C.currRow,C.currCol,C.data);
                    M.update(P.currRow,P.currCol,P.data);
                    M.printMap();
                    System.out.println("Chicken captured!\nGame over!");
                    break;
                }
                M.update(C.currRow,C.currCol,C.data);
                M.printMap();
            }else{
                System.out.println("Invalid Move");
            }
            in = P.move();
        }
    }
}