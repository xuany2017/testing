package TestingS;

public class Trytest2 {
	int[] number = {100,80,50,70,20,60};
	public void setNum(int index,int value){
	number [index] = value;
	}
	public int getNum(int index){
	return number[index];
	}
	public static void main(String[] args){
	Trytest2 ex = new Trytest2();
	int value = ex.getNum(0);
	System.out.println(value);
	value = ex.getNum(6);
	System.out.println(value);
	value = ex.getNum(5);
	System.out.println(value);
	}
}
