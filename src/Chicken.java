import java.util.Random;
class Chicken extends Actor{

    char moves[] = {'w','s','a','d'};

    public Chicken(){
        Random rn = new Random();

        currRow = rn.nextInt(9);

        currCol = rn.nextInt(9);

        while(currRow==4 && currCol==4){
        	currRow = rn.nextInt(9);
            currCol = rn.nextInt(9);
        }
        data = 'C';
    }
    public int move(){
        Random rn = new Random();

        int rnVal = rn.nextInt(4);

        char move = moves[rnVal];

        while(!borderCheck(currRow,currCol,move)){

            rnVal = rn.nextInt(4);

            move = moves[rnVal];
        }
        //chicken to decide direction

        if(move=='w'){	//UP
        	currRow-=1;
        }
        if(move=='s'){	//DOWN
        	currRow+=1;
        }
        if(move=='a'){	//LEFT
        	currCol-=1;
        }
        if(move=='d'){	//RIGHT
        	currCol+=1;
        }
        return 1;
    }
}
