package edu.sussex.coms223.lab1;

class GenericWrapper<T> {
	  private T value;

	  public GenericWrapper(T value) {
	    this.value = value;
	  }

	  public T GetValue() {
	    return value;
	  }
	};

	public class Main {
	  public static void main(String[] args) {
	    String name = "0";
	    GenericWrapper<String> wrapper = new GenericWrapper<>(name);
	    Integer value = wrapper.GetValue();
	  }
	}