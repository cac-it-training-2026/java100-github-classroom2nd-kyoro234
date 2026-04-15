/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題9 新商品の開発
 *
 * 翌日から新商品を発売することにしました。
 * 新商品の名前は「三色マカロン」です。
 * シトロン、ショコラ、ピスターシュの３つの味が
 * 1個のマカロンに集約されているのが特徴で、
 * その配合率は前日の売上比で決まり、
 * 価格はマカロン１個あたりの平均売上価格に準じて
 * 自動的に決定されます。（ただし、1の位は切り捨て）
 *
 * 以下の実行例を参考に処理を追記、改変してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 閉店時間となりました。
 * またのお越しをお待ちしております。
 *
 * 売上の割合
 * 売上合計      \2470
 *
 * 内訳
 * シトロン      \1250・・・ 50%
 * ショコラ      \420・・・ 17%
 * ピスターシュ  \800・・・ 32%
 *
 * 明日の三色マカロンの配合率が決まりました！
 *
 * シトロンの味    ・・・ 50%
 * ショコラの味    ・・・ 17%
 * ピスターシュの味・・・ 32%
 *
 * が楽しめます！
 *
 * 値段は\270です。
 *
 */

package lesson01.challenge09;

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
		double citoronbuy= Double.parseDouble(citoronbuystr);
		
		System.out.println("ショコラ　　>");
		String chocolatebuystr = reader.readLine();
		double chocolatebuy = Double.parseDouble(chocolatebuystr);
		
		System.out.println("ピスターシュ　　>");
		String  pistachebuystr  = reader.readLine();
		double pistachebuy =Double.parseDouble(pistachebuystr);
		
		System.out.println("シトロン" + citoronbuy + "個");
		System.out.println("ショコラ" + chocolatebuy + "個");
		System.out.println("ピスターシュ" + pistachebuy  + "個");
		
		double total = citoronbuy + chocolatebuy + pistachebuy;
		int price = (int)(250 * citoronbuy + 280 * chocolatebuy + 320 * pistachebuy);
		
		System.out.println("合計個数" + total + "個");
		System.out.println("合計金額" + price + "円");
		System.out.println("をお買い上げですね。");
		System.out.println("承りました。");
		
		citronStock = (int)(citronStock - citoronbuy);
		chocolatStock = (int)(chocolatStock - chocolatebuy);
		pistacheStock = (int)(pistacheStock - pistachebuy);
		 
		 System.out.println("本日のおすすめです。");
		 
		 System.out.println("シトロン　　　\\250・・・残り" + citronStock + "個");
		 System.out.println("ショコラ　　　\\280・・・残り" + chocolatStock+ "個");
		 System.out.println("ピスターシュ　\\320・・・残り" + pistacheStock + "個");
		 
		 System.out.println("閉店時間となりました。");
		 System.out.println("またのお越しをお待ちしております。");
		 
		 int citoronpercent = (int)((250 * citoronbuy)/price * 100);
		 int chocolatepercent = (int)((280 * chocolatebuy)/price * 100);
		 int pisrachepercent = (int)((320 * pistachebuy)/price * 100);
		 
		 
		 System.out.println("売上の割合");
		 System.out.println("売上合計    \\"+price);
		 System.out.println("内訳");
		 System.out.println("シトロン   \\" + (int)(250 * citoronbuy)+"・・・"+ citoronpercent +"%");
		 System.out.println("ショコラ   \\" + (int)(280 * chocolatebuy)+"・・・"+chocolatepercent+ "%");
		 System.out.println("ピスターシュ   \\" + (int)(320 * pistachebuy)+"・・・"+pisrachepercent+ "%");
		 
		 System.out.println("明日の三色マカロンの配合率が決まりました！");
		 
		 System.out.println("シトロンの味   ・・・" +citoronpercent+ "%" );
		 System.out.println("ショコラの味   ・・・" +chocolatepercent+ "%" );
		 System.out.println("ピスターシュの味   ・・・" +pisrachepercent+ "%" );
		 
		 System.out.println("\nが楽しめます！");
		 
		 System.out.println("値段は"+ (int)((price/total)/ 10 * 10 )+"です。");
		 
		 
		 
		
}


}
