/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moe.lisp;

import org.junit.Assert;
import org.junit.Test;

/**
 * クラスCalculatorに対するクラスケース
 * @author tanaka.taishsiro(20170615)
 */
public class CalculatorTest {
    /*練習2
    javadoc追加
    */
    
    /*練習3b
    命令カバレッジ100% && ブランチカバレッジ100%
    */
    
    /*練習1a*/
    /**
     * 2引数が正整数の場合のテスト <br>
     * 対象：multiply(int, int) <br>
     * 条件：引数 10, 20 <br>
     * 期待する結果：戻り値 200 <br> 
     */
    @Test
    public void testMultiply01(){
        Calculator calc = new Calculator();
        int expected = 200;
        int actual = calc.multiply(10, 20);
        Assert.assertEquals(expected, actual);
    }
    
    /**
     * 引数の一方が正数、他方が負数の場合のテスト <br>
     * 対象：multiply(int, int) <br>
     * 条件：引数 -10, 20 <br>
     * 期待する結果：戻り値 -200 <br> 
     */
    @Test
    public void testMultiply02(){
        Calculator calc = new Calculator();
        int expected = -200;
        int actual = calc.multiply(-10, 20);
        Assert.assertEquals(expected, actual);
    }
    
    /**
     * 引数の一方が0、他方が負数の場合のテスト <br>
     * 対象：multiply(int, int) <br>
     * 条件：引数 0, -20 <br>
     * 期待する結果：戻り値 0 <br> 
     */
    @Test
    public void testMultiply03(){
        Calculator calc = new Calculator();
        int expected = 0;
        int actual = calc.multiply(0, -20);
        Assert.assertEquals(expected, actual);
    }
    
    
    /*練習1b*/
    /**
     * a < b, b < c, c > aの場合のテスト <br>
     * 対象：max(int, int, int) <br>
     * 条件：引数 10, 20, 30 <br>
     * 期待する結果：戻り値 30 <br> 
     */
    @Test
    public void testMax01(){
        Calculator calc = new Calculator();
        int expected = 30;
        int actual = calc.max(10, 20, 30);
        Assert.assertEquals(expected, actual);
    }
    
    /**
     * a > b, b > c, c < aの場合のテスト <br>
     * 対象：max(int, int, int) <br>
     * 条件：引数 30, 20, 10 <br>
     * 期待する結果：戻り値 30 <br> 
     */
    @Test
    public void testMax02(){
        Calculator calc = new Calculator();
        int expected = 30;
        int actual = calc.max(30, 20, 10);
        Assert.assertEquals(expected, actual);
    }
    
    /**
     * a < b, b > c, c < aの場合のテスト <br>
     * 対象：max(int, int, int) <br>
     * 条件：引数 20, 30, 10 <br>
     * 期待する結果：戻り値 30 <br> 
     */
    @Test
    public void testMax03(){
        Calculator calc = new Calculator();
        int expected = 30;
        int actual = calc.max(20, 30, 10);
        Assert.assertEquals(expected, actual);
    }
    
    
    /*練習1c
    2変数の大小比較だと
    　a > b
    　a < b
    　a == b
    の3つ
    
    3変数だと
    ab, bc, ac それぞれ3通りなので
    3 * 3 * 3 = 27通り
    
    ab, bcの大小関係が以下の場合以外では、acの大小関係が定まる
     a > b, b < c
     a < b, b > c
    従って、全部で13通り
    */
    
    /**
     * a < b, b > cの場合のテスト <br>
     * 対象：max(int, int, int) <br>
     * 条件：引数 10, 20, 30 <br>
     * 期待する結果：戻り値 30 <br> 
     */
    @Test
    public void testMax04(){
        Calculator calc = new Calculator();
        int expected = 30;
        int actual = calc.max(10, 20, 30);
        Assert.assertEquals(expected, actual);
    }
    
    /**
     * a > b, b < c, c < aの場合のテスト <br>
     * 対象：max(int, int, int) <br>
     * 条件：引数 30, 10, 20 <br>
     * 期待する結果：戻り値 30 <br> 
     */
    @Test
    public void testMax05(){
        Calculator calc = new Calculator();
        int expected = 30;
        int actual = calc.max(30, 10, 20);
        Assert.assertEquals(expected, actual);
    }
    
    /**
     * a > b, b < c, c > aの場合のテスト <br>
     * 対象：max(int, int, int) <br>
     * 条件：引数 20, 10, 30 <br>
     * 期待する結果：戻り値 30 <br> 
     */
    @Test
    public void testMax06(){
        Calculator calc = new Calculator();
        int expected = 30;
        int actual = calc.max(20, 10, 30);
        Assert.assertEquals(expected, actual);
    }
    
    /**
     * a > b, b < c, c == aの場合のテスト <br>
     * 対象：max(int, int, int) <br>
     * 条件：引数 30, 10, 30 <br>
     * 期待する結果：戻り値 30 <br> 
     */
    @Test
    public void testMax07(){
        Calculator calc = new Calculator();
        int expected = 30;
        int actual = calc.max(30, 10, 30);
        Assert.assertEquals(expected, actual);
    }
    
    /**
     * a == b, b < cの場合のテスト <br>
     * 対象：max(int, int, int) <br>
     * 条件：引数 10, 10, 30 <br>
     * 期待する結果：戻り値 30 <br> 
     */
    @Test
    public void testMax08(){
        Calculator calc = new Calculator();
        int expected = 30;
        int actual = calc.max(10, 10, 30);
        Assert.assertEquals(expected, actual);
    }
    
    /**
     * a < b, b > c, c < aの場合のテスト <br>
     * 対象：max(int, int, int) <br>
     * 条件：引数 20, 30, 20 <br>
     * 期待する結果：戻り値 30 <br> 
     */
    @Test
    public void testMax09(){
        Calculator calc = new Calculator();
        int expected = 30;
        int actual = calc.max(20, 30, 10);
        Assert.assertEquals(expected, actual);
    }
    
    /**
     * a < b, b > c, c > aの場合のテスト <br>
     * 対象：max(int, int, int) <br>
     * 条件：引数 10, 30, 20 <br>
     * 期待する結果：戻り値 30 <br> 
     */
    @Test
    public void testMax10(){
        Calculator calc = new Calculator();
        int expected = 30;
        int actual = calc.max(10, 30, 20);
        Assert.assertEquals(expected, actual);
    }
    
    /**
     * a < b, b > c, c == aの場合のテスト <br>
     * 対象：max(int, int, int) <br>
     * 条件：引数 30, 10, 20 <br>
     * 期待する結果：戻り値 30 <br> 
     */
    @Test
    public void testMax11(){
        Calculator calc = new Calculator();
        int expected = 30;
        int actual = calc.max(10, 30, 10);
        Assert.assertEquals(expected, actual);
    }
    
    /**
     * a > b, b > cの場合のテスト <br>
     * 対象：max(int, int, int) <br>
     * 条件：引数 30, 20, 10 <br>
     * 期待する結果：戻り値 30 <br> 
     */
    @Test
    public void testMax12(){
        Calculator calc = new Calculator();
        int expected = 30;
        int actual = calc.max(30, 20, 10);
        Assert.assertEquals(expected, actual);
    }
    
    /**
     * a == b, b > cの場合のテスト <br>
     * 対象：max(int, int, int) <br>
     * 条件：引数 30, 30, 10 <br>
     * 期待する結果：戻り値 30 <br> 
     */
    @Test
    public void testMax13(){
        Calculator calc = new Calculator();
        int expected = 30;
        int actual = calc.max(30, 30, 10);
        Assert.assertEquals(expected, actual);
    }
    
    /**
     * a < b, b == cの場合のテスト <br>
     * 対象：max(int, int, int) <br>
     * 条件：引数 10, 30, 30 <br>
     * 期待する結果：戻り値 30 <br> 
     */
    @Test
    public void testMax14(){
        Calculator calc = new Calculator();
        int expected = 30;
        int actual = calc.max(10, 30, 30);
        Assert.assertEquals(expected, actual);
    }
    
    /**
     * a > b, b == cの場合のテスト <br>
     * 対象：max(int, int, int) <br>
     * 条件：引数 30, 10, 10 <br>
     * 期待する結果：戻り値 30 <br> 
     */
    @Test
    public void testMax15(){
        Calculator calc = new Calculator();
        int expected = 30;
        int actual = calc.max(30, 10, 10);
        Assert.assertEquals(expected, actual);
    }
    
    /**
     * a == b, b == cの場合のテスト <br>
     * 対象：max(int, int, int) <br>
     * 条件：引数 30, 30, 30 <br>
     * 期待する結果：戻り値 30 <br> 
     */
    @Test
    public void testMax16(){
        Calculator calc = new Calculator();
        int expected = 30;
        int actual = calc.max(30, 30, 30);
        Assert.assertEquals(expected, actual);
    }
}
