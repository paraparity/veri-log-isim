package operators;

public enum BinaryOperator {
					// Symbol	Type
	PLUS,			// +		Integral, real, shortreal
	MINUS,			// -		Integral, real, shortreal
	MUL,			// *		Integral, real, shortreal
	DIV,			// /		Integral, real, shortreal
	MOD,			// %		Integral
	LOGICAL_EQ,		// ==		Any
	LOGICAL_NEQ,	// !=		Any
	CASE_EQ,		// ===		Any except [real, shortreal]
	CASE_NEQ,		// !==		Any except [real, shortreal]
	// ==?		Integral
	// !=?		Integral
	LOGICAL_AND,	// &&		Integral, real, shortreal
	LOGICAL_OR,		// ||		Integral, real, shortreal
	// **		Integral, real, shortreal
	LESS,			// <		Integral, real, shortreal
	LESS_EQ,		// <=		Integral, real, shortreal
	GREATER,		// >		Integral, real, shortreal
	GREATER_EQ,		// >=		Integral, real, shortreal
	AND,			// &		Integral
	OR,				// |		Integral
	XOR,			// ^		Integral
	// ^~		Integral
	XNOR,			// ~^		Integral
	SHIFT_RIGHT,	// >>		Integral
	SHIFT_LEFT,		// <<		Integral
	// >>>		Integral
	// <<<		Integral
	// ->		Integral, real, shortreal
	// <->		Integral, real, shortreal
}
