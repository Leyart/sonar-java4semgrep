package lang.naming;

import java.lang.Object;

// ok: badabstractclassnamecheck-normalclass
class ClasName {
    void foo() {
        new Object() {};
    }
}

// ok: badabstractclassnamecheck-normalclass
enum Enum {
}

// ruleid: badabstractclassnamecheck-normalclass
class AbstractLikeName { // Noncompliant {{Make this class abstract or rename it, since it matches the regular expression '^Abstract[A-Z][a-zA-Z0-9]*$'.}}
}

// ok: badabstractclassnamecheck-normalclass
abstract class AbstractClassName {
}