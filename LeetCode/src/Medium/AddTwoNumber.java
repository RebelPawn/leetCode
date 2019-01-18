package Medium;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

/**
 * You are given two non-empty linked lists representing two non-negative integers. 
 * The digits are stored in reverse order and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * @author Administrator
 * @time 2019年1月18日 上午10:14:02 
 */
public class AddTwoNumber {

	@Test
	public void test() {
		LinkedList<String> str1= new LinkedList<>();
		str1.push("2");
		str1.push("4");
		str1.push("3");
		LinkedList<String> str2= new LinkedList<>();
		str2.push("5");
		str2.push("6");
		str2.push("4");
		
		int length=str1.size();
		String sb1 = str1.get(length-1);
		for(int index=1;index<length;index++) {
			sb1=sb1+str1.get(length-index-1);
		}
		int num2=Integer.parseInt(sb1);
		
		int length2=str2.size();
		String sb2 = str2.get(length-1);
		for(int index=1;index<length2;index++) {
			sb2=sb2+str2.get(length-index-1);
		}
		
		int num3=Integer.parseInt(sb2);
		System.err.println(num2+num3);
	}
}
