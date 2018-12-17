package pop.entities.states;

public abstract class StateControl {
	public interface ActionEnum {
	}
	
	private State[] states;
	
	public StateControl(State[] states) {
		this.states = states;
	}
	
	public abstract void actionProcess(ActionEnum processCode);
	public abstract boolean validation(ActionEnum validationCode);
	
	//state related methods
	public State getState() {
		return null;
	}
	
	public State[] getStates() {
		return states;
	}
	
	//, to add if needed, mutation(ActionEnum mutation, int... data) for the data
	//part determine what data type would be best, ActionData enum interface sub-class,
	//object, String, etc (maybe all three)
	public boolean mutation(ActionEnum mutation, int... data) {
		return true;
	}
	public boolean mutation(ActionEnum mutation, String... data) {
		return true;
	}
	public boolean mutation(ActionEnum mutation, Object... data) {
		return true;
	}
	
	public boolean mutation(ActionEnum mutation, ActionData... data) {
		return true;
	}
	
	public boolean mutation(ActionData... data) {
		return true;
	}
	
	//make new class for this when needed
	public interface ActionData {
		
	}
}
