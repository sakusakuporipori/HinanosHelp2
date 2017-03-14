package 園田冴絵からの応援要請;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SonodasHelp {
	public static void main(String[] args) throws IOException {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		String line = br.readLine();     //文字列読み込み

		String[] worddelimiter = line.split(" ", 3);     //半角スペース区切り　領域3つ
		int num1 = Integer.parseInt(worddelimiter[0]);     //int化
		int num2 = Integer.parseInt(worddelimiter[1]);     //int化

		if(worddelimiter[2].equals("+")) {     //worddelimiterの2番目が+の場合
			System.out.println(num1 + num2);     //足し算
		} else if(worddelimiter[2].equals("-")) {     //worddelimiterの2番目が-の場合
			System.out.println(num1 - num2);     //引き算
		}
	}
}
