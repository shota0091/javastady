package jp.learnlingdesign.javastudy;

public class CommonMultiple3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//2と３位外の公倍数を表示する
		int i = 1;
		while(i < 20) {
			if(!((i % 2 == 0)&&(i % 3 == 0))) {
				//NOT演算子の適応例
				System.out.println(i);
			}
			i++;
		}

	}

}
