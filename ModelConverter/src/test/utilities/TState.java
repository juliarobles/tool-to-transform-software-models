package test.utilities;

public class TState {
	private String name;
	private String invariant;
	
	public TState(String name) {
		this.name = name;
	}

	public void setInvariant(String invariant) {
		this.invariant = invariant;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((invariant == null) ? 0 : invariant.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TState other = (TState) obj;
		if (invariant == null) {
			if (other.invariant != null)
				return false;
		} else if (!invariant.equals(other.invariant))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}
