package basics;

public class OperatorsTest {
	
public static void main(String[] args) {
	arithmeticOperation();

}

private static void arithmeticOperation() {
	// TODO Auto-generated method stub
	// Declaring thres variables of the same type
	float num1 = 10 , num2 = 20.234f, num3;
	System.out.println(num1);
	num1 = 23.34f;
	System.out.println(num1);
	//sum
	float result= num1 +num2;
	System.out.println("The result is" + result);
	/*
	 * Operacion de resta
	 * ! el cpu lee el valor de la variable result 
	 * 2 se realiza la resta con el numero 1
	 * 3se guarda el resultado en la misma variable result
	 */
	result = result - 1;
	System.out.println("The result is" + result);
	result -= 1;
	System.out.println("The result is" + result);
	// multiplicacion
	result = result *2;
	System.out.println(" The result is" + result);
	result *= 2;
	System.out.println(" The result is" + result);
	// division
	result = result / 2;
	System.out.println(" The result is" + result);
	result /= 2;
	System.out.println(" The result is" + result);
	
}
}