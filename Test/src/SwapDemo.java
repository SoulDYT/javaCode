class Number{
    private int num;
    public int getnum(){
        return num;
    }
    public void setnum(int num){
        this.num = num;
    }
}
public class SwapDemo {
    public static void swap(Number num1,Number num2){
        int tmp = num1.getnum();
        num1.setnum(num2.getnum());
        num2.setnum(tmp);
    }
    public static void main(String[] args) {
        Number num1 = new Number();
        Number num2 = new Number();

        num1.setnum(10);
        num2.setnum(20);

        swap(num1,num2);

        System.out.println(num1.getnum());
        System.out.println(num2.getnum());
    }
}
