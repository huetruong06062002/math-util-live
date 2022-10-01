/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathutil;


public class MathUtilLive {

    public static void main(String[] args) {
        long result = MathUtil.getFactorial(5); //hàm tính đi coi là mấy
        System.out.println("expected: 5! = 120; actual: " + result);
        
        System.out.println("expected: 6! = 720; actual: " + MathUtil.getFactorial(6));
        System.out.println("expected: 0! = 1  ; actual: " + MathUtil.getFactorial(0));
        
        //MathUtil.getFactorial(-5);//ném ngoại lệ thật rồi, ai biểu đưa ngoại lệ cà trớn chi
        
        //Kĩ thuật kiểm thử phần mềm : ước lượng xem giá trị trả về của hàm là gì
        //Expected value : 5! = 120
        //mày/hàm ai đó viết khi chạy thực tế là mấy - actual, giả sử 20
        //if expected --actual, hàm ngon trong tình huống này
    }
    
}
