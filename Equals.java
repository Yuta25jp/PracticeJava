public class Equals {
    public static void main(String[] args) {
      String str1 ="abcde";
      String str2 ="abcde";
      String str3 ="jcisd";
      String str4 ="Abcde";

      // 「A.equals(B)」でAとBが同じ値かどうかを判定
      System.out.println(str1.equals(str2));
      System.out.println(str1.equals(str3));

      //「A.equalsIgnoreCase(B)」で大文字小文字区別せず判別
      System.out.println(str1.equalsIgnoreCase(str4));


    }

}
