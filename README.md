## Scala - Introduction
* Scala is JVM based programming language
* JVM – Java Virtual Machine is the abstraction layer between programming language and underlying operating system
* Scala programs will be compiled into Java byte code
* Even though Scala programs compiles into Java byte code – syntactically it is very different from Java
* Scala is open source and object oriented
* Scala’s syntax follow Functional programming paradigm
* Martin Odersky is the founder of the language and it is founded in Year 2001
* List of JVM based programming languages
    1. Groovy
    2. JRuby
    3. Jython
    4. Scala
    5. Clojure
    6. Kotlin

![Alt text](02JVMProgrammingLanguages.jpg?raw=true "JVM Programming Languages")

* Architecture of JVM based programming language

![Alt text](01JVMProgrammingLanguagesArchitecture.png?raw=true "JVM Programming Language - Architecture")

* Consolidated view of JVM based programming languages architecture

![Alt text](03JVMProgrammingLanguagesConslidatedView.png?raw=true "JVM Programming Language - Consolidated View")

## Scala - Setup development environment

* Setup of Scala - Install scala REPL (Read evaluate print loop) using https://scala-lang.org/download/

$scala

```
scala> :help
All commands can be abbreviated, e.g., :he instead of :help.
:edit <id>|<line>        edit history
:help [command]          print this summary or command-specific help
:history [num]           show the history (optional num is commands to show)
:h? <string>             search the history
:imports [name name ...] show import history, identifying sources of names
:implicits [-v]          show the implicits in scope
:javap <path|class>      disassemble a file or class name
:line <id>|<line>        place line(s) at the end of history
:load <path>             interpret lines in a file
:paste [-raw] [path]     enter paste mode or paste a file
:power                   enable power user mode
:quit                    exit the interpreter
:replay [options]        reset the repl and replay all previous commands
:require <path>          add a jar to the classpath
:reset [options]         reset the repl to its initial state, forgetting all session entries
:save <path>             save replayable session to a file
:sh <command line>       run a shell command (result is implicitly => List[String])
:settings <options>      update compiler options, if possible; see reset
:silent                  disable/enable automatic printing of results
:type [-v] <expr>        display the type of an expression without evaluating it
:kind [-v] <type>        display the kind of a type. see also :help kind
:warnings                show the suppressed warnings from the most recent line which had any

```

* Setup of Scala IDE - Install scala IDE under Intellij Idea OR Eclipse


* Setup SBT - Install SBT (Simple build tool) for building scala based project using http://www.scala-sbt.org/download.html

$sbt

```
> help
  help                                    Displays this help message or prints detailed help on requested commands (run 'help <command>').
  completions                             Displays a list of completions for the given argument string (run 'completions <string>').
  about                                   Displays basic information about sbt and the build.
  tasks                                   Lists the tasks defined for the current project.
  settings                                Lists the settings defined for the current project.
  reload                                  (Re)loads the current project or changes to plugins project or returns from it.
  new                                     Creates a new sbt build.
  projects                                Lists the names of available projects or temporarily adds/removes extra builds to the session.
  project                                 Displays the current project or changes to the provided `project`.
  set [every] <setting>                   Evaluates a Setting and applies it to the current project.
  session                                 Manipulates session settings.  For details, run 'help session'.
  inspect [uses|tree|definitions] <key>   Prints the value for 'key', the defining scope, delegates, related definitions, and dependencies.
  <log-level>                             Sets the logging level to 'log-level'.  Valid levels: debug, info, warn, error
  plugins                                 Lists currently available plugins.
  ; <command> (; <command>)*              Runs the provided semicolon-separated commands.
  ~ <command>                             Executes the specified command whenever source files change.
  last                                    Displays output from a previous command or the output from a specific task.
  last-grep                               Shows lines from the last output for 'key' that match 'pattern'.
  export <tasks>+                         Executes tasks and displays the equivalent command lines.
  exit                                    Terminates the build.
  early(<command>)                        Schedules a command to run before other commands on startup.
  show <key>                              Displays the result of evaluating the setting or task associated with 'key'.
  all <task>+                             Executes all of the specified tasks concurrently.

More command help available using 'help <command>' for:
  !, +, ++, <, alias, append, apply, eval, iflast, onFailure, reboot, shell

```

