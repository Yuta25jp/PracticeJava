import java.io.File;

public class CreateFolderSample{
  public static void main(String args[]){

    //Fileオブジェクトを生成する
    File f = new File("Desktop:\\hoge");

    if (!f.exists()) {
      //フォルダ作成実行
      f.mkdirs();
      System.out.println("フォルダを作成しました。");

    } else {
      System.out.println("フォルダは既に存在しています。");
    }

  }

}
