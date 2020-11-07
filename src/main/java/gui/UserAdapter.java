package gui;

import java.util.Vector;

import javax.swing.table.AbstractTableModel;

import domain.Bet;
import domain.User;

public class UserAdapter extends AbstractTableModel {

	private User user;
	private Vector<Bet> listaApuestas;

	public UserAdapter(User user) {
		this.user = user;
		listaApuestas = user.getApuestas();
	}

	@Override
	public int getRowCount() {
		int size;
		if (listaApuestas == null) {
			size = 0;
		} else {
			size = listaApuestas.size();
		}
		return size;
	}

	@Override
	public int getColumnCount() {
		return 4;
	}


	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Object temp = null;
		if (columnIndex == 0) {
			temp = listaApuestas.get(rowIndex).getEventoAsociado();
		} else if (columnIndex == 1) {
			temp = listaApuestas.get(rowIndex).getPreguntaAsociada();
		} else if (columnIndex == 2) {
			temp = (listaApuestas.get(rowIndex).getEventoAsociado().getEventDate());
		} else if (columnIndex == 3) {
			temp = new Double(listaApuestas.get(rowIndex).getCantNumber());
		}

		return temp;
	}
}
