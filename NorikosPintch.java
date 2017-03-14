package 桂乃梨子とピンチを乗り越えろ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NorikosPintch {
	public static void main(String[] args) throws IOException {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		String line = br.readLine();     //文字列入力

		int num = Integer.parseInt(line);     //int化

		int[][] numArray = new int[2][num];     //2行num列の配列作成

		for (int i = 0; i < 2; i++) {
			String line2 = br.readLine();     //文字列入力
			String[] worddelimiter = line2.split(" ", num);     //半角スペース区切り　領域はnum分だけ
			for (int j = 0; j < worddelimiter.length; j++) {
				int number = Integer.parseInt(worddelimiter[j]);     //文字列を1つずつint化
				numArray[i][j] = number;     //2重配列に代入
			}
		}

		int sum;     //合計値の変数を初期化

		//numArray配列のX方向を評価していく
		for (int a = 0; a < numArray[0].length; a++) {
			for (int b = 0; b < num; b++) {     //num行(Y方向)を評価していく
				sum = numArray[0][b] + numArray[1][a];
				if (b != num - 1) {     //bが1じゃないとき
					System.out.print(sum + " ");     //改行なし、半角スペースありで出力
				} else {     //それ以外の時
					System.out.println(sum);     //改行有りで出力
				}
			}
		}
	}
}
