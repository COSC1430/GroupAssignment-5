import java.util.Scanner;
public class Player extends Actor {

    Scanner sc = new Scanner(System.in);
    Map map;
    public Player() {
        super(4, 4, 'P');
    }

    @Override
    void move(int row, int col, char data) {
        System.out.println("up: w | down: s | left: a | right: d | quit: q");
        System.out.print("your move: ");
        char moves;
        Scanner input = new Scanner(System.in);
        moves = input.next().charAt(0);
        while (moves != 'q') {
            if (borderCheck()) {
                if (moves == 'w') {
                    map.upDateMap(row - 1, col, 'P');
                } else if (moves == 'a') {
                    map.upDateMap(row, col - 1, 'P');
                } else if (moves == 's') {
                    map.upDateMap(row + 1, col, 'P');
                } else if (moves == 'd') {
                    map.upDateMap(row, col + 1, 'P');
                } else {
                    System.out.println("Not a correct input");
                }
            }else {
                System.out.println("Not is outside of the border.");
            }
        }
    }
}
