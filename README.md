# Java Projects

Java projects and exercises from learning object-oriented programming: terminal and graphical games,
a banking application with an MVC menu, data structures with tests, networking, and concurrency.

## Projects

| Project | What it is |
|---|---|
| `BPI2.0/` | Banking application: customers, checking and savings accounts, deposits and withdrawals, with an MVC terminal menu and unit tests |
| `car-crash-extended/` | Grid-based car crash game with several car types, collision detection, and both a graphical and a terminal (Lanterna) renderer |
| `guessgame/`, `guessgamefinal/` | Number-guessing game between players |
| `hotelsim/` | Hotel simulation: guests checking in and out of rooms |
| `arabiannight/` | Genies and magic lamps: an inheritance and polymorphism exercise |
| `exceptions/` | File manager with custom checked exceptions |
| `linkedlist/` | Generic linked list implementation with tests |
| `functional-linkedlist/` | Linked list with `map`, `filter` and `reduce` using lambdas |
| `insertionsorting/` | Search, sort and palindrome algorithms (JavaScript) |
| `java-exercises/` | Small warm-up exercises |

### `java-oop/`

Smaller exercises grouped by topic:

| Topic | Folders |
|---|---|
| Games | `InterfaceGame`, `Game`, `SniperEliteV30`, `Paint_2.0`, `sims7`, `HighScoreToTXT` |
| Networking | `TCP`, `UPD` (UDP), `HTMLServer`, `ThreadServer`, `PingMe` |
| Concurrency | `Car-Crash/pizzeria-bqueue` (producer/consumer with a blocking queue) |
| Multiplayer game | `Car-Crash/21-stopgame-master` (a "Stop" word game over sockets) |
| Collections and functional style | `HashMap`, `map-filter-reduce`, `functional-linked-list`, `Range` |
| Basics | `helloworld`, `CopyPaste`, `PerfectNumbers`, `Exeption`, `ArabianNight` |

## Running

Each project is a standalone source folder. Open it in IntelliJ IDEA (or compile with `javac`) and add the
jars from its `lib/` folder to the classpath where there is one. Some projects use two small libraries
included as jars:

- **simplegraphics**: 2D graphics, keyboard and mouse input for the games
- **prompt-view**: terminal menus and input scanners for the bank application

Projects with a `build.xml` can also be built with Ant: `ant` from the project folder.
