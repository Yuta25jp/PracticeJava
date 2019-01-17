public class Final {

    //メンバ変数
    final public String str1 = "test";  //final指定したら初期値の指定は必須
    //final public String str2;           ←初期値を指定しないとエラーです

    //メソッド
    public void hoge(){

        final String str3 = "てすと";  //ローカル変数にも指定可能

        str1 = "TEST";  //final指定した変数に値の代入は不可。
        str3 = "TEST";  //final指定した変数に値の代入は不可。

    }
}
