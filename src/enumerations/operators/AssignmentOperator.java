package enumerations.operators;

public enum AssignmentOperator {
									// Symbol	Type
	ASSIGN,							// =		Any
	ADD_ASSIGN,						// +=		Integral, real, shortreal
	SUB_ASSIGN,						// -=		Integral, real, shortreal
	MUL_ASSIGN,						// *=		Integral, real, shortreal
	DIV_ASSIGN,						// /=		Integral, real, shortreal
	MOD_ASSIGN,						// %=		Integral
	AND_ASSIGN,						// &=		Integral		(Bitwise)
	OR_ASSIGN,						// |=		Integral		(Bitwise)
	XOR_ASSIGN,						// ^=		Integral		(Bitwise)
	LOGICAL_SHIFT_LEFT_ASSIGN,		// <<=		Integral		(Bitwise)
	LOGICAL_SHIFT_RIGHT_ASSIGN,		// >>=		Integral		(Bitwise)
	ARITHMETIC_SHIFT_LEFT_ASSIGN,	// <<<=		Integral		(Bitwise)
	ARITHMETIC_SHIFT_RIGHT_ASSIGN,	// >>>=		Integral		(Bitwise)
}
