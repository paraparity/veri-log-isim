package enumerations.operators;

public enum BinaryOperator {
								// Symbol	Type
	ADD,						// +		Integral, real, shortreal
	SUB,						// -		Integral, real, shortreal
	MUL,						// *		Integral, real, shortreal
	DIV,						// /		Integral, real, shortreal
	MOD,						// %		Integral
	LOGICAL_EQ,					// ==		Any
	LOGICAL_NEQ,				// !=		Any
	CASE_EQ,					// ===		Any except [real, shortreal]
	CASE_NEQ,					// !==		Any except [real, shortreal]
	WILD_EQ,					// ==?		Integral
	WILD_NEQ,					// !=?		Integral
	LOGICAL_AND,				// &&		Integral, real, shortreal
	LOGICAL_OR,					// ||		Integral, real, shortreal
	POWER,						// **		Integral, real, shortreal
	LESS,						// <		Integral, real, shortreal
	LESS_EQ,					// <=		Integral, real, shortreal
	GREATER,					// >		Integral, real, shortreal
	GREATER_EQ,					// >=		Integral, real, shortreal
	AND,						// &		Integral
	OR,							// |		Integral
	XOR,						// ^		Integral
	XNOR,						// ^~ ~^	Integral
	LOGICAL_SHIFT_RIGHT,		// >>		Integral
	LOGICAL_SHIFT_LEFT,			// <<		Integral
	ARITHMETIC_SHIFT_RIGHT,		// >>>		Integral
	ARITHMETIC_SHIFT_LEFT,		// <<<		Integral
	LOGICAL_IMPLICATION,		// ->		Integral, real, shortreal
	LOGICAL_EQUIVALENCE			// <->		Integral, real, shortreal
}
