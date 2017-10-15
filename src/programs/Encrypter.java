package programs;

import javax.swing.JOptionPane;

public class Encrypter {
public static void main(String[] args){
	String message = JOptionPane.showInputDialog("Insert Message:");
	System.out.println("Encrypted: " + encrypt(message));
	JOptionPane.showMessageDialog(null, "Encrypted: " + encrypt(message));
}
public static String encrypt(String message){
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
		if(message.charAt(i) == 'e'){
			toReturn = toReturn + "v";
		}
		if(message.charAt(i) == 'f'){
			toReturn = toReturn + "u";
		}
		if(message.charAt(i) == 'g'){
			toReturn = toReturn + "t";
		}
		if(message.charAt(i) == 'h'){
			toReturn = toReturn + "s";
		}
		if(message.charAt(i) == 'i'){
			toReturn = toReturn + "r";
		}
		if(message.charAt(i) == 'j'){
			toReturn = toReturn + "q";
		}
		if(message.charAt(i) == 'k'){
			toReturn = toReturn + "p";
		}
		if(message.charAt(i) == 'l'){
			toReturn = toReturn + "o";
		}
		if(message.charAt(i) == 'm'){
			toReturn = toReturn + "n";
		}
		if(message.charAt(i) == 'n'){
			toReturn = toReturn + "m";
		}
		if(message.charAt(i) == 'o'){
			toReturn = toReturn + "l";
		}
		if(message.charAt(i) == 'p'){
			toReturn = toReturn + "k";
		}
		if(message.charAt(i) == 'q'){
			toReturn = toReturn + "j";
		}
		if(message.charAt(i) == 'r'){
			toReturn = toReturn + "i";
		}
		if(message.charAt(i) == 's'){
			toReturn = toReturn + "h";
		}
		if(message.charAt(i) == 'z'){
			toReturn = toReturn + "a";
		}
		if(message.charAt(i) == 'y'){
			toReturn = toReturn + "b";
		}
		if(message.charAt(i) == 'x'){
			toReturn = toReturn + "C";
		}
		if(message.charAt(i) == 'w'){
			toReturn = toReturn + "d";
		}
		if(message.charAt(i) == 'v'){
			toReturn = toReturn + "e";
		}
		if(message.charAt(i) == 'u'){
			toReturn = toReturn + "f";
		}
		if(message.charAt(i) == 't'){
			toReturn = toReturn + "g";
		}
	}
	return toReturn;
	
}
}
