package formula;

/*
 * Choose a formula and enter values, programs solves for it for you. 
 * Can also take multiple variable values at once and solve formula for multiple values.
 * Very early version made entirely at CheHacks
 *Jesse Wu
 * 11/7/15
 * 
 */

import java.lang.Math ;
import java.util.Arrays;
import javax.swing.*;

//UIManager.setLookAndFeel(new org.jvnet.substance.skin.SubstanceBusinessBlackSteelLookAndFeel()) ;


public class Main {

	
	
	//declaring global variables \/ \/
			static String title = "[F0rmulat3]" ;
			
			static String accelerationInput ;
			static double acceleration ;
			
			static String timeInput ;
			static double time ;
			
			static String initialVelocityInput ;
			static double vInitial ;
			
			static String finalVelocityInput ;
			static double vFinal ;
			
			static String distanceInput ;
			static double distance ;
			
			static String radiusInput ;
			static double radius ;
			
			static String rectangularVelocityInput ;
			static double rectangularVelocity ;
			
			static String angularVelocityInput ;
			static double angularVelocity ;
			
			static String massInput ;
			static double mass ;
			
			static double centripetalForce ;
			
			static String a_input ;
			static double a ;
			
			static String b_input ;
			static double b ;
			
			static String c_input ;
			static double c ;
			
			static String x_input ;
			static double x ;
			
			static String y_input ;
			static double y ;
			
			static String x_1_input ;
			static double x_1 ;
			
			static String x_2_input ;
			static double x_2 ;
			
			static String y_1_input ;
			static double y_1 ;
			
			static String y_2_input ;
			static double y_2 ;
			
			static String[] a_arrayString ;
			static double[] a_array ;
			
			static String[] b_arrayString ;
			static double[] b_array ;
			
			static String[] c_arrayString ;
			static double[] c_array ;
			
			static String[] initialVelocityInputString_array ;
			static double[] initialVelocity_array ;
			
			static String[] accelerationInputString_array ;
			static double[] acceleration_array ;
			
			static String[] timeInputString_array ;
			static double[] time_array ;
			
			static JFrame frame = new JFrame() ;
			
	
	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "             " + title + " !") ;
		
		cancelDialog() ;
		
	}//bracket to end main method	
	
//"Array Methods" such as addition, multiplication, etc. \/ \/
	public static double[] convert(String[] str){
		
		double[] array = new double[str.length] ;
		
		for(int i = 0; i < array.length; ++i){
			
                    array[i] = Double.parseDouble(str[i]) ;
		}
		return array;
	
        }

	public static double[] addArray(double[] arraya, double[] arrayb) {
		
		for(int i=0; i < arraya.length; ++i) {
			 
			arraya[i] = arraya[i] + arrayb[i] ;
		}
		
		return arraya ;
	}
	
	public static double[] subtractArray(double[] arraya, double[] arrayb) {
		
		for(int i=0; i < arraya.length; ++i) {
			
			arraya[i] = arraya[i] - arrayb[i] ;
		}
		
		return arraya ;
		
	}
	
	public static double[] multiplyArray(double[] arraya, double[] arrayb) {
			
			for(int i=0; i < arraya.length; ++i) {
				
				arraya[i] = arraya[i] * arrayb[i] ;
			}
			
			return arraya ;
			
		}
	
	public static double[] scaleArray(double[] array, double scaleFactor) {
		
			for (int i=0; i<array.length; i++) {
			  
				array[i] = array[i] * scaleFactor;
			}
			
			return array ;
	}
	
	public static double[] divideArray(double[] arraya, double[] arrayb) {
		
		for(int i=0; i < arraya.length; ++i) {
			
			arraya[i] = arraya[i] / arrayb[i] ;
		}
		
		return arraya ;
		
	}
	
	public static double[] squareArray(double[] arraya) {
			
			for(int i=0; i < arraya.length; ++i) {
				
				arraya[i] = arraya[i] * arraya[i] ;
			}
			
			return arraya ;
			
	}
	
	public static double[] rootArray(double[] arraya) {
		
		for(int i=0; i < arraya.length; ++i) {
			
			arraya[i] = Math.sqrt(arraya[i]) ;
		}
		
		return arraya ;
		
}
	
	

//"Array Methods" such as addition, multiplication, etc. ^ ^				

public static void cancelDialog() {
	
	Object[] dataOptions = {"Single",
	    "Multiple",
	    "Leave"};
	
	int dataChoice = JOptionPane.showOptionDialog(frame,
			"                       " + title + "\n\n" +
	"Do you want to input multiple or single data?\n\n\n",
	title,
	JOptionPane.YES_NO_CANCEL_OPTION,
	JOptionPane.QUESTION_MESSAGE,
	null,
	dataOptions,
	dataOptions[2]);
	
	if (dataChoice == JOptionPane.YES_OPTION) {
		singleDialog() ;
	}
	
	else if (dataChoice == JOptionPane.NO_OPTION) {
		multipleDialog() ;
	}
	
	else if (dataChoice == JOptionPane.CANCEL_OPTION) {
		System.exit(0) ;
	}
	
}

public static void singleDialog(){
	
	
	String singleChoice = JOptionPane.showInputDialog(null, 
	
	"                                   Choose a formula by typing its name\n\n"
			+
	"Quadratic Formula: 'quad'                                Final Velocity: 'final velocity'\n" +     	
    "Initial Velocity: 'initial velocity'                         Centripetal Force: 'centripetal force'\n" +
	"Distance: 'distance'                                           More to come in the future!"
//
//		
	, title + "(Single Entry)", JOptionPane.PLAIN_MESSAGE
			) ;		
	
		if (singleChoice == null) {
				cancelDialog() ;
		}
		
		else {
	
	switch (singleChoice) {
	
		case "quad" :
			//getting input for variables \/ \/
			
			a_input = JOptionPane.showInputDialog(null, "value of a?", title, JOptionPane.PLAIN_MESSAGE) ;
			
				if (a_input == null) {
					singleDialog() ;
				}
			a = Double.parseDouble(a_input) ;
						
			
			b_input = JOptionPane.showInputDialog(null, "value of b?", title, JOptionPane.PLAIN_MESSAGE) ;
			
				if (b_input == null) {
					singleDialog() ;
				}
			b = Double.parseDouble(b_input) ;
			
			
			c_input = JOptionPane.showInputDialog(null, "value of c?", title, JOptionPane.PLAIN_MESSAGE) ;
			
				if(c_input == null) {
					singleDialog() ;
				}
			c = Double.parseDouble(c_input) ;
			
			//getting input for variables ^ ^
			
		
			double discriminant = b * b - (4) * (a) * (c) ; //discriminant to check for unreal solutions
			
			//split the equation to make stuff easier
			double numeratorAddition = -b + Math.sqrt(b * b - (4) * (a) * (c)) ;
			
			double numeratorSubtraction = -b - Math.sqrt(b * b - (4) * (a) * (c)) ;
			
			double denominator = 2 * a ;
			
		//different cases for different discriminants, remember that 7th grade math!	
		if (discriminant <0 ) { //unreal solution possibility
		
			JOptionPane.showMessageDialog(null, "Unreal Solution!\nLearn to use i yourself!", title, JOptionPane.PLAIN_MESSAGE) ;
			
			
			singleDialog();
		}
		
		else if (discriminant > 0 ) { //two solution possibility
			
			double solution1 = numeratorAddition /denominator ;
			double solution2 = numeratorSubtraction /denominator ;
			
			JOptionPane.showMessageDialog(null, 
					
					"Roots: " + solution1 + " and " + solution2				
					
					, title, JOptionPane.PLAIN_MESSAGE
			);
			
			 singleDialog();			
		}
		
		else if (discriminant == 0) { //one solution possibility
			
			double onlySolution = numeratorAddition /denominator ;
			
			JOptionPane.showMessageDialog(null,
					
					"Only Root: " + onlySolution, 
						
					title, 
					JOptionPane.PLAIN_MESSAGE   
			);
			
			singleDialog();
		}
		
		break ; //breaks quadratic formula case
		
		case "final velocity" :
			//getting values \/ \/
			
			initialVelocityInput = JOptionPane.showInputDialog(null, "Initial Velocity (m/s): ", title, JOptionPane.PLAIN_MESSAGE) ;
			
				if (initialVelocityInput == null) {
					singleDialog() ;
				}
			vInitial = Double.parseDouble(initialVelocityInput) ;
			
			
			accelerationInput = JOptionPane.showInputDialog(null, "Acceleration (m/s/s): ", title, JOptionPane.PLAIN_MESSAGE) ;
			
				if (accelerationInput == null) {
					singleDialog() ;
				}
			acceleration = Double.parseDouble(accelerationInput) ;
			
			
			timeInput = JOptionPane.showInputDialog(null, "Total time (s): ", title, JOptionPane.PLAIN_MESSAGE) ;
			
				if (initialVelocityInput == null) {
					singleDialog() ;
				}
			time = Double.parseDouble(timeInput) ;
			//getting values ^ ^
		
			vFinal = vInitial + (acceleration * time) ;
			JOptionPane.showMessageDialog(null, "Final Velocity: " + vFinal + " m/s", title, JOptionPane.PLAIN_MESSAGE) ;
			
			singleDialog();
		
		break; //breaks final velocity case
		
		case "initial velocity" :
			
			//getting values \/ \/
			
			finalVelocityInput = JOptionPane.showInputDialog(null, "Final Velocity (m/s): ", title, JOptionPane.PLAIN_MESSAGE) ;
			
				if (finalVelocityInput == null) {
					singleDialog() ;
				}
			vFinal = Double.parseDouble(finalVelocityInput) ;
			
			
			accelerationInput = JOptionPane.showInputDialog(null, "Acceleration (m/s/s): ", title, JOptionPane.PLAIN_MESSAGE) ;
			
				if (accelerationInput == null) {
					singleDialog() ;
				}
			acceleration = Double.parseDouble(accelerationInput) ;
			
			
			distanceInput = JOptionPane.showInputDialog(null, "Total Time (s): ", title, JOptionPane.PLAIN_MESSAGE) ;
			
				if (distanceInput == null) {
					singleDialog() ;
				}
			distance = Double.parseDouble(distanceInput) ;
			
			
				if ((vFinal * vFinal - 2 * acceleration * distance) < 0) {
					JOptionPane.showMessageDialog(null, "Not Possible!", title, JOptionPane.PLAIN_MESSAGE) ;
					
					singleDialog() ;
				}
			
			vInitial = Math.sqrt(vFinal * vFinal - 2 * acceleration * distance) ;
			JOptionPane.showMessageDialog(null, "Initial Velocity: " + vInitial + "m/s", title, JOptionPane.PLAIN_MESSAGE) ;
			
			singleDialog();
		
		break; //breaks initial velocity case
		
		case "centripetal force" :
		    
			//getting values
			massInput = JOptionPane.showInputDialog(null, "Mass (kg): ", title, JOptionPane.PLAIN_MESSAGE) ;
			
				if (massInput == null) {
					singleDialog() ;
				}
			mass = Double.parseDouble(massInput) ;
			
			
			radiusInput = JOptionPane.showInputDialog(null, "Radius (m): ", title, JOptionPane.PLAIN_MESSAGE) ;
			
				if (radiusInput == null) {
					singleDialog() ;
				}
			radius = Double.parseDouble(radiusInput) ;
	
				//asking option for rectangular or angular velocity
			
			Object[] options = {"Rectangular",
	                "Angular"};
			int n = JOptionPane.showOptionDialog(frame,
			    "Do you want to use rectangular of angular velocity?",
			    title,
			    JOptionPane.YES_NO_OPTION,
			    JOptionPane.QUESTION_MESSAGE,
			    null,
			    options,
			    options[1]);
			
			if (n == JOptionPane.YES_OPTION) {
				
				rectangularVelocityInput = JOptionPane.showInputDialog(null, "Velocity (m/s): ", title, JOptionPane.PLAIN_MESSAGE) ;
				
					if (rectangularVelocityInput == null) {
						singleDialog() ;
					}
				rectangularVelocity = Double.parseDouble(rectangularVelocityInput) ;
				
				centripetalForce = (mass * rectangularVelocity * rectangularVelocity) /radius ;
				
				JOptionPane.showMessageDialog(null, "Centripetal Force (N): " + centripetalForce, title, JOptionPane.PLAIN_MESSAGE) ;
				
				
				singleDialog();
					
			}
			
			else {
				angularVelocityInput = JOptionPane.showInputDialog(null, "Velocity (rad/s): ", title, JOptionPane.PLAIN_MESSAGE) ;
				
					if (angularVelocityInput == null) {
						singleDialog() ;
					}
				angularVelocity = Double.parseDouble(angularVelocityInput) ;
				
				centripetalForce = mass * angularVelocity * angularVelocity * radius ;
				
				JOptionPane.showMessageDialog(null, "Centripetal Force (N): " + centripetalForce,  title, JOptionPane.PLAIN_MESSAGE) ;
				
				
				singleDialog();
				
			}
			
		break; //breaks centripetal force case
		
		case "distance" :
			
			//get values
			x_1_input = JOptionPane.showInputDialog(null, "Point 1 x-coordinate: ", title, JOptionPane.PLAIN_MESSAGE) ;
			
				if (x_1_input == null) {
					singleDialog() ;
				}
			x_1 = Double.parseDouble(x_1_input) ;
			
			
			y_1_input = JOptionPane.showInputDialog(null, "Point 1 y-coordinate: ", title, JOptionPane.PLAIN_MESSAGE) ;
			
				if (y_1_input == null) {
					singleDialog() ;
				}
			y_1 = Double.parseDouble(y_1_input) ;
			
			
			x_2_input = JOptionPane.showInputDialog(null, "Point 2 x-coordinate: ", title, JOptionPane.PLAIN_MESSAGE) ;
			
				if (x_2_input == null) {
					singleDialog() ;
				}
			x_2 = Double.parseDouble(x_2_input) ;
			
			
			y_2_input = JOptionPane.showInputDialog(null, "Point 2 y-coordinate: ", title, JOptionPane.PLAIN_MESSAGE) ;
			
				if (y_2_input == null) {
					singleDialog() ;
				}
			y_2 = Double.parseDouble(y_2_input) ;
			
			
			distance = Math.sqrt((x_2 - x_1) * (x_2 - x_1) + (y_2 - y_1) * (y_2 - y_1)) ;
			JOptionPane.showMessageDialog(null, "Distance: " + distance, title, JOptionPane.PLAIN_MESSAGE) ;
			
			
			singleDialog();
			
		break; //breaks distance formula
	
		
		default :
			JOptionPane.showMessageDialog(null, "Bummer! That formula hasn't been created yet!") ;
			
			singleDialog() ;
	
	}//ends switch
	
		}

		
			
}//ends singleDialog


public static void multipleDialog() {
	
	String multipleChoice = JOptionPane.showInputDialog(null, 
	
	"                              Choose a formula by typing its name\n\n"
			+
	"Quadratic Formula: 'quad'                                Final Velocity: 'final velocity'\n" +     	
    "Initial Velocity: 'initial velocity'                         Centripetal Force: 'centripetal force'  \n" +
	"Distance: 'distance'                                           More to come in the future!"
		
	, title + "(Multiple Entry)", JOptionPane.PLAIN_MESSAGE
			) ;		
	
		if (multipleChoice == null) {
				cancelDialog() ;
		}
		
		else {
		
		switch (multipleChoice) {
	
		case "quad" :
			
			a_input = JOptionPane.showInputDialog(null,"values of a? (in array form pls :))", title, JOptionPane.PLAIN_MESSAGE) ;
			
			if (a_input == null) {
				multipleDialog() ;
			}
			
			a_arrayString = a_input.split(",") ;
			a_array = convert(a_arrayString) ;
		
			
			b_input = JOptionPane.showInputDialog(null, "values of b? (in array form pls :))", title, JOptionPane.PLAIN_MESSAGE) ;
			
			if (b_input == null) {
				multipleDialog() ;
			}
			
			b_arrayString = b_input.split(",") ;
			b_array = convert(b_arrayString) ;
			
			
			
			c_input = JOptionPane.showInputDialog(null, "values of c? (in array form pls :))", title, JOptionPane.PLAIN_MESSAGE) ;
			
			if (c_input == null) {
				multipleDialog() ;
			}
			
			c_arrayString = c_input.split(",") ;
			c_array = convert(c_arrayString) ;
			
			
			//split the equation to make stuff easier
			double[] numeratorAddition_array = addArray(scaleArray(b_array, -1), rootArray((subtractArray(squareArray(b_array), scaleArray((multiplyArray(a_array, c_array)), 4))))) ;
			
			double[] numeratorSubtraction_array = subtractArray(scaleArray(b_array, -1), rootArray((subtractArray(squareArray(b_array), scaleArray((multiplyArray(a_array, c_array)), 4))))) ;
			
			double[] denominator_array = scaleArray(a_array, 2) ;
			
			
			double[] solution1_array = divideArray(numeratorAddition_array, denominator_array) ;
			
			double[] solution2_array = divideArray(numeratorSubtraction_array, denominator_array) ;
			
			
			JOptionPane.showMessageDialog(null, "Roots 1: " + Arrays.toString(solution1_array)
												+ "\n" +
												"Roots 2: " + Arrays.toString(solution2_array), 
												title, 
												JOptionPane.PLAIN_MESSAGE) ;
			
			
			multipleDialog() ;
			
		break; //breaks quad
		
		case "final velocity" : 
			
		initialVelocityInput = JOptionPane.showInputDialog(null, "Initial Velocity (m/s): ", title, JOptionPane.PLAIN_MESSAGE) ;
			
			if (initialVelocityInput == null) {
				singleDialog() ;
			}
		initialVelocityInputString_array = initialVelocityInput.split(",") ;
		initialVelocity_array = convert(initialVelocityInputString_array) ;
		
		
		accelerationInput = JOptionPane.showInputDialog(null, "Acceleration (m/s/s): ", title, JOptionPane.PLAIN_MESSAGE) ;
		
			if (accelerationInput == null) {
				singleDialog() ;
			}
			
		accelerationInputString_array = accelerationInput.split(",") ;
		acceleration_array = convert(initialVelocityInputString_array) ;
		
		
		timeInput = JOptionPane.showInputDialog(null, "Total time (s): ", title, JOptionPane.PLAIN_MESSAGE) ;
		
			if (initialVelocityInput == null) {
				singleDialog() ;
			}
		
		timeInputString_array = timeInput.split(",") ;
		time_array = convert(timeInputString_array) ;
			
			
		//getting values ^ ^
	
		double[] vFinal_array = addArray(initialVelocity_array, multiplyArray(acceleration_array, time_array)) ;
		JOptionPane.showMessageDialog(null, "Final Velocities: " + Arrays.toString(vFinal_array), title, JOptionPane.PLAIN_MESSAGE) ;
		
		multipleDialog();
			
		break; //breaks final velocity
		
		
		case "initial velocity" : JOptionPane.showMessageDialog(null, "not implemented yet!") ;
		
			multipleDialog() ;
			
		break; //breaks final velocity
		
		
		case "centripetal force" : JOptionPane.showMessageDialog(null, "not implemented yet!") ;
		
			multipleDialog() ;
			
		break; //breaks centripetal force
		
		
		case "distance" : JOptionPane.showMessageDialog(null, "not implemented yet!") ;
		
		multipleDialog() ;
			
		break; //breaks distance
	
		
		default :
			JOptionPane.showMessageDialog(null, "Bummer! That formula hasn't been created yet!") ;
			
			singleDialog() ;
			
	}//breaks switch
	}
	
	
}

}//bracket to end Main class
