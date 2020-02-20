package edu.sussex.coms223.lab1;

class Base {
	  String name() {
	    return getClass().getName();
	  }
	};

	class Subclass extends Base {
	  String name() {
	    return getClass().getName();
	  }
	}

	public class Main {
	  public static void main(String[] args) {
	    Base ref1 = new Base();
	    System.out.print(ref1.name() + " ");
	    Subclass ref2 = new Subclass();
	    System.out.print(ref2.name() + " ");
	    ref1 = ref2;
	    System.out.print(ref1.name());
	  }
	}