package test.utilities;

public class TTransition {
	
	private String target;
	private String source;
	private String preCondition;
	private String postCondition;
	private String operation;
	
	public TTransition(String target, String source) {
		this.target = target;
		this.source = source;
	}
	
	public TTransition(String target, String source, String preCondition, String postCondition, String operation) {
		super();
		this.target = target;
		this.source = source;
		this.preCondition = preCondition;
		this.postCondition = postCondition;
		this.operation = operation;
	}

	public void setPreCondition(String preCondition) {
		this.preCondition = preCondition;
	}

	public void setPostCondition(String postCondition) {
		this.postCondition = postCondition;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((operation == null) ? 0 : operation.hashCode());
		result = prime * result + ((postCondition == null) ? 0 : postCondition.hashCode());
		result = prime * result + ((preCondition == null) ? 0 : preCondition.hashCode());
		result = prime * result + ((source == null) ? 0 : source.hashCode());
		result = prime * result + ((target == null) ? 0 : target.hashCode());
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
		TTransition other = (TTransition) obj;
		if (operation == null) {
			if (other.operation != null)
				return false;
		} else if (!operation.equals(other.operation))
			return false;
		if (postCondition == null) {
			if (other.postCondition != null && !other.postCondition.equals("USE"))
				return false;
		} else if (!postCondition.equals(other.postCondition)
					&& !other.postCondition.equals("USE") && !postCondition.equals("USE")
					&& !(other.postCondition != null && postCondition.strip().replaceAll(" ", "").equals(other.postCondition.strip().replaceAll(" ", ""))))
			return false;
		if (preCondition == null) {
			if (other.preCondition != null && !other.preCondition.equals("USE"))
				return false;
		} else if (!preCondition.equals(other.preCondition)
					&& !other.preCondition.equals("USE") && !preCondition.equals("USE")
					&& !(other.preCondition != null && preCondition.strip().replaceAll(" ", "").equals(other.preCondition.strip().replaceAll(" ", ""))))
			return false;
		if (source == null) {
			if (other.source != null)
				return false;
		} else if (!source.equals(other.source))
			return false;
		if (target == null) {
			if (other.target != null)
				return false;
		} else if (!target.equals(other.target))
			return false;
		return true;
	}

}
