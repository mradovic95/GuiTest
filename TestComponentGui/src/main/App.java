package main;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import views.ScheduleView;

public class App extends JFrame{
	
	
	private static App myInstance;

    // the constructor
    private App() {
    	this.setTitle("Test Gui Component");
        this.setSize(1200, 1200);
        this.setLayout(new BorderLayout());
        
        ScheduleView shScheduleView=new ScheduleView();
        this.add(shScheduleView,BorderLayout.NORTH);
        
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static App getInstance() {
        if (myInstance == null)
            myInstance = new App();

        return myInstance;
    }

	public static void main(String[] args) {
		App.getInstance();
	}

}
