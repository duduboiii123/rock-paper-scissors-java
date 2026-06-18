# Contributing to Rock Paper Scissors

Thanks for your interest in contributing! This document covers how to set up the project, propose changes, and submit pull requests.

## Ways to Contribute

- Report bugs by opening an issue
- Suggest new features or improvements
- Improve documentation
- Submit code via pull requests (fixes, features, refactors, tests)

## Getting Started

1. Fork the repository on GitHub
2. Clone your fork locally

```bash
git clone https://github.com/your-username/rock-paper-scissors.git
cd rock-paper-scissors
```

3. Create a new branch for your change

```bash
git checkout -b feature/short-description
```

Use a prefix that matches the change type, e.g. `feature/`, `fix/`, `docs/`, or `refactor/`.

4. Make your changes, then compile and test locally

```bash
javac src/*.java -d bin
java -cp bin Main
```

5. Commit your changes with a clear message

```bash
git commit -m "Add: brief description of the change"
```

6. Push to your fork and open a pull request against `main`

```bash
git push origin feature/short-description
```

## Coding Guidelines

- Follow standard Java naming conventions (`PascalCase` for classes, `camelCase` for methods/variables)
- Keep methods focused and reasonably short
- Add comments for non-obvious logic
- Avoid introducing new dependencies unless discussed in an issue first
- Keep formatting consistent with the rest of the codebase (4-space indentation)

## Pull Request Checklist

Before submitting a PR, please make sure:

- [ ] The code compiles without errors or warnings
- [ ] You've tested the game manually (or added tests, if applicable)
- [ ] Your branch is up to date with `main`
- [ ] The PR description explains what changed and why
- [ ] Related issues are linked (e.g. `Closes #12`)

## Reporting Bugs

When filing a bug report, please include:

- Steps to reproduce the issue
- Expected behavior vs. actual behavior
- Your Java version (`java -version`) and OS
- Any relevant error messages or stack traces

## Suggesting Features

Open an issue describing the feature, why it would be useful, and (optionally) how you imagine it working. This helps avoid duplicate work and lets maintainers weigh in before code is written.

## Code of Conduct

By participating in this project, you agree to follow the [Code of Conduct](CODE_OF_CONDUCT.md).

## Questions

If anything is unclear, feel free to open an issue with the `question` label.
