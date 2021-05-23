package jp.learnlingdesign.javastudy;

public class CommonMultiple2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 2または３の倍数を　１〜50までの範囲で表示する
		
		int i = 1;
		while(i < 50) {
			if((i % 2 == 0)||(i % 3 == 0)) {
				System.out.println(i);
			}
			i++;
		}

	}

}
