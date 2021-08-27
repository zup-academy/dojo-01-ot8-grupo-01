/**
 * 
 */
package br.com.zup.edu.sitedeviagens;

/**
 * @author Domo Arigato
 *
 */
public class teste {
	
	private Long id;
	private String nome;
	/**
	 * @param id
	 * @param nome
	 */
	public teste(Long id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * Nome da pessoa que cadastra no sistema
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	

}
