/**
 * 第5章 ロボット工場のお仕事
 *
 * 問題7  水量を表示する
 *
 * ロボット内の残水量を戻り値として返すメソッドを追加します。
 *
 * コメントの位置に適切なコードを記述し、
 * 実行例と同じメッセージを表示してください。
 *
 * <実行例>
 *  Rさん：
 *  でもこれランダムに水を入れた時にロボット内の水量がわかりませんね。
 *
 *  G博士：
 *  そう言えばそうじゃな。よし、ちょっと待っとれ。
 *
 *  G博士：
 *  ......出来た！現在の水量を表示する機能じゃ。
 *
 *  「ガ～ピィーガ～、ゲンザイノスイリョウハ【※残水量】リットルデス。」
 *
 *  Rさん：
 *  なんか雑音が気になりますが、一応出来てますね。
 *
 */

package lesson05.challenge07;

class Robot{
	int energy;
	String name;
	int water;
	void pumpWater() {
		
		System.out.println("水を"+water +"リットル出します\n");
	}
	 void randomWater() {
	        water = (int) (Math.random() * 10) % 9 + 1;
	    }
	void setWater(int water) {
		this.water = water;
}
	void makeOmelet (int eggNum,int butterNum) {
		int eOmelet1 = 2/eggNum;
		int eOmelet2 = 5/butterNum;
		if ( eOmelet1> eOmelet2) {
			System.out.println( eOmelet1+ "人分のオムレツを作成しました。");
			
		} else {
			System.out.println( eOmelet2 + "人分のオムレツを作成しました。");
		}
	}
		int getWater() {
			return water;
		}}
		
//ここに問題6で作成したクラスに次の条件を足したクラスを作成してください。
//メソッド名：getWater(引数なし、戻り値int、
//現在の水量(フィールドwaterの値)を戻り値として返す)

public class RobotMaker {

    public static void main(String[] args) {

        System.out.println("Rさん：");
        System.out.println("でもこれランダムに水を入れた時にロボット内の水量がわかりませんね。\n");
        System.out.println("G博士：");
        System.out.println("そう言えばそうじゃな。よし、ちょっと待っとれ。\n");
        System.out.println("G博士：");
        System.out.println("......出来た！現在の水量を表示する機能じゃ。\n");

        Robot robot = new Robot();
        robot.randomWater();
        int water = robot.getWater();
      
        
        
        
        //ここでRobotクラスのインスタンスを作り、
        //（インスタンス名はrobot）
        //randomWaterを実行する。
        //getWaterを実行する。

        System.out.println("「ガ～ピィーガ～、ゲンザイノスイリョウハ" + water + "リットルデス。」\n");

        System.out.println("Rさん：");
        System.out.println("なんか雑音が気になりますが、一応出来てますね。\n");
    }

}
