package prob02;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;
	
	public static void main(String[] args) {
		System.out.println( Math.PI );
		
		Scanner scanner = new Scanner( System.in );
		
		Goods[] goods = new Goods[ COUNT_GOODS ];
		
		//상품 입력
		for( int i = 0; i < COUNT_GOODS; i++ ) {
			String name = scanner.next();
			int price = scanner.nextInt();
			int countStock = scanner.nextInt();
			
			goods[ i ] = new Goods();
			goods[ i ].setName(name);
			goods[ i ].setPrice(price);
			goods[ i ].setCountStock(countStock);
		}
		
		//상품 정보 출력
		for( Goods g : goods ) {
			System.out.println( 
				g.getName() +
				"(가격:" + g.getPrice() + ")이 " +
				g.getCountStock() + "개 입고 되었습니다." );
		}
		
		//자원정리
		scanner.close();
	}
}
