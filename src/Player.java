import java.util.Scanner;
class Player extends Actor{
    Player(){
        currRow = 4;
        currCol = 4;
        data = 'P';
        }
public int move(){
        Scanner sc = new Scanner(System.in);
        System.out.println("up: w | down:s | left:a | right:d | quit:q");
        System.out.print("your move: ");
        char move = sc.next().charAt(0);
        if(move=='q'){
        return -1;
        }
        if(!borderCheck(this.currRow,this.currCol,move)){
        return 0;
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