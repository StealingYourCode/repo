package com.fdmgroup.inners.methodlocal;

class Module {
	
	void execute(){
		
		// does nothing
	}
}

class Machine {
	
	Module module;  // HAS-A

	
}


public class SimpleOuter {

	// This is a method
	public Machine setUpMachine(Machine machine){
		

		class TeaMakingModule extends Module {
			
			// This is an override!
			void execute(){
				System.out.println("Making tea...");
			}
		}
		
		machine.module = new TeaMakingModule();
		
		return machine;
		
	}
	
}
