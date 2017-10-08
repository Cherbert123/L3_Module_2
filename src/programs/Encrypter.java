package programs;

import javax.swing.JOptionPane;

public class Encrypter {
public static void main(String[] args){
	String message = JOptionPane.showInputDialog("Insert Message:");
}
public void encrypt(String message){
	String toReturn = "";
	for(int i = 0; i < message.length();i++){
		if(message.charAt(i) == 'a'){
			toReturn = toReturn + "z";
		}
		if(message.charAt(i) == 'b'){
			toReturn = toReturn + "y";
		}
		if(message.charAt(i) == 'c'){
			toReturn = toReturn + "x";
		}
		if(message.charAt(i) == 'd'){
			toReturn = toReturn + "w";
		}
		
	}
	
}
}
