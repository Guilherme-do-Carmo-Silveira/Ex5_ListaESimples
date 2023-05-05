package view;

import javax.swing.JOptionPane;

import controller.MusicController;
import docarmo.ListaObject.ListaEncadeadaObj;

public class main {

	public static void main(String[] args) {

		ListaEncadeadaObj l = new ListaEncadeadaObj();
		MusicController c = new MusicController();

		int opc = 0;

		while (opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog(
					"1 - Adicionar um música na playlist\n2 - Remover musica da playlist\n3 - Executa a playlist\n9 - Fechar Vitufy"));
			switch (opc) {
			case 1:
				String musica = JOptionPane.showInputDialog("Digite o nome da musica");
				String artista = JOptionPane.showInputDialog("Digite o nome do artista");
				int duracao = (int) ((Math.random() * 2001) + 1000);
				String dados = (musica + ";" + artista + ";" + duracao);  
				c.addmusic(l, dados);
				break;
			case 2: 
				int posicao = Integer.parseInt(JOptionPane.showInputDialog("Digite a música que deseja remover"));
				try {
					c.removemusic(l, posicao);
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 3:
				c.execplaylist(l);
				break;
			case 9:
				JOptionPane.showMessageDialog(null, "OBRIGADO POR USAR VITUFY");
				break;
			default:
				JOptionPane.showInputDialog("OPÇÃO INVALIDA");
				break;
			}
		}
	}

}
