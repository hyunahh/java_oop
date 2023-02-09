package ezen.shoppingmall;

public class ESM {

	public static void main(String[] args) {

		Cart myCart = new Cart(100);
		Album album = new Album(10, "Dynamite", 10000, "BTS");

		// 카트에 상품 담기
		myCart.addItem(album);

		Movie movie = new Movie(11, "아바타2", 15000, "제임스카메론", "김기정");
		myCart.addItem(movie);

		// 카트 상품 목록 조회
		Item[] myItems = myCart.getItems();
		for (int i = 0; i < myCart.getCount(); i++) {
			System.out.println(myItems[i]);
		}

		// 카트 상품 검색 조회
		System.out.println("--------검색테스트--------");
		String searchName = "Dynamite";
		Item searchItem = myCart.findByItem(searchName);
		if (searchItem != null) {
//			System.out.println(searchItem.toString());
			System.out.println(searchItem);
			Album al = (Album) searchItem;
			System.out.println(al.getArtist());
		} else {
			System.out.println("검색된 상품이 없습니다.");
		}

		// 카트 상품 제거
		System.out.println("--------삭제테스트--------");

		if (myCart.equals(myCart.removeItem("아바타2"))) {
			System.out.println("삭제 되었습니다.");
		} else {
			System.out.println("삭제가 되지 않았습니다.");
		}

		// 삭제 후 상품목록 조회
		System.out.println("--------삭제 후 조회-------");
		myItems = myCart.getItems();
		for (int i = 0; i < myCart.getCount(); i++) {
			System.out.println(myItems[i]);
		}

		System.out.println("----------------");
		
		// 카트 비우기 테스트
		myCart.removeAll();
		System.out.println(myCart.getCount());
	}
}
