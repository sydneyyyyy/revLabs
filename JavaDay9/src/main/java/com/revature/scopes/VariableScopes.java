package com.revature.scopes;


/*
 * When a variable is declared in a Java Program, it is attached to a specific scope in a program
 * This scope is determined by where the variable resides (where it is declared).
 * 
 * The different variable scopes in Java are:
 * 
 * Class (or static) Scope
 * Instance (or object) Scope
 * Method Scope
 * Block Scope
 * 
 * 
 * 
 * */

public class VariableScopes {

	/*
	 * Class Scope variables reside in the class definition themselves.
	 * 
	 * This means that when an object updates a class-scope variable, that change is reflected
	 * across all instances of the class.
	 * 
	 * Class scope is declared with the static keyword.
	 * 
	 * Methods can also be declared as class scope
	 * 
	 * When we declare a variable as class scope, we should reference it through the class, not an instance.
	 * 
	 * VariableScope.classScope
	 * 
	 * */
	
	public static String classScape;
	
	/*
	 * Instance Scope - means that the variable is attached to an individual objects created from the class.
	 * When an instance-scoped variable is modified, it has no effect on the other, distinct instance of the class. 
	 * 
	 * */
	
	
	public String instanceScope;
	
	
	
	// Static methods are considered class scope because they don't need an instance of the class to run.
	public static void classScopeMethod() {};
	
	/*
	 * Method scope - is the scope of a variable declared within a method block whether it is a static or instance method
	 * These method scoped variables are only available (visible) with the method they are declared.
	 * They do not exist after the method executes. 
	 * */
	
	public static void methodScopeExampleMethod(String methodScopeParameter) { // this parameter is also considered methodScope. 
		
		// This variable only exists for the duration of this method
		String methodScope = "I'm method scope.";
		
	}
	
	/*
	 * Block Scope - variables only exists within the specific control flow block:
	 * 		for, if/else, while, do-while, switch statements/cases... -> {}
	 * 
	 * After the block ends, the variables declared within it are no longer available
	 * 
	 * */
	
	public static void main(String[] args) {
		
		if (true) { 
			String str = "Hello";
			
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		// str - we are outside of the block where it was declared
		// i - not available outside of it's for-loop declaration
	}
	
	
	
	
	
	
	
	
	
	
	
}
