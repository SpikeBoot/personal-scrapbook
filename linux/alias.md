
```shell
alias l='ls -la'
alias d='docker '
alias dc='docker-compose '
alias dcu='docker-compose up -d'
alias dcd='docker-compose down'
alias dcdv='docker-compose down -v'
alias dex='docker exec -it '
alias gw='./gradlew --parallel '
alias gwforce='./gradlew --parallel --no-build-cache --rerun'
alias gwcompile='./gradlew assem testClasses --parallel'
alias gwprot='./gradlew genProt --parallel'
alias gwfullrebuild='./gradlew clean assemble testClasses --rerun --no-build-cache --parallel'

alias rebuild='./gradlew assemble testClasses'
alias dlatest='docker ps --latest -q'
```


1. Перевірити яка оболонка використовується в терміналі:

```shell
echo $SHELL
```

2. Якщо `/bin/zsh` то додаємо alias до `.zprofile` в домашній директорії, виду: `alias <name>='command'`
