package operators;

public enum UnaryOperator {
							// Symbol	Type
	PLUS,					// +		Integral, real, shortreal
	MINUS,					// -		Integral, real, shortreal
	LOGICAL_NEGATION,		// !		Integral, real, shortreal
	REDUCTION_NEGATION,		// ~		Integral		(Bitwise)
	REDUCTION_AND,			// &		Integral		(Bitwise)
	REDUCTION_NAND,			// ~&		Integral		(Bitwise)
	REDUCTION_OR,			// |		Integral		(Bitwise)
	REDUCTION_NOR,			// ~|		Integral		(Bitwise)
	REDUCTION_XOR,			// ^		Integral		(Bitwise)
	REDUCTION_XNOR			// ^~ ~^	Integral		(Bitwise)
}
