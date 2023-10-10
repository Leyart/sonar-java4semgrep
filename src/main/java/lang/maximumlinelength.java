package lang.TooLongLine_S103_Check;

import checks.TooLongLine_S103_Check.
// ruleid: maximumLineLength
        very_very_very.big.very_very_very.big.very_very_very.big.very_very_very.big.very_very_very.VeryBig;

; // is an EmptyStatementTree that can be part of CompilationUnitTree.imports() as an ImportClauseTree

class LineLength {
    void method() {
        // Noncompliant {{Split this 97 characters long line (which is greater than 40 authorized).}}
        // Noncompliant {{Split this 97 characters long line (which is greater than 40 authorized).}}
    }
}