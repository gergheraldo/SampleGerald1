package geraldTest1;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class geraldTest1 {

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		Display display = Display.getDefault();
		Shell shlSampleApp = new Shell();
		shlSampleApp.setSize(450, 300);
		shlSampleApp.setText("Sample App");
		
		Label lblHelloWorld = new Label(shlSampleApp, SWT.NONE);
		lblHelloWorld.setVisible(false);
		lblHelloWorld.setEnabled(true);
		lblHelloWorld.setBounds(60, 148, 267, 36);
		
		Button btnNewButton = new Button(shlSampleApp, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				System.out.println("Hello World");
				//Label lblHelloWorld - new Label(shlSampleApp, SWT.NONE);
				lblHelloWorld.setText("Hello World");
				lblHelloWorld.setVisible(true);
			}
		});
		btnNewButton.setBounds(60, 66, 190, 58);
		btnNewButton.setText("Click &Me");

		shlSampleApp.open();
		shlSampleApp.layout();
		while (!shlSampleApp.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
}
