import java.io.*;
import java.util.*;
class ASDFGH
{
	public static void main(String args[])

	{

	String string = " ";

	Scanner in = new Scanner(System.in);

	System.out.println("�Enter a sentence : �");

	string= in.nextLine();

	System.out.println("�Last word of the sentence is : " + string.substring (string.lastIndexOf (' '), string.length()));

	}

	}