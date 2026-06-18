# Rock Paper Scissors

A console-based Rock, Paper, Scissors game written in Java with a big ASCII art welcome screen, full string input, and live score tracking.

## Preview

```
██████╗  ██████╗  ██████╗██╗  ██╗
██╔══██╗██╔═══██╗██╔════╝██║ ██╔╝
██████╔╝██║   ██║██║     █████╔╝ 
██╔══██╗██║   ██║██║     ██╔═██╗ 
██║  ██║╚██████╔╝╚██████╗██║  ██╗
╚═╝  ╚═╝ ╚═════╝  ╚═════╝╚═╝  ╚═╝
... (full ASCII banner on launch)

  ────────────────────────────────────────────────────
  Your choice  ▶  rock
  You       ➜  Rock
  Computer  ➜  Scissors

  ★  You WIN!

  Score  ▶  Wins: 1   Losses: 0   Ties: 0
  ────────────────────────────────────────────────────
```

## Features

- ASCII art welcome banner on launch (ROCK / PAPER / SCISSORS in block letters)
- Type the full word — `rock`, `paper`, or `scissors` — as your move
- Case-insensitive input with friendly error messages for invalid entries
- Computer picks a random move each round
- Live scoreboard showing Wins, Losses, and Ties after every round
- Type `quit` at any time to exit and see your final score
- Final score summary shown on exit

## Requirements

- Java 17 or higher

Check your version with:

```bash
java -version
```

If you don't have Java installed, download it from [https://adoptium.net](https://adoptium.net).

## Getting Started

1. Clone the repository

```bash
git clone https://github.com/your-username/rock-paper-scissors.git
cd rock-paper-scissors
```

2. Compile

```bash
javac src/Main.java -d bin
```

3. Run

```bash
java -cp bin Main
```

## How to Play

| Input | Action |
|---|---|
| `rock` | Play Rock |
| `paper` | Play Paper |
| `scissors` | Play Scissors |
| `quit` or `q` | Exit and show final score |

Rules: Rock beats Scissors · Scissors beats Paper · Paper beats Rock.

## Project Structure

```
rock-paper-scissors/
├── src/
│   └── Main.java
├── README.md
├── CONTRIBUTING.md
├── CODE_OF_CONDUCT.md
├── LICENSE
└── .gitignore
```

## Roadmap

- [ ] GUI version using Java Swing or JavaFX
- [ ] Best-of-N round modes (e.g. best of 5)
- [ ] Save scores to a file between sessions
- [ ] Smarter computer AI (tracks player patterns)
- [ ] Unit tests

## Contributing

Contributions are welcome! See [CONTRIBUTING.md](CONTRIBUTING.md) for guidelines.

## Code of Conduct

Please read [CODE_OF_CONDUCT.md](CODE_OF_CONDUCT.md) before participating.

## License

MIT License — see [LICENSE](LICENSE) for details.
