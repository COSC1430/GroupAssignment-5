import java.util.Random;
class Chicken extends Actor{

    char moves[] = {'w','s','a','d'};
    public Chicken(){
        Random RNG = new Random();
        
        currenRow = RNG.nextInt(9);
        
        currenColumn = RNG.nextInt(9);
        
        while(currenRow==4 && currenColumn==4){
        	currenRow = RNG.nextInt(9);
            currenColumn = RNG.nextInt(9);
        }
        data = 'C';
    }
    public int move(){
        Random RNG = new Random();
        
        int a = RNG.nextInt(4);
        
        char move = moves[a];
        
        while(!borderCheck(move,currenRow,currenColumn)){
        	
            a = RNG.nextInt(4);
            
            move = moves[a];
        }
        //user input to decide direction
        
        if(move=='w'){	//UP
        	currenRow-=1; 
        }
        if(move=='s'){	//DOWN
        	currenRow+=1;
        }
        if(move=='a'){	//LEFT
        	currenColumn-=1;
        }
        if(move=='d'){	//RIGHT
        	currenColumn+=1;
        }
        return 1;
    }
}
