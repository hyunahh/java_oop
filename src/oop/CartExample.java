package oop;

import java.util.Date;
import com.ezen.shop.Cart;

// 권장
//import com.ezen.shop.Cart; //파일 package명 다 적어줘야함 ex)com.* (X) crtl+shift+o
// 비권장
//import com.ezen.shop.*;	
// static import
import static java.lang.System.out;
import static java.lang.Math.*;

public class CartExample {

	public static void main(String[] args) {
		Cart cart;
//		com.ezen.shop cart cart1;
		cart = new Cart();
		cart.addItem("초코파이");

		Date today = new Date();
		String ymd = today.toLocaleString();
		System.out.println(ymd);

		out.println("스태틱 임포트 사용하기");
		int x = 40, y = 35;
//		int result = max(x, y);
		int result = Math.max(x,y);
		System.out.println(result);
	}

}
