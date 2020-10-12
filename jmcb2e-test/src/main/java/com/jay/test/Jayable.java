package com.jay.test;

import java.util.Collection;

public interface Jayable<T> {
	<J, Y ,X extends Jayable2 & Jayable3> J executes(X param1, J param2);
	<X> X executes2( Collection<? extends Jayable3> param1);
	//<X> X executes3( Collection<? extends Jayable3> param1, <@Jayable2 Y> param2);
	
}
