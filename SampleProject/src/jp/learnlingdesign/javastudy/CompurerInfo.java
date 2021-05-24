package jp.learnlingdesign.javastudy;

class Computer {
	public String os;
	public int memory ;
	public int storage;
}
public class CompurerInfo {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Computer desktop = new Computer();
		desktop.os = "windows 10";
		desktop.memory = 4;
		desktop.storage =256;
	
		System.out.println("OS: "+desktop.os);
		System.out.println("Memory:"+ desktop.memory +"GB");
		System.out.println("storage:"+desktop.storage +"GB");
		
		Computer desktop2 = desktop;
		desktop2.os = "Ubuntn";
		
		System.out.println("\nOS: "+desktop2.os);
		System.out.println("Memory:"+ desktop2.memory +"GB");
		System.out.println("storage:"+desktop2.storage +"GB");
		
		System.out.println("\nOS: "+desktop.os);
		System.out.println("Memory:"+ desktop.memory +"GB");
		System.out.println("storage:"+desktop.storage +"GB");
	}

}
