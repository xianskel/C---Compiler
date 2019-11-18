package symboltable;

import java.util.*;
import ast.Definition;

public class SymbolTable {
	
	private int scope=0;
	
	private List<Map<String,Definition>> table;

	public SymbolTable()  {
		this.table = new ArrayList<Map<String,Definition>>();
		this.table.add(0, new HashMap<String,Definition>());
		this.table.add(1, new HashMap<String,Definition>());
	}

	public void set() {
		this.scope = 1;
	}
	
	public void reset() {
		this.scope = 0;
		this.table.set(1, new HashMap<String,Definition>());
	}

	public boolean insert(Definition definition) {
		if(this.table.get(this.scope).containsKey(definition.getName())) {
			return false;
		}
		definition.setScope(this.scope);
		this.table.get(this.scope).put(definition.getName(), definition);
		return true;
	}
	
	public Definition find(String id) {
		Definition global = this.table.get(0).get(id);
		Definition local = this.table.get(1).get(id);
		
		if(this.scope == 1 && local != null) {
			return local;
		} 
		return global;
	}

}
