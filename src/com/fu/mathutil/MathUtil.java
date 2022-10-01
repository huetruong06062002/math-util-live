package com.fu.mathutil;

/**
 *
 * @author ADMIN
 */
//TA VIẾT CÁI CLASS ĐỂ CUNG CẤP TIỆN ÍCH CHO NƠI KHÁC XÀI
//KHI TA CUNG CẤP TIỆN ÍCH CHO NƠI KHÁC XÀI, ĐÓ LÀ LÚC TA K CẦN NHỚ CÁI GÌ CHO
//RIÊNG TA, HÀM STATIC GIÚP LÀM ĐIỀU NÀY
public class MathUtil {

    //n! = 1.2.3.4.5.6...n
    //Quy ước: 0! = 1! =1
    //K tính giai thừa cho số âm
    //20! là vừa khớp kiểu long, kiểu long tối đa 18 con số 0
    //21! lố kiểu long
    //nếu đưa vào âm, 21 giai thừa, ta éo tính, ta đập vào mặt ai xài hàm
    //một cái ngoại lệ, chửi éo tính đc
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid argument. n must be between 0...20");
        }
        //hàm dừng liền éo cần return

        //xuống đây là n = 0..20 oy`
        if (n == 0 || n == 1) {
            return 1; //dừng ngay khi n đặc biệt
        }        //xuống đến đây, n = 2..20 oy`
        //chơi for hoặc đệ quy/recursion
        //kỹ thuật nhồi con heo đất, ốc bu dồn thịt
        //i = 2,i =3, i = 4,i = 5, i = n nhồi liên tục i vào tích
        long product = 1;//tích khởi đầu = 1, nhồi 2 3 4 5 6 7 8...n
        for (int i = 2; i <= n; i++) {
            //product : tích
            product *= i;//product = product đang có nhân con i, đập ngược trở lại liên tục
        }// nhân tử 2 đến  n
        return product;
    }
}
