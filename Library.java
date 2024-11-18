import java.util.Scanner;

class OnlineLibrary {
	String[] arr_availableBooks = new String[10];
	String[] arr_issueBook = new String[10];
	void addBook(){};
	void issueBook(){};
	void returnBook(){};
	void showAvailableBooks(){};
}

public class Library extends OnlineLibrary {
public static void main(String[] args) {
	OnlineLibrary a = new OnlineLibrary();
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the name of the book you want to issue: ");
	String str = sc.nextLine();
	
	a.arr_issueBook[0] = str;
}
}