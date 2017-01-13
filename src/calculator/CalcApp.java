package calculator;

import java.util.Scanner;


public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while( true ) {
			System.out.print(">> " );
			String expression = scanner.nextLine();
			
			if( expression.equals( "quit" ) ) {
				break;
			}
			
			String[] tokens = expression.split( " " );
			
			Arith arith = null;
			switch( tokens[1] ) {
				case "+" :
					arith = new Add();
					break;
				case "-" :
					arith = new Sub();
					break;
				case "*" :
					arith = new Mul();
					break;
				case "/" :
					arith = new Div();
					break;
				default :
					break;
			}
			
			if( arith != null ) {
				int lValue = Integer.parseInt( tokens[ 0 ] );
				int rValue = Integer.parseInt( tokens[ 2 ] );
				
				arith.setValue(lValue, rValue );
				int result = arith.calculate();
				System.out.println( ">> " + result );
			} else {
				System.out.println( ">> 알 수 없는 연산입니다." );
			}
		}
		
		scanner.close();
	}
}