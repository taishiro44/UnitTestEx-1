package moe.lisp;

/**
 * テスト対象の例．下記引用元のリスト1.11を元に一部改変．
 * 渡辺 著『JUnit実践入門』技術評論社, p.21 (2012).
 * @author tanaka.taishiro(20170615)
 */
public class Calculator {
    /**
     * 2引数の積を返す．
     * @return xとyの積
     */
    public int multiply(int x, int y) {
        return x * y;
    }

    /**
     * 3引数a, b, cの最大値を返す
     * テストの練習のため，わかりにくいコードにしてある．
     * @return a, b, cの最大値
     */
    public int max(int a, int b, int c) {
        /*練習1c*/
        int x;
        if (a > b) {
            if (b > c) {
                x = a;
            } else if (c > a) {
                x = c;
            } else {
                x = a;
            }
        } else {
            if (b > c) {
                x = b;
            } else {
                x = c;
            }
        }
        return x;
    }
}
