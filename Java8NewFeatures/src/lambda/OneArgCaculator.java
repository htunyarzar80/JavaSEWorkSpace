package lambda;

@FunctionalInterface
public interface OneArgCaculator {
	
	double  calculate (double op1);
	
	default int int5x(int op1) {
		return 5*op1;
	}

}
