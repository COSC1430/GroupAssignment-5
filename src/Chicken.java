import java.util.Random;
public class Chicken extends Actor {

    Map map;
    static Random rn = new Random();
    static int rnCol = rn.nextInt(9);
    static int rnRow = rn.nextInt(9);
    public Chicken() {
        super(rnRow,rnCol,'C');

    }

    @Override
    void move(int row, int col, char data) {
        int rnNum = rn.nextInt(4);
        if(borderCheck()) {
            if (rnNum == 0) {
                map.upDateMap(rnRow - 1, rnCol, 'C');
            } else if (rnNum == 1) {
                map.upDateMap(row + 1, col, 'C');
            } else if (rnNum == 2) {
                map.upDateMap(row, col + 1, 'C');
            } else if (rnNum == 3) {
                map.upDateMap(row, col - 1, 'C');
            }
        }
    }
}
