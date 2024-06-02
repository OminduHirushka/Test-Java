package O11_MultipleInheritanceWithInterfaces.Q607;

interface Lion {

}

interface Fox extends Lion {

}                                           // Interface EXTENDS Interface ( Not Interface includes Interface )

interface Cat {

}

interface Dog extends Lion, Cat {

}                                           // Legal ( Interface can EXTENDS multiple Interfaces )

public class Q607 {

}
