public class Practice15 {
    public static void main(String[] args){
        /* for文 */
        for (int a = 0 ; a < 5 ; a++) {
            System.out.println("aの値は：" + a);
        }


        int b = 0;

        for (; b < 5 ; b++) {    // 式１を省略しているので、カウント変数をfor文外で宣言している
            System.out.println("bの値は：" + b);
        }


        for (int c = 0 ; c < 5 ;) {    // 式3を省略しているので、print時にc++でインクリメントをしている
            System.out.println("cの値は：" + c++);
        }
    }
}
