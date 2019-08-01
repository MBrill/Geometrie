# Geometrie
Unser Standardbeispiel für die Online-Phase der Lehrveranstaltung 
Software Management Grundlagen im Studiengang IT-Analyst. 
Wir werden dieses kleine Java-Projekt verwenden, um mit git zu arbeiten, 
die Quellen zu dokumentieren, 
mit Logging-Aufrufen zu versehen und mit Jenkins ein Build durchzuführen.

Dieser branch enthält eine Version des Projekts, die mit Ant gebaut werden kann. 
Die Datei build.xml enthält die folgenden targets:

- makedir erstellt die benötigten Verzeichnisse.
- compile erstellt die class-files im Verzeichnis bin.
- jar erstellt eine jar-Datei im Verzeichnis dist.
- run führt die Anwendung FirstScene auf der Basis der jar-Datei aus.
- runFirst ist identische mit run und führt die Anwendung FirstScene aus.
- runDistances führt die Anwendung Distances aus, ebenfalls auf Basis der jar-Datei.
- clean räumt das Verzeichnis auf.
