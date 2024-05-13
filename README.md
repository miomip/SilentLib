# SilentLib
> ### *Created by Silent Sky*
---
### What is this?
SilentLib is a library mainly focused on making behind stage functions like styling terminal text easier.

 :warning: **Warning:** I'm Norwegian :norway:, my English might be bad sometimes
 
> - - - > - - - > - - - >


### Features
#### ANSI colors
* ANSI colors. Usage:
```Kotlin
println(Colors.blue + "Hello, World!" + Colors.resetColor)
```

---

#### styledText
* styledText. Usege:
``` Kotlin
styledText("Hello, World!", Colors.blue)
```
  - Some problems with it geting long when using multiple attributes. <br>
  Like this:
``` Kotlin
styledText("Hello, World!", Colors.blue + Colors.backgroundCyan + Colors.bold + Colors.italic + Colors.underline)
```
<br>
  And it lack the functionality of selecting where in the text the colors should apply
  
  ---
#### Excition

* Excition. Usage:
``` Kotlin
  if(!working){
    Excition() //Kills the program without anything stopping it.
  }
```

<br>

> - - - > - - -

<br>

<br><br>
**⚠️Experimental⚠️**
* Pretty much all logging functions aren't fully developed or just a bad idea.
* 🌲🌳🐦‍⬛ &nbsp; 🐦‍⬛💐🐦‍⬛🌲🌲 &nbsp; 🐦‍⬛ 🌲🦡 🏞🌳💐🌳🐌 🌲🐦‍⬛🏔🕷🌳🏕 &nbsp;🌲🧸🌲🌳 &nbsp; 🌲🐦‍⬛🌳 🐦‍⬛ 🌲🦊🌳💐 (I got bored)
---
<br>

### ? Maybe section ?

:memo: **Note:** I might never add these things.
1. Python version
2. C version
3. Kotlin native version
4. Kotlin JS version
5. Graphical calculation functions for three dimentions
6. Graphical calculation functions for two dimentions
7. A calculator function
8. QOL functions for SQL
9. QOL functions for Kotlin Multiplatform
10. QOL functions for Android development
12. QOL functions for Spring and Ktor
13. QOL functions for working with markdown using Kotlin
14. Anything IOS related
15. Function for handling of user input. (To avoid if statements for every single input)
16. Doom
 
> - - - > - - -
<br>

### Stability
The condition is simply 🟩 for working as intended and easy to work with, <br>
🔶 for bit jancky or challenging to work with, but no high security risico, <br>
and 🔴 for broken, not working or hard to work with, and or high security risico.

| Feature | Stability | Condition |
| ----------- | :-----------: | :--: |
| styledText() | Unstable | 🔶 |
| Logging | Unstable | 🔴 |
| Excition() | Unstable | 🔴 |
| Annontation | Undone| 🟩 |

--- 

### Todo
- [ ] Refine styledText with better selection compatability and easier implementation of multiple color attributes.
- [ ] Refine the Colors class to be easier to use, and multiple pick using + or something.
- [ ] Make it a library. (Don't know how yet, I'll fix it when I need to)
- [ ] Started project
- [x] Add README.md

