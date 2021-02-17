# AdBump


## Usage

# Quick start
 Добавить в свой xml AdBump
 
# XML

```xml
<tv.limehd.adbump.AdBump
        android:id="@+id/adBump"
        android:visibility="visible"
        android:layout_width="match_parent"
        android:layout_height="match_parent" />
```
# Java

```java
AdBump adBump = findViewById(R.id.adBump); //находим View
AdBumpInterface adBumpInterface = adBump.getWebViewInterface(); 
// Получаем интерефейс для работа с AdBump
```
### Подготавливаем AdBump к показу

```java
adBumpInterface.loadHtmlFile("file:///android_asset/test.html"); // Даем ссылку на HTML
adBumpInterface.setMusicFile(R.raw.music); // ID композиции
adBumpInterface.playAndShow(); // показать и начать воспроизведение
```

### Скрыть и остановить воспроизведение

```java
adBumpInterface.stopAndHide();
```

### Управление музыкой

```java
adBumpInterface.playMusic(); // Начать/продолжить воспроизведение
adBumpInterface.stopMusic(); //Остановить воспроизведение 
```

### Управление показом AdBump

```java
adBumpInterface.show(); // Показать
adBumpInterface.hide(); // Скрыть
```

### Перезагрузить страницу

```java
adBumpInterface.reloadWebView();
```

###  Уничтожить AdBump 

```java
adBumpInterface.destroyWebView();
```

## Important
Добавить это разрешение:

```xml
<uses-permission android:name="android.permission.INTERNET"/>
```