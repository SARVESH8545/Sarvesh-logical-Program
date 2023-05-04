package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayTOListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []array= {"abc","def","hij","mno"};
		System.out.println("Array is :"+Arrays.toString(array));

		List<String> list=new ArrayList<>();
		for (String l :array) {
			list.add(l);
		}
		System.out.println("Printing list"+list);

	}

}
