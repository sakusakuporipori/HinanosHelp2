package 芦屋川雛乃からのヘルプ依頼;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HinanosHelp2 {
	public static void main(String[] args) throws IOException {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		String line1 = br.readLine();

		String[] worddelimiter = line1.split(" ", 10);
		int[] intword = new int[worddelimiter.length];
		int[] code_before = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		for (int i = 0; i < worddelimiter.length; i++) {
			intword[i] = Integer.parseInt(worddelimiter[i]);
		}

		String en_de = br.readLine();

		String StNum = br.readLine();
		char[] charArray = StNum.toCharArray();
		String word = "";

		int[] intnum = new int[charArray.length];
		int[] output_en_de_Num = new int[StNum.length()];

		for (int q = 0; q < charArray.length; q++) {
			String tempword = String.valueOf(charArray[q]);
			word = tempword;
			intnum[q] = Integer.parseInt(word);
		}

		for (int i = 0; i < intnum.length; i++) {
			if (en_de.equals("encode")) {
				if (intnum[i] == 0) {
					output_en_de_Num[i] = intword[0];
				}
				else if (intnum[i] == 1) {
					output_en_de_Num[i] = intword[1];
				}
				else if (intnum[i] == 2) {
					output_en_de_Num[i] = intword[2];
				}
				else if(intnum[i] == 3) {
					output_en_de_Num[i] = intword[3];
				}
				else if(intnum[i] == 4) {
					output_en_de_Num[i] = intword[4];
				}
				else if(intnum[i] == 5) {
					output_en_de_Num[i] = intword[5];
				}
				else if(intnum[i] == 6) {
					output_en_de_Num[i] = intword[6];
				}
				else if(intnum[i] == 7) {
					output_en_de_Num[i] = intword[7];
				}
				else if(intnum[i] == 8) {
					output_en_de_Num[i] = intword[8];
				}
				else if(intnum[i] == 9) {
					output_en_de_Num[i] = intword[9];
				}
			}
			else if(en_de.equals("decode")) {
				for(int j = 0; j < intword.length; j++) {
					if(intnum[i] == intword[j]) {
						output_en_de_Num[i] = code_before[j];
					}
				}
			}
		}

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
