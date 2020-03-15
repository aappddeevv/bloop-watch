# bloop-watch

Watch for bloop compile completion status then react to the compilation status.

Arguments:

* --onSuccess COMMAND
* --onFailure COMMAND
* --onCompilationComplete COMMAND
* --noColors Colored output on supported terminals. Add this argument to prevent it.
* --noClear By default, clears the screen before reporting. Add this argument to prevent it.

## Install

Install using coursier as follows:

```sh
// description here
```

You should create a native image though by cloning the repo and using graal native-image:

```sh
git clone https://github.com/aaappddeevv/bloop-watch.git
cd bloop-watch
sbt graal-native-image:packageBin
```

## Usage

From the command line:

```sh
bloop-watch --onSuccess "do something"
```

## Other

The build server protocol (BSP) is documented here: https://github.com/build-server-protocol/build-server-protocol.

## License


[![GitHub license](https://img.shields.io/badge/license-MIT-lightgrey.svg?maxAge=2592000)](https://raw.githubusercontent.com/aappddeevv/bloop-watch/master/LICENSE)

MIT

