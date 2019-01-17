import java.util.Random;
import java.io.*;

public class Janken{
  public static void main(String args[]) throws IOException{
        int com , you , win = 0 , lose = 0 , draw = 0, vs = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("コンピューターとじゃんけんを10回します。");
        Random rnd = new Random(); //乱数rndの生成と初期化

        for (int i = 1 ; i <= 10 ; i++ ) {
          System.out.print("グー(1),チョキ(2),パー(3)のいずれかの番号を入力 =>");
          /*
            自分の入力
          */
            you = Integer.parseInt(br.readLine());
          /*
            comの入力
          */
            com = rnd.nextInt(3) + 1 ;
          if (you == 1 && com == 1) {
              System.out.println("あいこで引き分け");
              draw += 1;
              vs += 1;
          }
          if (you == 2 && com == 2) {
            System.out.println("あいこで引き分け");
            draw += 1;
            vs += 1;
          }
          if (you == 3 && com == 3) {
            System.out.println("あいこで引き分け");
            draw += 1;
            vs += 1;
          }
          if (you == 1 && com == 2) {
            System.out.println("グーを出した君の勝ち");
            win += 1;
            vs += 1;
          }
          if (you == 1 && com == 3) {
            System.out.println("グーを出した君の負け");
            lose += 1;
            vs += 1;
          }
          if (you == 2 && com == 1) {
            System.out.println("チョキを出した君の負け");
            lose += 1;
            vs += 1;
          }
          if (you == 2 && com == 3) {
            System.out.println("チョキを出した君の勝ち");
            win += 1;
            vs += 1;
          }
          if (you == 3 && com == 1) {
            System.out.println("パーを出した君の勝ち");
            win += 1;
            vs += 1;
          }
          if (you == 3 && com == 2) {
            System.out.println("パーを出した君の負け");
            lose += 1;
            vs += 1;
          }

        }
        System.out.println("あなたの戦績は、" + vs + "戦" + win + "勝" + lose + "敗" + draw + "分");
      }

}
