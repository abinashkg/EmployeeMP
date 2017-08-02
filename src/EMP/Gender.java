package EMP;
import java.util.*;

public enum Gender {
	
	MALE("Male") , FEMALE("Female") , NA("Others");
	
	final  String value;
	
	private Gender(String value) {
		this.value=value;
	}
	
	public static Map<String,Gender> lookup = new HashMap<>();
	
	static{
		for(Gender gender:Gender.values()){
			lookup.put(gender.getValue(),gender);
		}
	}

	public String getValue() {
		return value;
	}
	
	public static Gender get(String value ){
		return lookup.get(value);
	}
}
