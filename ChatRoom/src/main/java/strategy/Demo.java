package strategy;

public abstract class Demo implements ISocMed{
	public static void main(String[] args) {
		Facebook f=new Facebook();
		f.connectTo("Srilekha");
	}
}
