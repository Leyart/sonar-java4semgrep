package lang.naming;

import java.lang.Object;

// ok: badabstractclassnamecheck
class ClasName {
    void foo() {
        new Object() {};
    }
}

// ok: badabstractclassnamecheck
enum Enum {
}

// ruleid: badabstractclassnamecheck
abstract public class BadAbstractClassName { // Noncompliant {{Rename this abstract class name to match the regular expression '^Abstract[A-Z][a-zA-Z0-9]*$'.}}
}

// ruleid: badabstractclassnamecheck
class AbstractLikeName { // Noncompliant {{Make this class abstract or rename it, since it matches the regular expression '^Abstract[A-Z][a-zA-Z0-9]*$'.}}
}

// ok: badabstractclassnamecheck
abstract class AbstractClassName {
}