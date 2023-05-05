package view;

import controller.MusicController;
import docarmo.ListaObject.ListaEncadeadaObj;

public class main {

	public static void main(String[] args) {
		
		ListaEncadeadaObj l = new ListaEncadeadaObj();
		MusicController control = new MusicController();
		
		String musica = "vai novinha";
		
		control.addmusic(l, musica);
		
		

	}

}
