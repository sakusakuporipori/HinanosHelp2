package 水無瀬朋の一大事;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TomosSerious {
	public static void main(String[] args) throws IOException {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		String line1 = br.readLine();     //入力回数を読み込み
		int line = Integer.parseInt(line1);     //int化

		int[][] unitprise_num_discountArray = new int[line][3];     //商品の単価、個数、割引額を代入する2重配列
		int count = 0;     //カウントする変数を初期化
		int[] countArray = new int[line];     //カウント変数を代入する配列

		//入力回数だけ読み込んでいく
		for (int i = 0; i < line; i++) {
			String line2 = br.readLine();     //読み込み
			String[] worddelimiter = line2.split(" ", 3);     //半角スペース区切り　領域は3つ
			for (int j = 0; j < worddelimiter.length; j++) {
				int unitprise_num_discount = Integer.parseInt(worddelimiter[j]);     //worddelimiter配列をint化していく
				unitprise_num_discountArray[i][j] = unitprise_num_discount;     //int化したものを2重配列に格納していく
				if (j == 2) {     //unitprise_num_discountArray配列の2列目に値を格納したときに
					count++;     //カウントをインクリメント
					countArray[i] = count;     //代入する
				}
			}
		}

		String line3 = br.readLine();     //入力回数を読み込み
		int num = Integer.parseInt(line3);     //int化
		int[][] commodity_numArray = new int[num][2];     //商品番号と購入数を代入する2重配列　num行2列

		//num行入力する
		for (int a = 0; a < num; a++) {
			String line4 = br.readLine();     //読み込み
			String[] worddelimiter2 = line4.split(" ", 2);     //半角スペース区切り　領域は2つ
			for (int b = 0; b < worddelimiter2.length; b++) {
				int commodity_num = Integer.parseInt(worddelimiter2[b]);     //worddelimiter配列をint化していく
				commodity_numArray[a][b] = commodity_num;     //int化したものを2重配列に格納していく
			}
		}

		int[] price = new int[num];     //合計金額を代入する配列

		for (int c = 0; c < num/*commodity_numArray.length*/; c++) {
			for (int d = 0; d < countArray.length; d++) {
				//↓↓↓commodity_numArray配列の0列目とcountArray配列の数値が同じ場合
				if (commodity_numArray[c][0] == countArray[d]) {
					price[c] = unitprise_num_discountArray[d][0] * commodity_numArray[c][1]
							- (commodity_numArray[c][1] / unitprise_num_discountArray[d][1])*unitprise_num_discountArray[d][2];
				}
			}
			System.out.println(price[c]);
		}
	}
}
