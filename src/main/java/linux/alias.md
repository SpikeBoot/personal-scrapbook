# Alias

```shell
# linux
alias l='ls -la'

# docker
alias d='docker '
alias dc='docker-compose '
alias dcu='docker-compose up -d'
alias dcd='docker-compose down'
alias dcdv='docker-compose down -v'
alias dex='docker exec -it '
alias dlatest='docker ps --latest -q'

# gradle
alias gw='./gradlew --parallel '
alias gwforce='./gradlew --parallel --no-build-cache --rerun'
alias gwcompile='./gradlew assem testClasses --parallel'
alias gwprot='./gradlew genProt --parallel'
alias gwfullrebuild='./gradlew clean assemble testClasses --rerun --no-build-cache --parallel'
alias rebuild='./gradlew assemble testClasses'
```


1. Чтобы проверить какая оболочка используется в терминале:

```shell
echo $SHELL
```

2. Если `/bin/zsh` то добавляем alias в `.zprofile` в в домашней директории, такого вида: `alias <name>='command'`
