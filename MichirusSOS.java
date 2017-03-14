package 春日みちるからのSOS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MichirusSOS {
	public static void main(String[] args) throws IOException {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		String line = br.readLine();     //文字列入力

		if(line.matches(".*help.*")) {     //文字列中に"help"を含む場合
			System.out.println("SOS");     //"SOS"と出力
		} else {     //それ以外の場合
			System.out.println(line);     //そのまま出力
		}
	}
}
