/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package visao.tabelas;

import java.util.ArrayList;
import java.util.List;
import static java.util.Locale.getDefault;
import javax.swing.table.AbstractTableModel;
import vo.Cargo;


/**
 *
 * @author ThyagoHenrique
 */
public class TableModelCargo  extends AbstractTableModel {
        private static final long serialVersionUID = 1L;

	/* Lista de Sócios que representam as linhas. */
	private final List<Cargo> linhas;
	/* Array de Strings com o nome das colunas. */
	private String[] colunas;

	/* Cria um CargoTableModel vazio. */
	public TableModelCargo() {
		linhas        = new ArrayList<>(100);
                this.colunas  = new String[] {"Código", "Nome"};
	}

	/* Cria um CargoTableModel carregado com
	 * a lista de sócios especificada. */
	public TableModelCargo(List<Cargo> obj) {
		linhas = new ArrayList<>(obj);
	}


	/* Retorna a quantidade de colunas. */
	@Override
	public int getColumnCount() {
		// Está retornando o tamanho do array "colunas".
		// Mas como o array é fixo, vai sempre retornar 4.
		return colunas.length;
	}

	/* Retorna a quantidade de linhas. */
	@Override
	public int getRowCount() {
		// Retorna o tamanho da lista de sócios.
		return linhas.size();
	}

	/* Retorna o nome da coluna no índice especificado.
	 * Este método é usado pela JTable para saber o texto do cabeçalho. */
	@Override
	public String getColumnName(int columnIndex) {
		// Retorna o conteúdo do Array que possui o nome das colunas
		// no índice especificado.
		return colunas[columnIndex];
	};

	/* Retorna a classe dos elementos da coluna especificada.
	 * Este método é usado pela JTable na hora de definir o editor da célula. */
	@Override
	public Class<?> getColumnClass(int columnIndex) {
		// Retorna a classe referente a coluna especificada.
		// Aqui é feito um switch para verificar qual é a coluna
		// e retornar o tipo adequado. As colunas são as mesmas
		// que foram especificadas no array "colunas".
		switch (columnIndex) {
		case 0: // Primeira coluna é o nome, que é uma String.
			return Integer.class;
		case 1: // Segunda coluna é o telefone, que também é uma String..
			return String.class;
		case 2: // Terceira coluna é a data de cadastro,
				// apesar de ser do tipo Calendar,
				// estou retornando Date por causa da formatação.
			return Boolean.class;
		default:
			// Se o índice da coluna não for válido, lança um
			// IndexOutOfBoundsException (Exceção de índice fora dos limites).
			// Não foi necessário verificar se o índice da linha é inválido,
			// pois o próprio ArrayList lança a exceção caso seja inválido.
			throw new IndexOutOfBoundsException("columnIndex out of bounds");
		}
	}

	/* Retorna o valor da célula especificada
	 * pelos índices da linha e da coluna. */
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {

		// Pega o sócio da linha especificada.
		Cargo produto = linhas.get(rowIndex);

		// Retorna o campo referente a coluna especificada.
		// Aqui é feito um switch para verificar qual é a coluna
		// e retornar o campo adequado. As colunas são as mesmas
		// que foram especificadas no array "colunas".
		switch (columnIndex) {
		case 0: // Segunda coluna é o telefone.
			return produto.getCodigo();
		case 1: // Terceira coluna é a data de cadastro.
			return produto.getNome().toUpperCase(getDefault());
		default:
			// Se o índice da coluna não for válido, lança um
			// IndexOutOfBoundsException (Exceção de índice fora dos limites).
			// Não foi necessário verificar se o índice da linha é inválido,
			// pois o próprio ArrayList lança a exceção caso seja inválido.
			throw new IndexOutOfBoundsException("columnIndex out of bounds");
		}
	}

	/* Seta o valor da célula especificada
	 * pelos índices da linha e da coluna.
	 * Aqui ele está implementado para não fazer nada,
	 * até porque este table model não é editável. */
  	public void setValueAt(Cargo aValue, int rowIndex) {
              linhas.set(rowIndex, aValue);
              fireTableRowsUpdated(rowIndex, rowIndex);
  }

	/* Retorna um valor booleano que define se a célula em questão
	 * pode ser editada ou não.
	 * Este método é utilizado pela JTable na hora de definir o editor da célula.
	 * Neste caso, estará sempre retornando false, não permitindo que nenhuma
	 * célula seja editada. */
	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
          return false;
	}


	////////////////////////////////////////////////////////////
	// Os métodos declarados até aqui foram as implementações //
	// de TableModel, que são continuamente utilizados        //
	// pela JTable para definir seu comportamento,            //
	// por isso o nome Table Model (Modelo da Tabela).        //
	//                                                        //
	// A partir de agora, os métodos criados serão            //
	// particulares desta classe. Eles serão úteis            //
	// em algumas situações.                                  //
	////////////////////////////////////////////////////////////

	/* Retorna o sócio da linha especificada. */
	public Cargo getCargo(int indiceLinha) {
		return linhas.get(indiceLinha);
	}
	
	/* Adiciona um registro. */
	public void addCargo(Cargo produto) {
		// Adiciona o registro.
		linhas.add(produto);
		// Pega a quantidade de registros e subtrai um para achar
		// o último índice. É preciso subtrair um, pois os índices
		// começam pelo zero.
		int ultimoIndice = getRowCount() - 1;
		// Reporta a mudança. O JTable recebe a notificação
		// e se redesenha permitindo que visualizemos a atualização.
		fireTableRowsInserted(ultimoIndice, ultimoIndice);
	}

	/* Remove a linha especificada. */
	public void removeCargo(int indiceLinha) {
		// Remove o sócio da linha especificada.    	
		linhas.remove(indiceLinha);
		// Reporta a mudança. O JTable recebe a notificação
		// e se redesenha permitindo que visualizemos a atualização.
		fireTableRowsDeleted(indiceLinha, indiceLinha);
	}

	/* Adiciona uma lista de sócios ao final dos registros. */
	public void addLista(List<Cargo> obj) {
		// Pega o tamanho antigo da tabela.
		int tamanhoAntigo = getRowCount();
		// Adiciona os registros.
		linhas.addAll(obj);
		// Reporta a mudança. O JTable recebe a notificação
		// e se redesenha permitindo que visualizemos a atualização.
		fireTableRowsInserted(tamanhoAntigo, getRowCount() - 1);
	}

	/* Remove todos os registros. */
	public void limpar() {
		// Remove todos os elementos da lista de sócios.
		linhas.clear();
		// Reporta a mudança. O JTable recebe a notificação
		// e se redesenha permitindo que visualizemos a atualização.
		fireTableDataChanged();
	}

	/* Verifica se este table model está vazio. */
	public boolean isEmpty() {
		return linhas.isEmpty();
	}  
}
