package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JFileChooser;

import importexport.impl.SheduleImportExportJsonImplementation;
import main.App;
import model.Event;
import model.Schedule;
import model.ScheduleTableModel;

public class ExportDataActionListener implements ActionListener {

	private ScheduleTableModel scheduleTableModel;
	private SheduleImportExportJsonImplementation exportJsonImplementation;

	public ExportDataActionListener(ScheduleTableModel scheduleTableModel) {
		this.scheduleTableModel = scheduleTableModel;
		this.exportJsonImplementation = new SheduleImportExportJsonImplementation();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JFileChooser chooser = new JFileChooser();
		int returnVal = chooser.showOpenDialog(App.getInstance());
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			try {
				exportJsonImplementation.exportSchedule(chooser.getSelectedFile(),
						this.scheduleTableModel.getSchedule());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
