val checkReloaded = taskKey[Unit]("Asserts that the build was reloaded")
checkReloaded := { () }

watchOnIteration := { _ => Watch.CancelWatch }
