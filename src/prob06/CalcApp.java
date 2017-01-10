package prob06;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		// 힌트: Scanner 와 String 클래스의 split 함수를 사용합니다.
		
		Scanner scanner = new Scanner(System.in);
		
		while( true ) {
			/*  코드를 완성 합니다 */

			System.out.print(">> " );
			String expression = scanner.nextLine();
			
			if( expression.equals( "quit" ) ) {
				break;
			}
			
			String[] tokens = expression.split( " " );
			int lValue = Integer.parseInt( tokens[ 0 ] );
			int rValue = Integer.parseInt( tokens[ 2 ] );
			switch( tokens[1] ) {
				case "+" : {
					Add add = new Add();
					
					add.setValue( lValue, rValue );
					int result = add.calculate();
					System.out.println( ">> " + result );
					
					break;
				}
				case "-" : {
					Sub sub = new Sub();
					
					sub.setValue( lValue, rValue );
					int result = sub.calculate();
					System.out.println( ">> " + result );
					
					break;
				}				
				case "*" : {
					Mul mul = new Mul();
					
					mul.setValue( lValue, rValue );
					int result = mul.calculate();
					System.out.println( ">> " + result );
					
					break;
				}				
				case "/" : {
					Div div = new Div();
					
					div.setValue( lValue, rValue );
					int result = div.calculate();
					System.out.println( ">> " + result );
					
					break;
				}
				default : {
					System.out.println( ">> 알 수 없는 연산 입니다." );
					break;
				}
			}
		}
		
		scanner.close();
	}
}