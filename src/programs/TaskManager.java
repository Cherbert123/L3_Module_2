package programs;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TaskManager {
public static void main(String[] args){
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	frame.add(panel);
	JButton add = new JButton("Add Task");
	JButton remove = new JButton("Remove Task");
	JButton save = new JButton("Save Tasks");
	JButton load = new JButton("Load Tasks");
	panel.add(add);
	panel.add(remove);
	panel.add(save);
	panel.add(load);
}
}
