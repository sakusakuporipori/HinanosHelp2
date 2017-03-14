package 御影百合絵からののお願い;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class YuriesHope {
	public static void main(String[] args) throws IOException {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);

		int sum = 0;     //合計値を初期化

		for(int i = 0; i < 3; i++) {
			String line = br.readLine();     //改行
			int num = Integer.parseInt(line);     //int化
			sum = sum + num;     //1行ごとに足していく
		}

		System.out.println(sum);     //合計値を出力
	}
}
