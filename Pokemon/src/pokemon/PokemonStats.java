package pokemon;

/**
 * Contains the Pokemon's stats used for battles
 * @author Alejandro
 *
 */
public class PokemonStats {
	/** Pokemon's attack */
	private int attack;
	private int defense;
	private int speed;
	/*
	private int spAttack;
	private int spDefence;
	*/
	protected PokemonStats(int attack, int defense, int speed){// int spAttack, int spDefence) {
		this.attack = attack;
		this.defense = defense;
		this.speed = speed;
		/*
		this.spAttack = spAttack;
		this.spDefence = spDefence;
		*/
	}

	/*
	 * Getters
	 */
	/**
	 * Returns the current attack value
	 * @return the attack value
	 */
	public int getAttack() {
		return attack;
	}
	/**
	 * Returns the current defense value
	 * @return the defense value
	 */
	public int getDefense() {
		return defense;
	}
	/**
	 * Returns the current speed value
	 * @return the speed value
	 */
	public int getSpeed() {
		return speed;
	}
	/*
	@Deprecated
	public int getSpAttack() {
		return spAttack;
	}
	@Deprecated
	public int getSpDefence() {
		return spDefence;
	}*/
	

	public int[] getStats()
	{
		return new int[] {attack,defense,speed};
	}
	/*
	 * Setters
	 */
	
	public void setAttack(int attack) {
		this.attack = attack;
	}

	public void setDefence(int defence) {
		this.defense = defence;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	/*
	@Deprecated
	public void setSpAttack(int spAttack) {
		this.spAttack = spAttack;
	}
	@Deprecated
	public void setSpDefence(int spDefence) {
		this.spDefence = spDefence;
	}
	*/

}