package org.projectlombo.lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.Synchronized;
import lombok.ToString;
import lombok.Value;

/*@Getter
@Setter
@Data*/
//@AllArgsConstructor
//@NoArgsConstructor
//@RequiredArgsConstructor

//@Value
//@ToString
public class Chef {
	
	private @NonNull String name; 
	 @NonNull private int age; 
	 
	 @Synchronized
	 public void instanceMethod() {
		 ;;
	 }
	 public void statcMethod() {
		 ;;
	 }
	 
	 public synchronized void instanceMethod2() {
		 ; ;
	 } //staticMethod 
	 

} //end class 
