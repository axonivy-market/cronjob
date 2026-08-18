# Cron-Job

Ein Cron-Job ist ein wiederkehrender Zeitplan für die Ausführung von Aufgaben.
Mit einem Cron-Job können Sie Zeitpläne wie „jeden Freitag um 12:00 Uhr“, „jeden
Wochentag um 9:30 Uhr“ oder sogar „jeden Montag, Mittwoch und Freitag im Januar
alle 5 Minuten zwischen 9:00 Uhr und 10:00 Uhr“ festlegen.

Das [Quartz-Framework](http://www.quartz-scheduler.org/) wird als zugrunde
liegendes Scheduler-Framework verwendet.

Weitere Informationen zu Cron-Ausdrücken finden Sie hier: [Lektion 6:
CronTrigger](http://www.quartz-scheduler.org/documentation/quartz-2.3.0/tutorials/tutorial-lesson-06.html)

## Demo

In dieser Demo wird CronByGlobalVariableTriggerStartEventBean als Java-Klasse
definiert, die im Ivy-Programmstartelement ausgeführt werden soll.

![Screenshot des Programmstartelements](ProgramStartElement.png "Screenshot des
Programmstartelements")

Diese Bean erhält einen Cron-Ausdruck über die als Cron-Ausdruck definierte
Variable und plant anhand dieses Ausdrucks.

![Screenshot der benutzerdefinierten
Editor-Benutzeroberfläche](customEditorUI.png "Screenshot der
benutzerdefinierten Editor-Benutzeroberfläche")

In dieser Demo definiert der Cron-Ausdruck die Zeit für den Start des Cron-Jobs,
der einfach alle 5 Sekunden ausgelöst wird.

```
demoStartCronPattern: 0/5 * * * * ?
```

## Setup

Für diese Demo ist keine spezielle Einrichtung erforderlich. Starten Sie einfach
die Engine und beobachten Sie die Protokollierung, die alle 5 Sekunden mit dem
folgenden Protokolleintrag aktualisiert wird:

```
Cron Job is started at: 2023-01-27 10:43:20.
```
