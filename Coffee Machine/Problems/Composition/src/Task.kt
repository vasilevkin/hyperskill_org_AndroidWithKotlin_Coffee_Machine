class OperatingSystem(var name: String = "No name")

class DualBoot(var primaryOs: OperatingSystem = OperatingSystem("macOS"),
               var secondaryOs: OperatingSystem = OperatingSystem("Windows"))

// write the classes here