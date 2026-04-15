/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題5 合計金額を求める
 *
 * 入力されたマカロンの個数から合計購入数、合計金額を求めます。
 * 合計購入数、合計金額を求める処理を追記した後で
 * [問題4]の表示を実行例を参考にして改変してください。
 *
 * <実行例>
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >8
 * ショコラ      >2
 * ピスターシュ  >6
 *
 * シトロン     8個
 * ショコラ     2個
 * ピスターシュ 6個
 *
 * 合計個数    16個
 * 合計金額  4480円
 *
 * をお買いあげですね。
 * 承りました。
 *
 */

package lesson01.challenge05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
public static void main(String[] args) throws IOException {
		
		System.out.println("たいへんお待たせしました。");
		System.out.println("【ポエール・ネルメ】");
		System.out.println("ただいまより開店です！！");
		
		int citronStock = 30;
		int chocolatStock = 30;
		int pistacheStock = 30;
		
		System.out.println("本日のおすすめ商品です。\n");
		System.out.println("シトロン　　　\\250・・・残り" + citronStock + "個");
		System.out.println("ショコラ　　　\\280・・・残り"+ chocolatStock + "個");
		System.out.println("ピスターシュ　\\320・・・残り"+ pistacheStock + "個");
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("それぞれ何個買いますか？（最大30個まで）");
		System.out.println("シトロン　　>");
		
		 
		String citoronbuystr = reader.readLine();
		int citoronbuy= Integer.parseInt(citoronbuystr);
		
		System.out.println("ショコラ　　>");
		String chocolatebuystr = reader.readLine();
		int chocolatebuy = Integer.parseInt(chocolatebuystr);
		
		System.out.println("ピスターシュ　　>");
		String  pistachebuystr  = reader.readLine();
		int pistachebuy = Integer.parseInt(pistachebuystr);
		
		System.out.println("シトロン" + citoronbuy + "個");
		System.out.println("ショコラ" + chocolatebuy + "個");
		System.out.println("ピスターシュ" + pistachebuy  + "個");
		
		int total = citoronbuy + chocolatebuy + pistachebuy;
		int price = 250 * citoronbuy + 280 * chocolatebuy + 320 * pistachebuy;
		
		System.out.println("合計個数" + total + "個");
		System.out.println("合計金額" + price + "円");
		System.out.println("をお買い上げですね。");
		System.out.println("承りました。");
		
}

}



