/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題6  在庫を減らす
 *
 * [問題5]までの表示を行った後で
 * 3種のマカロンそれぞれの在庫を減らす処理を追記し
 * 以下の実行例と同じものを最後に表示してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り22個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り24個
 *
 */

package lesson01.challenge06;

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
		
		citronStock = citronStock - citoronbuy;
		chocolatStock = chocolatStock - chocolatebuy;
		pistacheStock = pistacheStock - pistachebuy;
		 
		 System.out.println("本日のおすすめです。");
		 
		 System.out.println("シトロン　　　\\250・・・残り" + citronStock + "個");
		 System.out.println("ショコラ　　　\\280・・・残り" + chocolatStock+ "個");
		 System.out.println("ピスターシュ　\\320・・・残り" + pistacheStock + "個");
		 
		
}


}


