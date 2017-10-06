package classwork06;

import java.util.*;

public class testClass {

	public static void main(String[] args) {
		/*Hurricane irma = new Hurricane();
		Hurricane maria = new Hurricane("maria", 4, 88, 1.0);
		Hurricane jose = new Hurricane("Jose", 2, 22, 5.2);

		System.out.println(maria.toString());
		System.out.println(jose);//Same output w or w/o toString
				//Printing invokes toString since toString is in class*/
		int numberOfHurricanes = 3;
		Hurricane []hurricanes = new Hurricane[numberOfHurricanes];
		
		for(int i = 0; i < hurricanes.length; i++){
			hurricanes[i] = new Hurricane();
			hurricanes[i].getValues();//Reaches for non-static method belonging
					//to object (instance method)
		}//End for
		
	}//End main

}
/*

*/