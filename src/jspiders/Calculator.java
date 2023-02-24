package jspiders;

public interface Calculator {

	int add(int x, int y);
	int sub(int x, int y);
	int mul(int x, int y);
	int div(int x, int y);
	String displayErrorMessage();
}
//all the methods are automatically public and abstract