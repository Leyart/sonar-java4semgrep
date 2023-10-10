# sonar-java4semgrep

Goal of the project is to map every java rule that has been defined as part of [Sonar Java](https://github.com/SonarSource/sonar-java/)
to a corresponding [Semgrep](https://semgrep.dev/) rule.

Semgrep has some advantages over SonarQube, namely:

- Semgrep rules look like the source code you’re writing. Writing custom rules with SonarQube requires familiarity with abstract syntax trees (ASTs).
- Semgrep claims possible analysis up to 20K-100K loc/sec per rule. SonarQube authors report approximately 0.4K loc/sec for rulesets in production.
- Semgrep CI supports scanning only changed files (differential analysis), SonarQube does not

On the other hand, the number of rules supported by Semgrep is minimal compared to the support that Sonarqube has received over the years.

This project intends to solve this gap over time.

To contribute, please refer to [Contributing](Contributing.md)

### License

Licensed under the [GNU Lesser General Public License, Version 3.0](https://www.gnu.org/licenses/lgpl.txt)