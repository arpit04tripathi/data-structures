package ds.stack.runner;

import ds.stack.applications.BalancedParanthesesChecker;
import ds.stack.applications.EvaluatePostfixExpression;

public class StackApplicationsRunner {

	public static void main(String[] args) {
		checkParanthesesBalancing("[{()}]");
		checkParanthesesBalancing("[{(})]");
		checkParanthesesBalancing("[{)(}]");
		evaluatePostfixExpression("98*9+");
	}

	private static void checkParanthesesBalancing(String expression) {
		System.out.println(expression + " --> " + BalancedParanthesesChecker.checkExpression(expression));
	}

	private static void evaluatePostfixExpression(String expression) {
		System.out.println(expression + " --> " + EvaluatePostfixExpression.evaluatePostfix(expression));
	}

}
