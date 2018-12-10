package pop.interfaces;

public interface Nameable {
	/**
	 * Returns a formatted {@code String} of the name.
	 * 
	 * @return formatted {@code String}
	 */
	@Override
	public String toString();
	
	/**
	 * Returns an unformatted {@code String} of the name.
	 * 
	 * @return name {@code String}
	 */
	public String getName();
	
	/**
	 * Sets a new name.
	 * 
	 * @param name the name to be set
	 */
	public void setName(String name);
}
