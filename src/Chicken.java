import java.util.Random;
class Chicken extends Actor{

    char moves[] = {'w','s','a','d'};
    public Chicken(){
        Random rand = new Random();
        currRow = rand.nextInt(9);
        currCol = rand.nextInt(9);
//Checking if Chicken does not start at center
        while(currRow==4 && currCol==4){
            currRow = rand.nextInt(9);
            currCol = rand.nextInt(9);
        }
        data = 'C';
    }
    public int move(){
        Random rand = new Random();
        int a = rand.nextInt(4);
        char move = moves[a];
        while(!borderCheck(currRow,currCol,move)){
            a = rand.nextInt(4);
            move = moves[a];
        }
        if(move=='w'){
            currRow-=1;
        }
        if(move=='s'){
            currRow+=1;
        }
        if(move=='a'){
            currCol-=1;
        }
        if(move=='d'){
            currCol+=1;
        }
        return 1;
    }
}