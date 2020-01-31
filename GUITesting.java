import java.awt.*;
import javax.swing.*;
public class GUITesting extends JFrame{
	public GUITesting() {
		JButton quit = new JButton("Quit");
		quit.addActionListener((event) -> System.exit(0));		//number in exit() doesnt seem to matter
		layout(quit);
		
		setTitle("THINGY");
		setSize(300,200);				//JFrame method that changes x-length and y-length, respectively
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	private void layout(JComponent... x) {
		var pane = getContentPane();			//creates a layer in the JFrame
		var gl = new GroupLayout(pane);			//new layer on pane
		pane.setLayout(gl);						//put layer on pane (can place things)
		
		gl.setAutoCreateContainerGaps(true);	//puts blank space around components in frame
		
		gl.setHorizontalGroup(gl.createSequentialGroup().addComponent(x[0]));
		
		gl.setVerticalGroup(gl.createSequentialGroup().addComponent(x[0]));
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			var o = new GUITesting();
			o.setVisible(true);
		});
	}
}
