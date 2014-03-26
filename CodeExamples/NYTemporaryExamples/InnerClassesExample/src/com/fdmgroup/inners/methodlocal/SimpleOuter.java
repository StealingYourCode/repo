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

	
	public Machine setUpMachine(Machine machine){
		

		class TeaMakingModule extends Module {
			void execute(){
				System.out.println("Making tea...");
			}
		}
		
		machine.module = new TeaMakingModule();
		
		return machine;
		
	}
	
}
