package com.optional;

public class User {

	public String getId(Integer id) {
		if (id==101) {
			return "Jhon";
		}else if(id==102) {
			return "Hi";
		}else if(id==103){
			return "hello";
		}
		else  {
			return null;
		}

	}

}
