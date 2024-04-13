public class Number {
    private int num;
    public Number(int digit1, int digit2, int digit3, int digit4, int digit5){
        num = digit1 * 10000 + digit2 * 1000 + digit3 * 100 + digit4 * 10 + digit5;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int i){
        num = i;
    }
}
