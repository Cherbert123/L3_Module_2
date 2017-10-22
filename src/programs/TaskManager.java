package programs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TaskManager implements ActionListener{
	ArrayList<String> saveList = new ArrayList<String>();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton add = new JButton("Add Task");
	JButton remove = new JButton("Remove Task");
	JButton save = new JButton("Save Tasks");
	JButton load = new JButton("Load Tasks");
public static void main(String[] args){
	
	TaskManager run = new TaskManager();
	run.run();
}
public void run() {
	frame.add(panel);
	panel.add(add);
	panel.add(remove);
	panel.add(save);
	panel.add(load);
	frame.setVisible(true);
	frame.pack();
	add.addActionListener(this);
	remove.addActionListener(this);
	save.addActionListener(this);
	load.addActionListener(this);
}

@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource().equals(save)) {
		save();
	}
	if(e.getSource().equals(load)) {
		
	}
	if(e.getSource().equals(remove)) {
		String sTemp = JOptionPane.showInputDialog("Enter An ID:");
		if(sTemp.equalsIgnoreCase("All")){
			saveList.clear();
		} else {
			
		}
	}
	if(e.getSource().equals(add)) {
		saveList.add(JOptionPane.showInputDialog("Enter A Task To Add:"));
	}
	
}
public void save(){
	try {
		FileWriter fw = new FileWriter("src/programs/SaveTasks.java");
		fw.write("" + saveList);
		fw.close();
		
	} catch (IOException e) {
		e.printStackTrace();
	}
}
}
