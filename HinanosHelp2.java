package 芦屋川雛乃からのヘルプ依頼;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HinanosHelp2 {
	public static void main(String[] args) throws IOException {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);

		//=====1行目=====
		String line1 = br.readLine();     //10桁の数値を入力

		String[] worddelimiter = line1.split(" ", 10);     //半角スペースで区切る
		int[] intword = new int[worddelimiter.length];
		int[] code_before = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };     //暗号化する前の配列

		//worddelimiter配列の中身をint化する
		for (int i = 0; i < worddelimiter.length; i++) {
			intword[i] = Integer.parseInt(worddelimiter[i]);
		}

		//=====2行目=====
		//encodeかdecodeを入力
		String en_de = br.readLine();

		//=====3行目=====
		String StNum = br.readLine();     //暗号化する数値or復元する数値を入力
		char[] charArray = StNum.toCharArray();     //↑↑↑をchar型に分解

		int[] intnum = new int[charArray.length];     //charArrayと同じ大きさの配列
		int[] output_en_de_Num = new int[StNum.length()];     //結果を格納する配列

		for (int q = 0; q < charArray.length; q++) {
			String tempword = String.valueOf(charArray[q]);     //char型をint化するために1度String化する
			intnum[q] = Integer.parseInt(tempword);    //int化
		}

		for (int i = 0; i < intnum.length; i++) {
			if (en_de.equals("encode")) {     //encodeと入力された場合
				if (intnum[i] == 0) {     //intnumのi番目が0のとき
					output_en_de_Num[i] = intword[0];     //0番目を代入
				}
				else if (intnum[i] == 1) {     //intnumのi番目が1のとき
					output_en_de_Num[i] = intword[1];     //1番目を代入
				}
				else if (intnum[i] == 2) {     //intnumのi番目が2のとき
					output_en_de_Num[i] = intword[2];     //2番目を代入
				}
				else if(intnum[i] == 3) {     //intnumのi番目が3のとき
					output_en_de_Num[i] = intword[3];     //3番目を代入
				}
				else if(intnum[i] == 4) {     //intnumのi番目が4のとき
					output_en_de_Num[i] = intword[4];     //4番目を代入
				}
				else if(intnum[i] == 5) {     //intnumのi番目が5のとき
					output_en_de_Num[i] = intword[5];     //5番目を代入
				}
				else if(intnum[i] == 6) {     //intnumのi番目が6のとき
					output_en_de_Num[i] = intword[6];     //6番目を代入
				}
				else if(intnum[i] == 7) {     //intnumのi番目が7のとき
					output_en_de_Num[i] = intword[7];     //7番目を代入
				}
				else if(intnum[i] == 8) {     //intnumのi番目が8のとき
					output_en_de_Num[i] = intword[8];     //8番目を代入
				}
				else if(intnum[i] == 9) {     //intnumのi番目が9のとき
					output_en_de_Num[i] = intword[9];     //9番目を代入
				}
			}
			else if(en_de.equals("decode")) {     //decodeと入力された場合
				for(int j = 0; j < intword.length; j++) {
					if(intnum[i] == intword[j]) {     //復元する数値と変換対応表の数値が同じ場合
						output_en_de_Num[i] = code_before[j];     //暗号化する前の配列を代入
					}
				}
			}
		}

		//結果を出力
		for(int a = 0; a < output_en_de_Num.length; a++) {
			if(a != output_en_de_Num.length-1) {
				System.out.print(output_en_de_Num[a]);
			}
			else {
				System.out.println(output_en_de_Num[a]);
			}
		}
	}
}
