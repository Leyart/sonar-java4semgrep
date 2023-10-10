# How to Contribute

We love to pull requests from everyone! We follow the standard Git workflow of `fork -> change -> pull request -> merge -> update fork -> change ... (repeat forever)`. If you are new to open source, we recommend GitHub's excellent guide on "[How to Contribute to Open Source](https://opensource.guide/how-to-contribute/)". In addition, please feel free to reach out to any of the maintainers or other community members if you are struggling; we are here to help you learn!

Before getting started, please make sure you've read the [README](README.md) to get a primer on our project. 

## Opening an issue
If you're experiencing an issue or have a question you'd like help answering, please feel free to open an [issue](https://github.com/Leyart/sonar-java4semgrep). To help us prevent duplicates, we kindly ask that you briefly search for your problem or question in our [issues](https://github.com/Leyart/sonar-java4semgrep) before opening a new one.

Please note that if you open a bug report and your issue does not follow our template, we cannot help you until you have provided us all the relevant information in that format. Respectfully, we do not have the time to try and recreate an error given with minimal or no context, so by providing this information you are helping us help you! You will see this template when you open an issue; click on "Bug Report" and it will be populated with descriptions of what to put in each section. Replace the descriptions with your comments to the best of your ability, and please include screenshots and error logs if applicable.

## Contributing to the source code

1. Fork this repo, and then clone it:
```bash
$ git clone github.com:your-username/sonar-java4semgrep
$ cd sonar-java4semgrep/
$ git remote add upstream https://github.com/Leyart/sonar-java4semgrep.git
```

2. Create a new branch, with the following naming convention: `rule/ruleid`
Before creating the branch, ensure that the rule that you want to implement has not been already implemented by searching for the corresponding key in the repository

```bash
$ git checkout -b rule/S103
```

3. Make your change(s).
- For the yaml specification:
    - Follow Semgrep's [Rule Syntax](https://semgrep.dev/docs/writing-rules/rule-syntax/)
    - Always include:
      - An id in camelCase
      - A message as close as possible to the corresponding SonarQube rule you are implementing
      - Always specify java under languages
      - Under the metadata section, the key of the rule that you are implementing 
    based on the SonarSource repository and a reference link to the java class of the same rule referenced in the key, 
    as follows:
```
metadata:
      key: S103
      github-ref: https://github.com/SonarSource/sonar-java/blob/master/java-checks/src/main/java/org/sonar/java/checks/TooLongLineCheck.java
```
- For the java tests:
  - Try to use tests as close as possible to the ones specified in the [SonarSource]((https://github.com/SonarSource/sonar-java/)) repository
  - Call the java file with the same id as the rule in the yaml specification

4. Commit the change(s) and push to your fork. Please mark your commits with a message formatted as: 
```rulekey: rulename```
```bash
$ git add .
$ git commit -s -m "S103: maximumlinelength"
$ git push -u origin my-new-branch
```
6. Then, [submit a pull request](https://github.com/Leyart/sonar-java4semgrep/compare).

At this point, you're waiting on us. We like to at least comment on pull requests
within three business days (and, typically, one business day). Once one of our maintainers has had a chance to review your PR, we will either mark it as "needs review" and provide specific feedback on your changes, or we will go ahead and complete the pull request.

## Signing-off on Commits
To contribute to this project, you must agree to the [Developer Certificate of Origin](https://developercertificate.org/) by the [CHAOSS charter](https://chaoss.community/about/charter/#user-content-8-intellectual-property-policy) for each commit you make. The DCO is a simple statement that you, as a contributor, have the legal right to make the contribution.
To signify that you agree to the DCO for contributions, you simply add a line to each of your
git commit messages:

  ```
  Signed-off-by: Jane Smith <jane.smith@example.com>
  ```
This can be easily done by using the `-s` flag when using `git commit`. For example:

```
$ git commit -s -m “my commit message w/signoff”
```
To ensure all your commits are signed, you may choose to [configure git](https://gist.github.com/xavierfoucrier/c156027fcc6ae23bcee1204199f177da) properly by editing your global ```.gitconfig```

**Any pull requests containing commits that are not signed off will not be eligible for merge until the commits have been signed off.**

## Keeping in sync with the Repository

Remember to sync your fork with the main branch regularly.
To do this:

Go to github and copy the url of the main repo
   ```   
   https://github.com/Leyart/sonar-java4semgrep.git
   ```
make sure to be in the rootfolder of the project and the branch should be master branch and type
   ```
   git remote add upstream https://github.com/Leyart/sonar-java4semgrep.git
   ```
Now you have your upstream setup in your local machine,whenever you need to make a new branch for making changes make sure your main branch is in sync with the main repository, to do this,make sure to be in the main branch and type

   ```
   git pull upstream master
   git push origin master
   ```


## Community Resources

### Sonar Rules
- [SonarSource java rules](https://github.com/SonarSource/sonar-java/)
- [Java Rules Documentation](https://rules.sonarsource.com/java/)

### Semgrep
- [Semgrep](https://semgrep.dev/)
- [Getting Started](https://semgrep.dev/docs/getting-started/)
- [Writing Rules](https://semgrep.dev/docs/writing-rules/overview/)

### CHAOSS
- [Website](https://chaoss.community/)
- [Get Involved](https://chaoss.community/participate)
- [Metrics](https://github.com/chaoss/metrics)
- [Evolution Metrics Working Group](https://github.com/chaoss/wg-evolution)
- [Common Metrics Working Group](https://github.com/chaoss/wg-common)
- [Risk Metrics Working Group](https://github.com/chaoss/wg-risk)
- [Value Metrics Working Group](https://github.com/chaoss/wg-value)
- [Diversity & Inclusion Metrics Working Group](https://github.com/chaoss/wg-diversity-inclusion)

## Technical Resources

### Git & GitHub
- [How to contribute to Open Source](https://opensource.guide/how-to-contribute/)
- [GitHub's Git Handbook](https://guides.github.com/introduction/git-handbook/)
- [GitHub's "Hello World" tutorial](https://guides.github.com/activities/hello-world/)
- [Understanding the GitHub Flow](https://guides.github.com/introduction/flow/)
- [Commit message style guidelines](https://commit.style/)
- [No-nonsense Git reference](https://rogerdudler.github.io/git-guide/) (best to have a cursory understanding of Git before hand)