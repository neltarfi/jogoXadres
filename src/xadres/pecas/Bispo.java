package xadres.pecas;

import jogoTabuleiro.Posicao;
import jogoTabuleiro.Tabuleiro;
import xadres.Cor;
import xadres.PecaXadres;

public class Bispo extends PecaXadres{
	
	public Bispo(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro, cor);
	}

	@Override
	public String toString() {
		return "B";
	}

	@Override
	public boolean[][] movimentosPossiveis() {
		boolean[][] mat = new boolean[getTabuleiro().getLinhas()][getTabuleiro().getColunas()];
		Posicao p = new Posicao(0, 0);

		// noroeste
		p.definirValores(posicao.getLinha() - 1, posicao.getColuna() - 1);
		while (getTabuleiro().existePosicao(p) && !getTabuleiro().existePeca(p)) {
			mat[p.getLinha()][p.getColuna()] = true;
			p.definirValores(p.getLinha() - 1, p.getColuna() - 1);
		}
		if (getTabuleiro().existePosicao(p) && existeUmaPecaAdiverssaria(p)) {
			mat[p.getLinha()][p.getColuna()] = true;
		}

		// nordeste
		p.definirValores(posicao.getLinha() - 1, posicao.getColuna() + 1);
		while (getTabuleiro().existePosicao(p) && !getTabuleiro().existePeca(p)) {
			mat[p.getLinha()][p.getColuna()] = true;
			p.definirValores(p.getLinha() - 1, p.getColuna() + 1);
		}
		if (getTabuleiro().existePosicao(p) && existeUmaPecaAdiverssaria(p)) {
			mat[p.getLinha()][p.getColuna()] = true;
		}

		// sudoeste
		p.definirValores(posicao.getLinha() + 1, posicao.getColuna() - 1);
		while (getTabuleiro().existePosicao(p) && !getTabuleiro().existePeca(p)) {
			mat[p.getLinha()][p.getColuna()] = true;
			p.definirValores(p.getLinha() + 1, p.getColuna() - 1);
		}
		if (getTabuleiro().existePosicao(p) && existeUmaPecaAdiverssaria(p)) {
			mat[p.getLinha()][p.getColuna()] = true;
		}

		// sudeste
		p.definirValores(posicao.getLinha() + 1, posicao.getColuna() + 1);
		while (getTabuleiro().existePosicao(p) && !getTabuleiro().existePeca(p)) {
			mat[p.getLinha()][p.getColuna()] = true;
			p.definirValores(p.getLinha() + 1, p.getColuna() + 1);
		}
		if (getTabuleiro().existePosicao(p) && existeUmaPecaAdiverssaria(p)) {
			mat[p.getLinha()][p.getColuna()] = true;
		}

		return mat;
	}
}
