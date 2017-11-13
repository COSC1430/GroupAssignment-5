import java.util.Random;
class Chicken extends Actor{

    char moves[] = {'w','s','a','d'};
    
    public Chicken(){
        Random RNG = new Random();
        
        currRow = RNG.nextInt(9);
        
        currCol = RNG.nextInt(9);
        
        while(currRow==4 && currCol==4){
        	currRow = RNG.nextInt(9);
            currCol = RNG.nextInt(9);
        }
        data = 'C';
    }
    public int move(){
        Random RNG = new Random();
        
        int a = RNG.nextInt(4);
        
        char move = moves[a];
        
        while(!borderCheck(currRow,currCol,move)){
        	
            a = RNG.nextInt(4);
            
            move = moves[a];
        }
        //user input to decide direction
        
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
