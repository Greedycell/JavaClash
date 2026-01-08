# JavaClash
Open source Java 15 Clash of Clans server for version 13!

##### Need help? Join my [Discord Server](https://discord.gg/YuV4PbwX99) or Vitalik's [Discord Server](https://discord.gg/UjfNxMt82F)

## How to start
#### Requirements:
- [JDK 15](https://www.oracle.com/ru/java/technologies/javase-jdk15-downloads.html)
- [Patched APK](https://drive.google.com/file/d/19YtdWWQ7iY_Y_FY8V-YBQAFs_vZJW8Qs/view?usp=sharing)

Next step you need to compile the server.

```
git clone https://github.com/Greedycell/JavaClash.git
cd JavaClash
javac -d out (Get-ChildItem -Recurse -Filter *.java | % FullName)
```
     
To run the server use these commands in Powershell (Administrator) or Terminal:

```
java -cp out com.xeon.javaclash.Main
```

### What's working?
- Alliances (creating, leaving, join)
- Attack NPC
- Buy resources
- Chat commands


## Need help?
Contact me on Discord (Xeon-DEV#9984) or open an issue.
