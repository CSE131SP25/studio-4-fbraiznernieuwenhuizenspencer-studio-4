package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		String Shape = in.next();
		int one = in.nextInt();
		int two = in.nextInt();
		int three = in.nextInt();
		boolean filled = in.nextBoolean();
		
		if (Shape.equals("rectangle") == true) {
			if (filled == true) {
				StdDraw.setPenColor(255, 109, 182);
				StdDraw.filledRectangle(.5, 0.5, 0.2, 0.2);
			}
			else {
				StdDraw.setPenColor(0,0,0);
				StdDraw.rectangle(0.5,0.5,0.2,0.2);
			}
		}
		else if (Shape.equals("ellipse") == true) {
			if (filled == true) {
				StdDraw.setPenColor(146, 0, 0);
				StdDraw.filledEllipse(0.5, 0.5, 0.2, 0.2);
			}
			else {
				StdDraw.setPenColor(73, 0, 146);
				StdDraw.ellipse(0.5, 0.5, 0.2, 0.2);
			}
		}
		else {
			if (filled == true) {
				double[] x = {0.2, 0.8, 0.5};
				double[] y = {0.2, 0.2, 0.5};
				
				StdDraw.setPenColor(36, 255, 36);
				StdDraw.filledPolygon(x, y);
			}
			else {
				double[] x = {0.2, 0.8, 0.5};
				double[] y = {0.2, 0.2, 0.5};
				
				StdDraw.setPenColor(109, 182, 255);
				StdDraw.polygon(x, y);
			}
		}
	}
}
